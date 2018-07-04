package com.greenfoxacademy.reddit.Services;

import com.greenfoxacademy.reddit.Models.User;
import java.util.List;

public interface UserService {
    List<User> getAllUser();
    User getUserById(Long id);
}
