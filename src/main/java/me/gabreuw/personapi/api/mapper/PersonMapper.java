package me.gabreuw.personapi.api.mapper;

import me.gabreuw.personapi.api.dto.PersonDTO;
import me.gabreuw.personapi.domain.model.Person;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    PersonDTO toDTO(Person person);

    Person toEntity(PersonDTO personDTO);

}
