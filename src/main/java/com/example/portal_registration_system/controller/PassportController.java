package com.example.portal_registration_system.controller;

import com.example.portal_registration_system.model.PassportDto;
import com.example.portal_registration_system.service.PassportService;
import jakarta.validation.Valid;
import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/passports")
@Data
public class PassportController {
    private final PassportService passportService;

    @GetMapping("/passport/{id}")
    public PassportDto getPassport(@PathVariable Integer id) {
        return passportService.getPassport(id);
    }
    @DeleteMapping("/delete-passport/{id}")
    public void deletePassportById(@PathVariable Integer id){
        passportService.deletePassportByID(id);
    }
    @DeleteMapping("delete/passport")
    public void deletePassport(@PathVariable PassportDto passportDto){
        passportService.deletePassport(passportDto);
    }
}
