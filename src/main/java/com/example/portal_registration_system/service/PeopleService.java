package com.example.portal_registration_system.service;

import com.example.portal_registration_system.dao.PassportEntity;
import com.example.portal_registration_system.dao.PeopleEntity;
import com.example.portal_registration_system.exception.NotPeopleFoundException;
import com.example.portal_registration_system.mapper.PeopleMapper;

import com.example.portal_registration_system.model.PeopleDto;
import com.example.portal_registration_system.repository.PeopleRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Data
@Service
public class PeopleService {
    private final PeopleRepository peopleRepository;

    public PeopleDto getHuman(Integer id) {
        var entity = peopleRepository.findById(id).orElseThrow(() -> new RuntimeException("Human_Not_Found"));
        return PeopleMapper.mapper.mapEntityToDto(entity);
    }

    public void saveHuman(PeopleDto peopleDto) {
       var entity=PeopleMapper.mapper.mapDtoToEntity(peopleDto);
       peopleRepository.save(entity);
    }
    public void deletePeopleById (Integer id){
        peopleRepository.deleteById(id);
    }
    public void deletePeople(PeopleDto peopleDto){
        var entity=PeopleMapper.mapper.mapDtoToEntity(peopleDto);
        peopleRepository.delete(entity);
    }
    public  List<PeopleDto> getPeople(){
        var entityList=(List<PeopleEntity>)peopleRepository.findAll();
        var listDto=entityList.stream().map(peopleEntity ->
                PeopleMapper.mapper.mapEntityToDto(peopleEntity)).collect(Collectors.toList());
        return listDto;
    }
}





