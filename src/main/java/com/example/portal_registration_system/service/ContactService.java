package com.example.portal_registration_system.service;

import com.example.portal_registration_system.dao.ContactEntity;
import com.example.portal_registration_system.exception.NoContactFoundException;
import com.example.portal_registration_system.exception.NoPassportFoundException;
import com.example.portal_registration_system.mapper.ContactMapper;
import com.example.portal_registration_system.model.ContactDto;
import com.example.portal_registration_system.repository.ContactRepository;
import jakarta.validation.Valid;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@Data
public class ContactService {
    private final ContactRepository contactRepository;
    public ContactDto getContact(Integer id){
        var entity=contactRepository.findById(id).orElseThrow();

        return ContactMapper.Instance.mapEntityDto(entity);
    }

    public void addContact( ContactEntity contactEntity){
        contactRepository.save(contactEntity);


    }
    public void deleteContact(Integer id ){

        contactRepository.deleteById(id);
    }


}
