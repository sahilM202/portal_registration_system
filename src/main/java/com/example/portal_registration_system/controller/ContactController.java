package com.example.portal_registration_system.controller;

import com.example.portal_registration_system.dao.ContactEntity;
import com.example.portal_registration_system.model.ContactDto;
import com.example.portal_registration_system.service.ContactService;
import jakarta.validation.Valid;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contacts")
@Data
@Validated
public class ContactController {

    private final ContactService contactService;
    @GetMapping("/{id}")
    public ContactDto getContact(@PathVariable Integer id){
       return contactService.getContact(id);
    }
//    @PostMapping("/add")
//    @ResponseStatus(HttpStatus.CREATED)
//    ResponseEntity<String> saveContact(
//            @Valid  @RequestBody ContactEntity contactEntity ){
//        contactService.addContact(contactEntity);
//        return ResponseEntity.ok("ContactAdding");
//    }
    @DeleteMapping("/delete")
    public  void deleteContact(@PathVariable Integer id ){
        contactService.deleteContact(id);
    }

}
