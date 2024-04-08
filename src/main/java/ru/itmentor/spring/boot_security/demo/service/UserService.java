package ru.itmentor.spring.boot_security.demo.service;

import ru.itmentor.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();
    public User getUserById(Long id);
    public User addUser(User user);
    public User updateUser(User user);
    public void deleteUser(Long id);
    public User getUserByUsername(String username);

}
