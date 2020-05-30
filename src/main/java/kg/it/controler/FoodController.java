package kg.it.controler;

import kg.it.entity.Foods;
import kg.it.service.FoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/food")
public class FoodController {
    @Autowired
    private FoodsService foodsService;

    @GetMapping
    public List<Foods> getAll(){
        return foodsService.getAll();
    }

    @GetMapping("/id/{id}")
    public Foods getById(@PathVariable Long id) {
        return foodsService.getById(id);
    }

    @GetMapping("/N/{name}")
    public List<Foods> getAllByName(@PathVariable String name){
        return foodsService.getAllByName(name);
    }

    @GetMapping("/T/{type}")
    public List<Foods> getAllByType(@PathVariable String type){
        return foodsService.getAllByType(type);
    }

    @GetMapping("/C/{cafeName}")
    public List<Foods> getAllByCafeName(@PathVariable String cafeName){
        return foodsService.getAllByCafeName(cafeName);
    }

    @GetMapping("/S/{structure}")
    public List<Foods> getAllByStructure(@PathVariable String structure){
        return foodsService.getAllByStructure(structure);
    }

    @PostMapping
    public Foods create(@RequestBody Foods foods){
        return foodsService.create(foods);
    }

    @PutMapping
    public Foods  update(@RequestBody Foods foods){
        return foodsService.update(foods);
    }

    @DeleteMapping
    public Foods deleteById(@RequestParam(name = "id") Long id){
        return  foodsService.deleteById(id);
    }
}
