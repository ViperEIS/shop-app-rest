package com.ilyaevteev.shopapp.service;


import com.ilyaevteev.shopapp.model.auth.User;

import java.util.List;


public interface UserService {

    User register(User user);

    List<User> getAll();

    User findByUsername(String username);

    User findById(Long id);

    void delete(Long id);
}
