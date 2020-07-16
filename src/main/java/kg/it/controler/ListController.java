package kg.it.controler;

import kg.it.entity.Lists;
import kg.it.service.ListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/list")
public class ListController {
    @Autowired
    private ListService listService;

    @GetMapping
    public List<Lists> getAll(){
        return listService.getAll();
    }

    @GetMapping("/id/{id}")
    public Lists getById(@PathVariable Long id) {
        return listService.getById(id);
    }

    @GetMapping("/C/{Cafe}")
    public List<Lists> getAllByCafeName(@PathVariable  String cafe){
        return listService.getAllByCafe(cafe);
    }
    @GetMapping("/D/{deliveryman}")
    public List<Lists> getAllByDeliveryMan(String deliveryman){
        return listService.getAllByDeliveryMan(deliveryman);
    }
    @GetMapping("/Cs/{customer}")
    public List<Lists> getAllByCustomers(String customer){
        return listService.getAllByCustomers(customer);
    }
    @PostMapping
    public Lists create(@RequestBody Lists lists){
        return listService.create(lists);
    }

    @PutMapping
    public Lists update(@RequestBody Lists lists){
        return listService.update(lists);
    }

    @DeleteMapping
    public Lists deleteById(@RequestParam(name = "id") Long id){
        return  listService.deleteById(id);
    }


}
