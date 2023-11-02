package com.example.portal_registration_system.repository;

import com.example.portal_registration_system.dao.ContactEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends CrudRepository<ContactEntity,Integer> {
}
