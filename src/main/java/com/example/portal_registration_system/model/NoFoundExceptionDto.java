package com.example.portal_registration_system.model;

import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
@Data
public class NoFoundExceptionDto {

    Integer exceptionId;
    String exceptionMessage;

}
