package com.example.demospringsecurity.Security.Sevice;

import com.example.demospringsecurity.Enitity.User;
import com.example.demospringsecurity.Service.IGeneralSevice;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Optional;

public interface IUserService extends IGeneralSevice<User> , UserDetailsService {

    Optional<User> findByUsername(String username);
}
