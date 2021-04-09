package com.tcc.fichaDDappv3.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity
@Table(name = "TB_CARACTERISTICARACA")
public class CaracteristicaRaca
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCarRaca;

    @Column(columnDefinition = "TEXT")
    private String nomeCarRaca;
    @Column(columnDefinition = "TEXT")
    private String descCarRaca;
}
