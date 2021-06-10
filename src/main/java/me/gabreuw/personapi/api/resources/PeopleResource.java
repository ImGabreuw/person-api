package me.gabreuw.personapi.api.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/people")
public class PeopleResource {

    @GetMapping
    public String getBook() {
        return "API Test!";
    }

}
