package com.example.dentalback.models;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString(exclude = "client")
public class Visits {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date date = new Date();
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Client client;
    private boolean finished = false;

    public Visits(Date date, boolean finished) {
        this.date = date;
        this.finished = finished;
    }
}
