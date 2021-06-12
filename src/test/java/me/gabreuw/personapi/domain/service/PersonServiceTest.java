package me.gabreuw.personapi.domain.service;

import me.gabreuw.personapi.api.dto.PersonDTO;
import me.gabreuw.personapi.domain.model.Person;
import me.gabreuw.personapi.domain.repository.PersonRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static me.gabreuw.personapi.common.utils.PersonUtils.createFakeDTO;
import static me.gabreuw.personapi.common.utils.PersonUtils.createFakeEntity;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class PersonServiceTest {

    @Mock
    private PersonRepository repository;

    @InjectMocks
    private PersonService service;

    @Test
    void testGivenPersonDTOThenReturnSavedMessage() {
        var expectedSavedPersonDTO = createFakeDTO();
        var expectedSavedPerson = createFakeEntity();

        when(repository.save(any(Person.class))).thenReturn(expectedSavedPerson);

        var savedPersonDTO = service.save(createFakeDTO());

        assertEquals(expectedSavedPerson, savedPersonDTO);
    }
}
