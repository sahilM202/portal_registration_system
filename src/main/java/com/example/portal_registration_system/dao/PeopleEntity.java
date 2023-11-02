package com.example.portal_registration_system.dao;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "people")
public class PeopleEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    private String name;

    private String surname;
    private  Integer age;
    private Integer passportId;
    @OneToOne
    @JoinColumn(name ="id")
    private  PassportEntity passportEntity;
    private Integer contactId;
    @OneToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "id")
    private ContactEntity contactEntity;

}
