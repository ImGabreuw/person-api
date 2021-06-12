package me.gabreuw.personapi.api.resources;

import lombok.RequiredArgsConstructor;
import me.gabreuw.personapi.api.dto.PersonDTO;
import me.gabreuw.personapi.domain.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/people")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class PeopleResource {

    private final PersonService SERVICE;

    @PostMapping
    public ResponseEntity<PersonDTO> createPerson(@RequestBody @Valid  PersonDTO personDTO) {
        var savedPerson = SERVICE.save(personDTO);
        var personCreatedURI = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedPerson.getId())
                .toUri();

        return ResponseEntity
                .created(personCreatedURI)
                .body(savedPerson);
    }

    @GetMapping
    public List<PersonDTO> listAll() {
        return SERVICE.listAll();
    }

}
