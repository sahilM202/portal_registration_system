package com.example.portal_registration_system.mapper;


import com.example.portal_registration_system.dao.PassportEntity;
import com.example.portal_registration_system.model.PassportDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper
public interface PassportMapper {
    PassportMapper Instance
            = Mappers.getMapper(PassportMapper.class);

    PassportDto EntityToDto(PassportEntity passportEntity);
    PassportEntity DtoToEntity(PassportDto passportDto);
}
