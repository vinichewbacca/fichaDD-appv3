package com.tcc.fichaDDappv3.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor //cria construtor com todos os argumentos
@NoArgsConstructor //cria construtor sem argumentos
@Data //cria getters and setters
@Entity
@Table(name = "TB_PERSONAGEM")
public class Personagem
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String jogador;
    private String nome;
    private String raca;
    private int forca;
    private int destreza;
    private int constituicao;
    private int inteligencia;
    private int sabedoria;
    private int carisma;
    private int modFor,modDes,modCon,modInt,modSab, modCar;
}
