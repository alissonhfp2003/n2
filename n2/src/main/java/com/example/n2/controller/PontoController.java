package com.example.n2.controller;

import com.example.n2.model.Ponto;
import com.example.n2.service.PontoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework .web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pontos")
public class PontoController {
    @Autowired
    private PontoService pontoService;

    @GetMapping
    public List<Ponto> getAllPontos() {
        return pontoService.findAll();
    }

    @PostMapping
    public Ponto createPonto(@RequestBody Ponto ponto) {
        return pontoService.save(ponto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePonto(@PathVariable int id) {
        pontoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}