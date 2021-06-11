package me.gabreuw.personapi.domain.repository;

import me.gabreuw.personapi.domain.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {}