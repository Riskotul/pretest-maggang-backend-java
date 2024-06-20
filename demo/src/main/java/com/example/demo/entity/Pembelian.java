package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Pembelian {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime tanggalPembelian;
    private double totalHarga;
    private boolean statusPembayaran;
    private boolean statusPengiriman;

    // getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getTanggalPembelian() {
        return tanggalPembelian;
    }

    public void setTanggalPembelian(LocalDateTime tanggalPembelian) {
        this.tanggalPembelian = tanggalPembelian;
    }

    public double getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(double totalHarga) {
        this.totalHarga = totalHarga;
    }

    public boolean isStatusPembayaran() {
        return statusPembayaran;
    }

    public void setStatusPembayaran(boolean statusPembayaran) {
        this.statusPembayaran = statusPembayaran;
    }

    public boolean isStatusPengiriman() {
        return statusPengiriman;
    }

    public void setStatusPengiriman(boolean statusPengiriman) {
        this.statusPengiriman = statusPengiriman;
    }
}
