package me.gabreuw.personapi.domain.service;

import lombok.RequiredArgsConstructor;
import me.gabreuw.personapi.api.dto.PersonDTO;
import me.gabreuw.personapi.api.mapper.PersonMapper;
import me.gabreuw.personapi.domain.model.Person;
import me.gabreuw.personapi.domain.repository.PersonRepository;
import me.gabreuw.personapi.domain.service.exception.PersonNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Service
public class PersonService {

    private final PersonRepository REPOSITORY;
    private final PersonMapper MAPPER = PersonMapper.INSTANCE;

    public PersonDTO save(PersonDTO personDTO) {
        Person savedPerson = REPOSITORY.save(
                MAPPER.toEntity(personDTO)
        );

        return MAPPER.toDTO(savedPerson);
    }

    public List<PersonDTO> listAll() {
        return MAPPER.toCollectionDTO(
                REPOSITORY.findAll()
        );
    }

    public PersonDTO findById(Long id) {
        var recoveredPerson = verifyIfExists(id);

        return MAPPER.toDTO(recoveredPerson);
    }

    public void deleteById(Long id) {
        verifyIfExists(id);
        REPOSITORY.deleteById(id);
    }

    private Person verifyIfExists(Long id) {
        return REPOSITORY
                .findById(id)
                .orElseThrow(() -> new PersonNotFoundException(id));
    }

    public PersonDTO updateById(Long id, PersonDTO personDTO) {
        verifyIfExists(id);

        return save(personDTO);
    }
}
