package com.example.n2.controller;

import com.example.n2.model.Trecho;
import com.example.n2.service.TrechoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trechos")
public class TrechoController {
    @Autowired
    private TrechoService trechoService;

    @GetMapping
    public List<Trecho> getAllTrechos() {
        return trechoService.findAll();
    }

    @PostMapping
    public Trecho createTrecho(@RequestBody Trecho trecho) {
        return trechoService.save(trecho);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTrecho(@PathVariable int id) {
        trechoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}