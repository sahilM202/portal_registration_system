package com.example.portal_registration_system.mapper;

import com.example.portal_registration_system.dao.ContactEntity;
import com.example.portal_registration_system.model.ContactDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ContactMapper {
  ContactMapper  Instance
            = Mappers.getMapper(ContactMapper.class);

    ContactDto mapEntityDto(ContactEntity contactEntity);
    ContactEntity mapDtoEntity(ContactDto contactDto);

}
