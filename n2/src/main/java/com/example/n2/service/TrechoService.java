package com.example.n2.service;

import com.example.n2.model.Trecho;
import com.example.n2.repository.TrechoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrechoService {
    @Autowired
    private TrechoRepository trechoRepository;

    public List<Trecho> findAll() {
        return trechoRepository.findAll();
    }

    public Trecho save(Trecho trecho) {
        return trechoRepository.save(trecho);
    }

    public void deleteById(int id) {
        trechoRepository.deleteById(id);
    }
}