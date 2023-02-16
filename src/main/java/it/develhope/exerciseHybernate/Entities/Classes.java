package it.develhope.exerciseHybernate.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Classes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idClass;

    @Column(nullable = false)
    public String title;

    @Column(nullable = false)
    public String description;
}
