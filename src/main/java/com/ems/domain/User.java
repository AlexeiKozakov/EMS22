package com.ems.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;
import java.util.TreeSet;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    @Column(unique = true,nullable = false)

    private String phoneNumber;
    @OneToMany
    private Set<Role> roles = new TreeSet<>();
    @Column(unique = true,length = 25)
    private String password;


}
