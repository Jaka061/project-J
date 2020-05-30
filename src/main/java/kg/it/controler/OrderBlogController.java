package kg.it.controler;

import kg.it.entity.OrderBlog;
import kg.it.service.OrderBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orderBlog")
public class OrderBlogController {
    @Autowired
    private OrderBlogService orderBlogService;

    @GetMapping
    public List<OrderBlog> getAll(){
        return orderBlogService.getAll();
    }

    @GetMapping("/id/{id}")
    public OrderBlog getById(@PathVariable Long id) {
        return orderBlogService.getById(id);
    }

    @PostMapping
    public OrderBlog create(@RequestBody OrderBlog orderBlog){
        return orderBlogService.create(orderBlog);
    }

    @PutMapping
    public OrderBlog update(@RequestBody OrderBlog orderBlog){
        return orderBlogService.update(orderBlog);
    }

    @DeleteMapping
    public OrderBlog deleteById(@RequestParam(name = "id") Long id){
        return  orderBlogService.deleteById(id);
    }

}
