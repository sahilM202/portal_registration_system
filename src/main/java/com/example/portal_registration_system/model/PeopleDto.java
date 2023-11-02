package com.example.portal_registration_system.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PeopleDto {
    private Integer id;
    private String name;
    private String surname;
    private Integer age;
    private  String passportType;
    private String serialNumber;
    private  String fin;
    private String number;
    private String email;
}
