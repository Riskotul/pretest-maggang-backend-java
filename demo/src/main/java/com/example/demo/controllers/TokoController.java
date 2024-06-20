package com.example.demo.controllers;

import com.example.demo.entity.Toko;
import com.example.demo.repository.TokoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/toko")
public class TokoController {

    @Autowired
    private TokoRepository tokoRepository;

    // Mendapatkan semua toko
    @GetMapping("/")
    public List<Toko> getAllToko() {
        return tokoRepository.findAll();
    }

    // Menyimpan toko baru
    @PostMapping("/")
    public Toko createToko(@RequestBody Toko toko) {
        return tokoRepository.save(toko);
    }

    // Mendapatkan toko berdasarkan ID
    @GetMapping("/{id}")
    public Toko getTokoById(@PathVariable Long id) {
        return tokoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Toko dengan ID " + id + " tidak ditemukan"));
    }

    // Menghapus toko berdasarkan ID
    @DeleteMapping("/{id}")
    public void deleteToko(@PathVariable Long id) {
        tokoRepository.deleteById(id);
    }
}