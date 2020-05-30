package kg.it.repository;

import kg.it.entity.OrderBlog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderBlogRepository extends JpaRepository<OrderBlog,Long> {
}
