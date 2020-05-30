package kg.it.controler;

import kg.it.entity.Customers;
import kg.it.repository.CustomersRepository;
import kg.it.service.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/customer")
public class CustomersController {
    @Autowired
    private CustomersService customersService;

    @GetMapping
    public List<Customers> getAll(){
        return customersService.getAll();
    }

    @GetMapping("/id/{id}")
    public Customers getById(@PathVariable Long id) {
        return customersService.getById(id);
    }

    @PostMapping
    public Customers create(@RequestBody Customers customers){
        return customersService.create(customers);
    }

    @PostMapping("/{id}/{sum}")
    public Customers makePayment(@PathVariable("id") Long id, @PathVariable("sum") Double sum){
        return customersService.makePayment(id,sum);
    }

    @PutMapping
    public Customers update(@RequestBody Customers customers){
        return customersService.update(customers);
    }

    @DeleteMapping
    public Customers deleteById(@RequestParam(name = "id") Long id){
        return  customersService.deleteById(id);
    }

}
