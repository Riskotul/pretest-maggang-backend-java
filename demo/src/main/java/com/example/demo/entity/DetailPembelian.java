package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class DetailPembelian {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Pembelian pembelian;

    @ManyToOne
    private Barang barang;

    private int jumlah;
    private double hargaSatuan;

    // getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pembelian getPembelian() {
        return pembelian;
    }

    public void setPembelian(Pembelian pembelian) {
        this.pembelian = pembelian;
    }

    public Barang getBarang() {
        return barang;
    }

    public void setBarang(Barang barang) {
        this.barang = barang;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public double getHargaSatuan() {
        return hargaSatuan;
    }

    public void setHargaSatuan(double hargaSatuan) {
        this.hargaSatuan = hargaSatuan;
    }
}
