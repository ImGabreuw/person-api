package me.gabreuw.personapi.api.mapper;

import me.gabreuw.personapi.api.dto.PersonDTO;
import me.gabreuw.personapi.domain.model.Person;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    PersonDTO toDTO(Person person);

    List<PersonDTO> toCollectionDTO(List<Person> people);

    Person toEntity(PersonDTO personDTO);


}
