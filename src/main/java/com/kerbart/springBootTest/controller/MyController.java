package com.kerbart.springBootTest.controller;

import com.kerbart.springBootTest.service.PetRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    PetRepository repository;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ApiOperation(value = "List all pets")
    public List<String> getAllPets() {
        return List.of();
    }

}

