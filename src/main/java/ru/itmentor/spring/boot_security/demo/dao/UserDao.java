package ru.itmentor.spring.boot_security.demo.dao;

import ru.itmentor.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserDao {
   public List<User> getAllUsers();
   public User getUserById(Long id);
   public void addUser(User user);
   public void updateUser(User user);
   public void deleteUser(Long id);

    User getUserByUsername(String username);
}
