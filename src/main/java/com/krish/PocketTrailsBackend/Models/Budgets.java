package com.krish.PocketTrailsBackend.Models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "budgets")
public class Budgets {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

    @ToString.Exclude
    @OneToMany(mappedBy = "budgets", cascade = CascadeType.ALL)
    private List<Categories> categories = new ArrayList<>();

    private BigDecimal monthlyLimit;

    private String month;

    private Integer year;
}
