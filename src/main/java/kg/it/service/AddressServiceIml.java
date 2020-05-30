package kg.it.service;

import kg.it.entity.Address;
import kg.it.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceIml implements AddressService {
    @Autowired
    private AddressRepository addressRepository;

    @Override
    public Address getById(Long id) {
        return addressRepository.findById(id).orElse(null);
    }

    @Override
    public Address create(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public Address deleteById(Long id) {
        Address address= getById(id);
        if (address != null){
            addressRepository.deleteById(id);
        }
        return null;
    }

    @Override
    public Address update(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public List<Address> getAllByCity(String city) {
        return addressRepository.findAllByCityContainingIgnoringCase(city);
    }

    @Override
    public List<Address> getAll() {
        return addressRepository.findAll();
    }
}
