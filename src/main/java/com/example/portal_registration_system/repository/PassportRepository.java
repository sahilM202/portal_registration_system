package com.example.portal_registration_system.repository;

import com.example.portal_registration_system.dao.PassportEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassportRepository extends CrudRepository<PassportEntity,Integer> {
}
