package com.catfoundation.demo.dao;

import com.catfoundation.demo.entity.Cat;
import org.springframework.data.repository.CrudRepository;

public interface CatRepository extends CrudRepository<Cat, Long> {
}
