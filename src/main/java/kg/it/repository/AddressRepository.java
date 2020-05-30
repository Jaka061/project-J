package kg.it.repository;

import kg.it.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AddressRepository extends JpaRepository<Address ,Long> {
   List<Address> findAllByCityContainingIgnoringCase(String city);
}
