package com.example.dentalback.models;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Teeth {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String formula;
    private String details;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Client client;

}
