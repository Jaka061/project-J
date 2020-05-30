package kg.it.service;

import kg.it.entity.Address;

import java.util.List;

public interface AddressService {
    Address getById(Long id);
    Address create(Address address);
    Address deleteById(Long id);
    Address update(Address address);
    List<Address> getAllByCity(String city);
    List<Address> getAll();

}
