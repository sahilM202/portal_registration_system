package com.example.portal_registration_system.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PassportDto {
    private  Integer id;
    private PassportType passportType;
    private String SerialNumber;
    private String fin;
}
