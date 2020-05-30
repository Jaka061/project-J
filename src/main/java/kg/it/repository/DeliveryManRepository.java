package kg.it.repository;

import kg.it.entity.DeliveryMans;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryManRepository extends JpaRepository<DeliveryMans,Long> {
}
