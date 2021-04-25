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
@ToString(exclude = {"client", "visits"})
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String password;
    private String family;
//    @Column(unique = true)
    private String mobile;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "doctor")
    private List<Client> client = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "doctor")
    private List<Visits> visits = new ArrayList<>();

    public Doctor(String username, String family, String mobile, String password) {
        this.username = username;
        this.family = family;
        this.mobile = mobile;
        this.password = password;
    }
}
