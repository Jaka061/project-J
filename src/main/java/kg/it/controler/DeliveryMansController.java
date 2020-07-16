package kg.it.controler;

import kg.it.entity.DeliveryMans;
import kg.it.service.DeliveryMansService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/deliveryman")
public class DeliveryMansController {
    @Autowired
    private DeliveryMansService deliveryMansService;

    @GetMapping
    public List<DeliveryMans> getAll(){
        return deliveryMansService.getAll();
    }

    @GetMapping("/id/{id}")
    public DeliveryMans getById(@PathVariable Long id) {
        return deliveryMansService.getById(id);
    }

    @PostMapping
    public DeliveryMans create(@RequestBody DeliveryMans deliveryMans){
        return deliveryMansService.create(deliveryMans);
    }

    @PutMapping
    public DeliveryMans  update(@RequestBody DeliveryMans deliveryMans){
        return deliveryMansService.update(deliveryMans);
    }

    @DeleteMapping("/id/{id}")
    public DeliveryMans deleteById(@RequestParam(name = "id") Long id){
        return  deliveryMansService.deleteById(id);
    }
}
