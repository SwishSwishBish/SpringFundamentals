package com.sena.services.implementation;

import com.sena.dto.PersonDto;
import com.sena.entities.Address;
import com.sena.entities.Person;
import com.sena.repository.AddressRepository;
import com.sena.repository.PersonRepository;
import com.sena.services.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {
    private final PersonRepository personRepository;
    private final AddressRepository addressRepository;

    @Override
    @Transactional
    // start a brand new read-only transaction when this method is invoked, suspending any existing transaction
    public PersonDto save(PersonDto personDto) {

        Person person = new Person();
        person.setName(personDto.getName());
        person.setLastname(personDto.getLastname());
        final Person person1 = personRepository.save(person);

        List<Address> addressList = new ArrayList<>();

        personDto.getAddresses().forEach((item -> {
            Address address = new Address();
            address.setAddress(item);
            address.setAddressType(Address.AddressType.OTHER);
            address.setActive(true);
            address.setPerson(person1);
            addressList.add(address);
        }));

        addressRepository.saveAll(addressList);
        personDto.setId(person1.getId());
        return personDto;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<PersonDto> getAll() {
        List<Person> personList = personRepository.findAll();
        List<PersonDto> personDtos = new ArrayList<>();

        personList.forEach(item -> {
            PersonDto personDto = new PersonDto();
            personDto.setId(item.getId());
            personDto.setName(item.getName());
            personDto.setLastname(item.getLastname());
            personDto.setAddresses(
                    item.getAddresses() != null ?
                            item.getAddresses().stream().map(Address::getAddress).collect(Collectors.toList())
                            : null);
            personDtos.add(personDto);
        });
        return personDtos;
    }

    @Override
    public Page<PersonDto> getAll(Pageable pageable) {
        return null;
    }
}
