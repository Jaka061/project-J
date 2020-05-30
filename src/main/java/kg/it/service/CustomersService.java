package kg.it.service;

import kg.it.entity.Customers;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface CustomersService {
    List<Customers> getAll();
    Customers getById(Long id);
    Customers create(Customers customers);
    Customers update(Customers customers);
    Customers deleteById(Long id);
    Customers makePayment(Long id,Double sum);

}
