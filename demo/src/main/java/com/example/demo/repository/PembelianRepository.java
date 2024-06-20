package com.example.demo.repository;

import com.example.demo.entity.Pembelian;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PembelianRepository extends JpaRepository<Pembelian, Long> {
}
