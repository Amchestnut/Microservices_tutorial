package com.example.komponente.spring.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity     // When I run the program, in Database I will have a TABLE called person !!!
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
// da nisam dodao ovaj naziv tabele @Table, naziv tabele bi bio samo "person" malim slovima. Dobro zbog raznih OS (mac, windows)
@Table(name = "person_table")     // Ovde zadajem kako ce da se ZOVE OVA TABELA, ako je budem pravio

// Ova klasa ce da se nasledjuje. Opet imamo nekoliko strategija kako cemo to da uradimo.
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "user_type", discriminatorType = DiscriminatorType.STRING)

public abstract class Person extends BaseEntity {
    private String firstName;
    private String lastName;
    private String contactNumber;
}
