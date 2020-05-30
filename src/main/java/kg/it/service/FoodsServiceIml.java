package kg.it.service;

import kg.it.entity.Foods;
import kg.it.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FoodsServiceIml implements FoodsService{
    @Autowired
    private FoodRepository foodRepository;

    @Override
    public List<Foods> getAll() {
        return foodRepository.findAll();
    }

    @Override
    public Foods getById(Long id) {
        return foodRepository.findById(id).orElse(null);
    }

    @Override
    public Foods create(Foods foods) {
        return foodRepository.save(foods);
    }

    @Override
    public Foods update(Foods foods) {
        return foodRepository.save(foods);
    }

    @Override
    public Foods deleteById(Long id) {
        Foods foods= getById(id);
        if (foods != null){
            foodRepository.deleteById(id);
        }
        return null;
    }

    @Override
    public List<Foods> getAllByName(String name) {
        return foodRepository.findAllByNameContainingIgnoringCase(name);
    }

    @Override
    public List<Foods> getAllByType(String type) {
        return foodRepository.findAllByTypeContainingIgnoringCase(type);
    }

    @Override
    public List<Foods> getAllByCafeName(String cafeName) {
        return foodRepository.findAllByCafeNameContainingIgnoringCase(cafeName);
    }

    @Override
    public List<Foods> getAllByStructure(String structure) {
        return foodRepository.findAllByStructureContainingIgnoringCase(structure);
    }
}
