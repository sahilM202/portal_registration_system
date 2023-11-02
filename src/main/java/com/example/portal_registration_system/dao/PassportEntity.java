package com.example.portal_registration_system.dao;

import com.example.portal_registration_system.model.PassportType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "passport")
public class PassportEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    @NotEmpty(message = "passportType not null")
    private String passportType;
    @NotEmpty(message = "serialNumber not null")
    private String serialNumber;
    @NotEmpty(message = "fin not null")
    private String fin;

}
