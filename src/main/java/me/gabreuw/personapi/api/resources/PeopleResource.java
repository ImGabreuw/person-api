package me.gabreuw.personapi.api.resources;

import lombok.RequiredArgsConstructor;
import me.gabreuw.personapi.api.dto.PersonDTO;
import me.gabreuw.personapi.domain.model.Person;
import me.gabreuw.personapi.domain.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/people")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class PeopleResource {

    private final PersonService SERVICE;

    @PostMapping
    public ResponseEntity<PersonDTO> createPerson(@RequestBody Person person) {
        return ResponseEntity
                .ok()
                .body(SERVICE.save(person));
    }

}
