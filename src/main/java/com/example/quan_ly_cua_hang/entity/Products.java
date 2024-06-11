package com.example.quan_ly_cua_hang.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Table(name = "products")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_product")
    private int id;

    @Column(name = "product_name")
    private String name;

    @Column(name = "NSX")
    private Date nsx;

    @Column(name = "HSD")
    private Date hsd;

    @Column(name = "price_default")
    private BigDecimal priceDefault;

    @Column(name = "image")
    private String img;

    @ManyToOne
    @JoinColumn(name = "id_store")
    private Store store;

    @Column(name = "status")
    private int status;
}
