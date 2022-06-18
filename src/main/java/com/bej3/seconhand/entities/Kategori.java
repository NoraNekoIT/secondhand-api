package com.bej3.seconhand.entities;

import javax.persistence.*;

@Entity(name = "kategori")
public class Kategori {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_kategori")
    private int idKategori;

    @Column(name = "nama_kategori")
    private String namaKategori;

    //setiap one to many dia bikin table
//    @OneToMany(cascade = CascadeType.ALL)
//    private Set<Produk> produks;

}
