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
public class Enrollments {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idEnrollment;

    @ManyToOne(fetch = FetchType.LAZY)
    private Students students;
    @ManyToOne(fetch = FetchType.LAZY)
    private Classes classes;
}
