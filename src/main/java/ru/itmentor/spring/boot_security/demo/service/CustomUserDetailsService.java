package ru.itmentor.spring.boot_security.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
import ru.itmentor.spring.boot_security.demo.dao.UserDaoImp;


@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserDaoImp userDao;

    @Override
    public UserDetails loadUserByUsername(String username) {
        return userDao.getUserByUsername(username);
    }
}
