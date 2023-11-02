package com.example.portal_registration_system.controller.postController;

import com.example.portal_registration_system.dao.ContactEntity;
import com.example.portal_registration_system.dao.PassportEntity;
import com.example.portal_registration_system.dao.PeopleEntity;
import com.example.portal_registration_system.model.PassportDto;
import com.example.portal_registration_system.model.PeopleDto;
import com.example.portal_registration_system.service.ContactService;
import com.example.portal_registration_system.service.PassportService;
import com.example.portal_registration_system.service.PeopleService;
import jakarta.validation.Valid;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/post")
@Data
public class postController {
    private final PassportService passportService;
    private final ContactService contactService;
    private final PeopleService peopleService;
    @PostMapping("/addPassport")
    @ResponseStatus(HttpStatus.CREATED)
    ResponseEntity<String> addPassport(@Valid @RequestBody PassportEntity passportEntity){
        passportService.addPassport(passportEntity);
        return ResponseEntity.ok("PassportAdding");
    }
    @PostMapping("/add-human")
   public void addHuman(@RequestBody PeopleDto peopleDto){
        peopleService.saveHuman(peopleDto);

    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    ResponseEntity<String> saveContact(
            @Valid  @RequestBody ContactEntity contactEntity ){
        contactService.addContact(contactEntity);
        return ResponseEntity.ok("ContactAdding");
    }
}
