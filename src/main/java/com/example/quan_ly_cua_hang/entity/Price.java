package com.example.quan_ly_cua_hang.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "price")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Price {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_price")
    private int id;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "status")
    private int status;

    @ManyToOne
    @JoinColumn(name = "id_product")
    private Products products;
}
