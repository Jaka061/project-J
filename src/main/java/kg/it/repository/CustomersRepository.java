package kg.it.repository;

import kg.it.entity.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.awt.*;

@Repository
public interface CustomersRepository extends JpaRepository<Customers,Long> {
    //Customers makePayment(Long id, Double sum);
}
