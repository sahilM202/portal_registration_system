package com.example.portal_registration_system.controller;

import com.example.portal_registration_system.model.ContactDto;
import com.example.portal_registration_system.model.PeopleDto;
import com.example.portal_registration_system.service.PeopleService;
import jakarta.validation.Valid;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/people")
@Data
public class PeopleController {
    private final PeopleService peopleService;

    @GetMapping("people/{id}")
    public PeopleDto getHuman(@PathVariable Integer id) {
        return peopleService.getHuman(id);
    }

    @GetMapping("get/list")
    public List<PeopleDto> getPeople() {
        return peopleService.getPeople();
    }

    @DeleteMapping("delete/{id}")
    public void deletePeopleById(@PathVariable Integer id) {
        peopleService.deletePeopleById(id);
    }

    @DeleteMapping("delete")
    public void deletePeople(@RequestBody PeopleDto peopleDto) {
        peopleService.deletePeople(peopleDto);

    }
}
