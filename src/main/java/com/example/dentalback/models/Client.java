package com.example.dentalback.models;


import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString(exclude = {"doctor", "visits", "teeth"})
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String family;
    @Column(unique = true)
    private String mobile;
    private String email;
    private String info;
    private String file;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Doctor doctor;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "client")
    private List<Visits> visits = new ArrayList<>();
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "client")
    private List<Teeth> teeth = new ArrayList<>();


    public Client(String username, String family, String mobile) {
        this.username = username;
        this.family = family;
        this.mobile = mobile;
    }
}
