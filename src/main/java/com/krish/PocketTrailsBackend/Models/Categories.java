package com.krish.PocketTrailsBackend.Models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "categories")
public class Categories {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users users;

    private String name;

    private String emoji;

    @ManyToOne
    @JoinColumn(name = "transaction_id")
    private Transactions transactions;

    @ManyToOne
    @JoinColumn(name = "budgets_id")
    private Budgets budgets;

}
