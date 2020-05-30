package kg.it.repository;

import kg.it.entity.Lists;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListRepository extends JpaRepository<Lists,Long> {
}
