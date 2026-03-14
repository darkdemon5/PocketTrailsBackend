package com.krish.PocketTrailsBackend.Models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "transactions")
public class Transactions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users users;

    private Double amount;

    private String type;

    @Column(name = "payment_type")
    private String paymentType;

    @OneToMany
    private List<Categories> categories = new ArrayList<>();

    private String description;

    private LocalDate date;
}
