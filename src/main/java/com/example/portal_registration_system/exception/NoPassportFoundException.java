package com.example.portal_registration_system.exception;

public class NoPassportFoundException extends RuntimeException {
   public NoPassportFoundException(String massage){
        super(massage);
    }
}
