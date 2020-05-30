package kg.it.service;

import kg.it.entity.OrderBlog;

import java.util.List;

public interface OrderBlogService {
    OrderBlog create(OrderBlog orderBlog);
    OrderBlog update(OrderBlog orderBlog);
    OrderBlog getById(Long id);
    OrderBlog deleteById(Long id);
    List<OrderBlog> getAll();
}
