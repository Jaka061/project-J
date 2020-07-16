package kg.it.service;

import kg.it.entity.Foods;

import java.util.List;

public interface FoodsService {
    List<Foods> getAll();
    Foods getById(Long id);
    Foods create (Foods foods);
    Foods update  (Foods foods);
    Foods deleteById (Long id);

    List<Foods> getAllByName(String name);
    List<Foods> getAllByType(String type);
    List<Foods> getAllByCafe(String cafe);
    List<Foods> getAllByStructure(String structure);
}
