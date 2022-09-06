package com.sha.serverproductmanagement.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String username;
    // TODO: setPassword 변경
    @Setter private String password;

    @Enumerated(EnumType.STRING)
    @Setter
    private Role role;
}
