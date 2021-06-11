package me.gabreuw.personapi.api.mapper;

import lombok.RequiredArgsConstructor;
import me.gabreuw.personapi.api.dto.PersonDTO;
import me.gabreuw.personapi.domain.model.Person;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Component
public class PersonMapper {

    private final ModelMapper MODEL_MAPPER;

    public PersonDTO toDTO(Person person) {
        return MODEL_MAPPER.map(person, PersonDTO.class);
    }

    public Person toEntity(PersonDTO personDTO) {
        return MODEL_MAPPER.map(personDTO, Person.class);
    }

}
