package com.sha.serverproductmanagement.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Double price;
    private String explanation;
}
