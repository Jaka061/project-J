package kg.it.controler;

import kg.it.entity.Cafe;
import kg.it.service.CafeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/cafe")
@RestController
public class CafeController  {
    @Autowired CafeService cafeService;

    @PostMapping
    public Cafe create(@RequestBody Cafe cafe){
        return cafeService.create(cafe);
    }
    @PutMapping
    public Cafe update(Cafe cafe){
        return cafeService.update(cafe);
    }
    @GetMapping
    public List<Cafe> getAll(){
        return cafeService.getAll();
    }
    @GetMapping("/id/{id}")
    public Cafe getById(@PathVariable  Long id){
        return cafeService.getById(id);
    }

    @DeleteMapping("/id/{id}")
    public void deleteById(@RequestParam(name = "id") Long id){
        cafeService.deleteById(id);
    }

}
