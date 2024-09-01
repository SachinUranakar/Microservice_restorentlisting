package com.sach.restolisting.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sach.restolisting.entity.Restorent;

@Repository
public interface RestorentRepo extends JpaRepository<Restorent, Integer>{

}
