package kg.it.service;

import kg.it.entity.Contacts;

import java.util.List;

public interface ContactsService {
    List<Contacts> getAll();
    Contacts getById(Long id);
    Contacts create(Contacts contacts);
//    Contacts update(Contacts contacts);
//    Contacts deleteById(Long id);

}
