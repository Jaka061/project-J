package kg.it.service;

import kg.it.entity.Lists;
import kg.it.repository.ListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListServiceIml implements ListService {
    @Autowired
    private ListRepository listRepository;


    @Override
    public Lists create(Lists lists) {
        return listRepository.save(lists);
    }

    @Override
    public Lists update(Lists lists) {
        return listRepository.save(lists);
    }

    @Override
    public Lists getById(Long id) {
        return listRepository.findById(id).orElse(null);
    }

    @Override
    public Lists deleteById(Long id) {
        Lists lists = getById(id);
        if (lists != null){
            listRepository.deleteById(id);
        }
        return null;
    }

    @Override
    public List<Lists> getAll() {
        return listRepository.findAll();
    }

    @Override
    public List<Lists> getAllByCafe(String cafe) {
        return listRepository.findAllByCafe_NameContainingIgnoringCase(cafe);
    }

    @Override
    public List<Lists> getAllByDeliveryMan(String deliveryman) {
        return listRepository.findAllByDeliveryMan_NameContainingIgnoringCase(deliveryman);
    }

    @Override
    public List<Lists> getAllByCustomers(String customers) {
    return listRepository.findAllByCustomer_LoginContainingIgnoringCase(customers);
    }
}
