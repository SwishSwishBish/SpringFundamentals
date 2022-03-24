package com.sena.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "person")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = {"id"})
@ToString
public class Person {
    @Id
    @SequenceGenerator(name = "seq_person", allocationSize = 1)
    @GeneratedValue(generator = "seq_person", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name= "lastname", length = 50)
    private String lastname;

    //join process
    @OneToMany
    @JoinColumn(name="person_address")
    @ToString.Exclude
    private List<Address> addresses;
}
