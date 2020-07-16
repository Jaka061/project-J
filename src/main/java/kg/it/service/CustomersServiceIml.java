package kg.it.service;

import kg.it.entity.Customers;
import kg.it.repository.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@Service
public class CustomersServiceIml implements CustomersService {
    @Autowired
    private CustomersRepository customersRepository;
//    @Autowired
//    private MailService mailService;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public List<Customers> getAll() {
        return customersRepository.findAll();
    }

    @Override
    public Customers getById(Long id) {
        return customersRepository.findById(id).orElse(null);
    }

    @Override
    public Customers create(Customers customers) {
        String encodePassWord = passwordEncoder.encode(customers.getPassword());
        customers.setPassword(encodePassWord);
        return customersRepository.save(customers);
    }
    @Override
    public Customers update(Customers customers) {
        return customersRepository.save(customers);
    }

    @Override
    public Customers deleteById(Long id) {
        Customers customers = getById(id);
        if (customers != null){
            customersRepository.deleteById(id);
        }
        return null;
    }
    @Override
    public Customers makePayment(Long id, Double sum) {
            Customers customers = customersRepository.findById(id).orElse(null);
            if (customers != null) {
                if (customers.getBalance() < sum) {
                    return null;
                } else {
                    double balance = customers.getBalance() - sum;
                    customers.setBalance((int) balance);
                }
                return customersRepository.save(customers);
            }
            return null;
    }
}
