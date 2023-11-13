package com.api.people.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "tb_users")
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    @Setter(AccessLevel.NONE)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "cpf", nullable = false, unique = true)
    private String cpf;

    @Column(name = "gender", nullable = false)
    private String gender;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "age", nullable = false)
    private Integer age;

    @Column(name = "date_of_birth", nullable = false)
    private Date dateOfBirth;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "state", nullable = false)
    private String state;

    @Column(name = "profession", nullable = false)
    private String profession;

    @Column(name = "active", nullable = false)
    private Boolean active;

    public User(String name, String cpf, String gender, String email, Integer age, Date dateOfBirth, String address, String city, String state, String profession, Boolean active) {
        this.name = name;
        this.cpf = cpf;
        this.gender = gender;
        this.email = email;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.city = city;
        this.state = state;
        this.profession = profession;
        this.active = active;


    }
}



