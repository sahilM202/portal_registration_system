package com.example.portal_registration_system.service;


import com.example.portal_registration_system.dao.PassportEntity;
import com.example.portal_registration_system.exception.NoPassportFoundException;
import com.example.portal_registration_system.mapper.PassportMapper;
import com.example.portal_registration_system.model.PassportDto;
import com.example.portal_registration_system.repository.PassportRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Data
@Slf4j
public class PassportService {
   private final PassportRepository passportRepository;


   public PassportDto getPassport(Integer id){
       var entity= passportRepository.findById(id).orElseThrow();
       return PassportMapper.Instance.EntityToDto(entity);
   }
    public void addPassport(PassportEntity passportEntity){
       passportRepository.save(passportEntity);


    }

    public void deletePassportByID(Integer id ){
       passportRepository.deleteById(id);
    }

    public void deletePassport(PassportDto passportDto){
       var entity=PassportMapper.Instance.DtoToEntity(passportDto);
       passportRepository.delete(entity);
    }

//    public PassportDto getPassportBySerialNumberAndFinn(String fin, String serialNumber){
//      var entity=passportRepository.findByFinAndSerialNumber(fin, serialNumber);
//      return PassportMapper.Instance.EntityToDto(entity);
//    }

}
