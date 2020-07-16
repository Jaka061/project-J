package kg.it.repository;

import kg.it.entity.OrderBlog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderBlogRepository extends JpaRepository<OrderBlog,Long> {
}
