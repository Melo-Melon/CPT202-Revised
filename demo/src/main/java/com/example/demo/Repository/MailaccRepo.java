package com.example.demo.Repository;


import org.springframework.stereotype.Repository;



//import java.util.List;
//import java.util.Optional;

import com.example.demo.model.Mailacc;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;


@Repository
public interface MailaccRepo extends JpaRepository<Mailacc,String> {
   // Optional<Mailacc> findByEmail(String email);
  
}
