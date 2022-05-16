package com.example.demo.Repository;
import com.example.demo.model.Codeacc;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CodeaccRepo extends JpaRepository<Codeacc,String> {
  
}
