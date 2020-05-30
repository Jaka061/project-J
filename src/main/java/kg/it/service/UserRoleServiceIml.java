package kg.it.service;

import kg.it.entity.Customers;
import kg.it.entity.UserRole;
import kg.it.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRoleServiceIml implements  UserRoleService {
    @Autowired
    private UserRoleRepository userRoleRepository;
@Autowired
private CustomersService customersService;

    @Override
    public UserRole create(UserRole userRole) {
        return userRoleRepository.save(userRole);
    }

    @Override
    public List<UserRole> getAll() {
        return userRoleRepository.findAll();
    }
}
