package com.krish.PocketTrailsBackend.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    private String password;
    private ZonedDateTime createAt;

    @ToString.Exclude
    @OneToMany(mappedBy = "users", cascade = CascadeType.ALL)
    private List<Transactions> transactions = new ArrayList<>();
}
