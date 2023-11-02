package com.example.portal_registration_system.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ContactDto {
    private  Integer id;
    private String number;
    private String email;
}
