package com.catfoundation.demo.dao;

import com.catfoundation.demo.entity.Cat;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CatRepository extends CrudRepository<Cat, Long> {

    @Override
    public List<Cat> findAll();
}
