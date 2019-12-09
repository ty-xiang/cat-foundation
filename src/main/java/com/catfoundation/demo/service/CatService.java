package com.catfoundation.demo.service;

import com.catfoundation.demo.dao.CatRepository;
import com.catfoundation.demo.entity.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatService {

    @Autowired
    CatRepository catRepo;

    public Cat save(Cat cat) {
        return catRepo.save(cat);
    }

    public List<Cat> getAll() {
        return catRepo.findAll();
    }


}
