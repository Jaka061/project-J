package kg.it.service;

import kg.it.entity.OrderBlog;
import kg.it.repository.OrderBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderBlogServiceIml implements OrderBlogService {
    @Autowired
    private OrderBlogRepository orderBlogRepository;

    @Override
    public OrderBlog create(OrderBlog orderBlog) {
        return orderBlogRepository.save(orderBlog);
    }

    @Override
    public OrderBlog update(OrderBlog orderBlog) {
        return orderBlogRepository.save(orderBlog);
    }

    @Override
    public OrderBlog getById(Long id) {
        return orderBlogRepository.findById(id).orElse(null);
    }

    @Override
    public OrderBlog deleteById(Long id) {
        OrderBlog orderBlog = getById(id);
        if (orderBlog != null){
            orderBlogRepository.deleteById(id);
        }
        return null;
    }

    @Override
    public List<OrderBlog> getAll() {
        return orderBlogRepository.findAll();
    }
}
