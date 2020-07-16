package kg.it.repository;

import kg.it.entity.Lists;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ListRepository extends JpaRepository<Lists,Long> {
    List<Lists> findAllByCafe_NameContainingIgnoringCase(String cafe);
    List<Lists> findAllByCustomer_LoginContainingIgnoringCase(String customer);
    List<Lists> findAllByDeliveryMan_NameContainingIgnoringCase(String deliveryman);
}
