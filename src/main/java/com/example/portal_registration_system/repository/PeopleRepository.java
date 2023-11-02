package com.example.portal_registration_system.repository;

import com.example.portal_registration_system.dao.PeopleEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleRepository extends CrudRepository<PeopleEntity,Integer> {

}
