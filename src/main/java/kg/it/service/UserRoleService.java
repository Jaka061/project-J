package kg.it.service;

import kg.it.entity.UserRole;

import java.util.List;

public interface UserRoleService {
    UserRole create(UserRole userRole);
    List<UserRole> getAll();
}
