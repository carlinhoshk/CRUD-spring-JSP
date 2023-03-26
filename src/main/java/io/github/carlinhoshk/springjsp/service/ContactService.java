package io.github.carlinhoshk.springjsp.service;

import java.util.List;
import java.util.Optional;

import io.github.carlinhoshk.springjsp.model.Contact;
import io.github.carlinhoshk.springjsp.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    public List<Contact> findAll(){
        return contactRepository.findAll();
    }

    public Optional<Contact> findById(int id){
        return contactRepository.findById(id);
    }

    public Contact saveContact(Contact contact){
        return contactRepository.save(contact);
    }

    public Contact updateContact(int id, Contact contact){
        Contact updateContact = contactRepository.findById(id).orElse(null);
        updateContact.setName(contact.getName());
        updateContact.setEmail(contact.getEmail());
        updateContact.setCountry(contact.getCountry());
        return contactRepository.save(updateContact);
    }

    public void deletByid(int id){
        contactRepository.deleteById(id);
    }
}
