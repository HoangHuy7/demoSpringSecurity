package com.example.demospringsecurity.Service;

import java.util.List;
import java.util.Optional;

public interface IGeneralSevice <T>{

    List<T> findAll();

    Optional<T> findById(Integer id);

    T save(T t);

    void removed(Integer id);
}
