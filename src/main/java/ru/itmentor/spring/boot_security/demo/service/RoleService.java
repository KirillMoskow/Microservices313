package ru.itmentor.spring.boot_security.demo.service;

import ru.itmentor.spring.boot_security.demo.model.Role;

import java.util.List;

public interface RoleService {
    Role findByName(String name);
    List<Role> findAll();
    Role save(Role role);
    void delete(Role role);
}
