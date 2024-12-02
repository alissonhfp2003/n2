package com.example.n2.service;

import com.example.n2.model.Ponto;
import com.example.n2.repository.PontoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PontoService {
    @Autowired
    private PontoRepository pontoRepository;

    public List<Ponto> findAll() {
        return pontoRepository.findAll();
    }

    public Ponto save(Ponto ponto) {
        return pontoRepository.save(ponto);
    }

    public void deleteById(int id) {
        pontoRepository.deleteById(id);
    }
}