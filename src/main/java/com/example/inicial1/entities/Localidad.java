package com.example.inicial1.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString

@Audited
@Table(name = "localidad")
public class Localidad extends Base {

    @Column(name = "denominacion")
    private String denominacion;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "fk_domicilio")
    private Domicilio domicilio;
}
