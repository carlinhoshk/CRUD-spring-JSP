package io.github.carlinhoshk.springjsp.repository;

import io.github.carlinhoshk.springjsp.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {
}
