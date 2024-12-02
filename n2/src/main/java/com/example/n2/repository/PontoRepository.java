package com.example.n2.repository;


import com.example.n2.model.Ponto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PontoRepository extends JpaRepository<Ponto, Integer> {
}