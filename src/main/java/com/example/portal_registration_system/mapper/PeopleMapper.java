package com.example.portal_registration_system.mapper;

import com.example.portal_registration_system.dao.PeopleEntity;
import com.example.portal_registration_system.model.PeopleDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PeopleMapper {
  PeopleMapper mapper = Mappers.getMapper(PeopleMapper.class);
     @Mapping(target = "passportType", source = "passportEntity.passportType")
     @Mapping(target = "serialNumber", source = "passportEntity.serialNumber")
     @Mapping(target = "fin", source = "passportEntity.fin")
     @Mapping(target = "number", source = "contactEntity.number")
     @Mapping(target = "email", source = "contactEntity.email")
     PeopleDto mapEntityToDto(PeopleEntity peopleEntity);
     PeopleEntity mapDtoToEntity(PeopleDto peopleDto);
}
