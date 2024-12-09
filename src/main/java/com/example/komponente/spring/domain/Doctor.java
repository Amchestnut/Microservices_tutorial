package com.example.komponente.spring.domain;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
//@Table(name = "doctors")      NE MOZE OVO DA SE STAVI AKO IMAM SINGLE_TABLE !!! STRATEGIJA
@DiscriminatorValue("DOCTOR")   // ono po cemu se razlikuje, diskriminator za SINGLE_TABLE
public class Doctor extends Person{
    private String specialization;

}
