package org.example.demoss12maven.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "prescription_details")
@Getter @Setter @NoArgsConstructor
public class PrescriptionDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String medicineName;
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "prescription_id")
    private Prescription prescription;
}