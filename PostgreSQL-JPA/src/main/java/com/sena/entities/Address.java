package com.sena.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "address")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = {"id"})
@ToString
public class Address implements Serializable {


    @Id //primary key is required
    @SequenceGenerator(name= "seq_address", allocationSize = 1)
    @GeneratedValue(generator = "seq_address", strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(name= "address", length = 500)
    private String address;

    @Enumerated
    private AddressType addressType;

    @Column(name="active")
    private boolean isActive;

    public enum AddressType{
        HOME_ADDRESS,
        OFFICE_ADDRESS,
        OTHER
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "person_address")
    @ToString.Exclude
    private Person person;

}
