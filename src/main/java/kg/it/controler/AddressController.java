package kg.it.controler;

import kg.it.entity.Address;
import kg.it.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/address")
public class AddressController {
    @Autowired
    private AddressService addressService;

    @GetMapping
    public List<Address> getAll(){
        return addressService.getAll();
    }

    @GetMapping("/id/{id}")
    public Address getById(@PathVariable Long id) {
        return addressService.getById(id);
    }
    @GetMapping("/city/{city}")
    public List<Address> getAllByCity (String city){
        return addressService.getAllByCity(city);
    }

    @PostMapping
    public Address create(@RequestBody Address address){
         return addressService.create(address);
    }

    @PutMapping
    public Address update(@RequestBody Address address){
        return addressService.update(address);
    }

    @DeleteMapping
    public Address deleteById(@RequestParam(name = "id") Long id){
        return  addressService.deleteById(id);
    }

}

