package kg.it.service;

import kg.it.entity.Lists;

import java.util.List;

public interface ListService {
    Lists create(Lists lists);
    Lists update(Lists lists);
    Lists getById(Long id);
    Lists deleteById(Long id);
    List<Lists> getAll();
    List<Lists> getAllByCafe(String cafe);
    List<Lists> getAllByDeliveryMan(String deliveryman);
    List<Lists> getAllByCustomers(String customers);
}
