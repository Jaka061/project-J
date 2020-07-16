package kg.it.controler;

import kg.it.entity.Contacts;
import kg.it.service.ContactsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contacts")
public class ContactsController {
    @Autowired
    private ContactsService contactsService;

    @PostMapping
    public Contacts create(@RequestBody Contacts contacts){
        return contactsService.create(contacts);
    }

    @PutMapping
    public Contacts update(@RequestBody Contacts contacts){
        return contactsService.create(contacts);
    }

    @GetMapping("/id/{id}")
    public Contacts getById(@PathVariable Long id){
        return contactsService.getById(id);
    }
}
