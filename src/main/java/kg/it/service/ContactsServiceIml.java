package kg.it.service;

import kg.it.entity.Contacts;
import kg.it.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ContactsServiceIml implements ContactsService{
    @Autowired
    private ContactRepository contactRepository;

    @Override
    public List<Contacts> getAll() {
        return contactRepository.findAll();
    }

    @Override
    public Contacts getById(Long id) {
        return contactRepository.findById(id).orElse(null);
    }

    @Override
    public Contacts create(Contacts contacts) {
        return contactRepository.save(contacts);
    }
}
