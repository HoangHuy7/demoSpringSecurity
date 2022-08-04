package com.example.demospringsecurity.Security.Sevice;

import com.example.demospringsecurity.Enitity.Role;
import com.example.demospringsecurity.Service.IGeneralSevice;

import java.util.Optional;

public interface IRoleService extends IGeneralSevice<Role> {
    Optional<Role> findByName(String name);
}
