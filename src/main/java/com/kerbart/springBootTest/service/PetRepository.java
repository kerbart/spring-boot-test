package com.kerbart.springBootTest.service;

import com.kerbart.springBootTest.entity.PetEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends JpaRepository<PetEntity, Integer> {}
