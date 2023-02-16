package it.develhope.exerciseHybernate.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Students {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idStudent;

    @Column(nullable = false)
    private String lastName;
    @Column(nullable = true)
    private String firstName;

    @Column(unique = true, nullable = false)
    private String email;
}
