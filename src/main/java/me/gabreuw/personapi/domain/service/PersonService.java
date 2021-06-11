package me.gabreuw.personapi.domain.service;

import lombok.RequiredArgsConstructor;
import me.gabreuw.personapi.api.dto.PersonDTO;
import me.gabreuw.personapi.api.mapper.PersonMapper;
import me.gabreuw.personapi.domain.model.Person;
import me.gabreuw.personapi.domain.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Service
public class PersonService {

    private final PersonRepository REPOSITORY;
    private final PersonMapper MAPPER;

    public PersonDTO save(Person person) {
        var savedPerson = REPOSITORY.save(person);

        return MAPPER.toDTO(savedPerson);
    }

}
