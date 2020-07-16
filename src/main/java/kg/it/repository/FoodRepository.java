package kg.it.repository;

import kg.it.entity.Foods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface FoodRepository extends JpaRepository<Foods ,Long> {
     List<Foods> findAllByNameContainingIgnoringCase(String name);
     List<Foods> findAllByCafeNameContainingIgnoringCase(String cafe);
     List<Foods> findAllByTypeContainingIgnoringCase(String type);
     List<Foods> findAllByStructureContainingIgnoringCase(String structure);


}
