package com.sena.constroller;

import com.sena.dto.PersonDto;
import com.sena.services.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonAPI {

    private final PersonService personService;

    @PostMapping
    public ResponseEntity<PersonDto> save(@RequestBody PersonDto personDto){
        return ResponseEntity.ok(personService.save(personDto));
    }

    @GetMapping
    public ResponseEntity<List<PersonDto>> listAll(){
        return ResponseEntity.ok(personService.getAll());
    }
}
