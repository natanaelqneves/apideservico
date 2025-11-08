package com.nqn.apideservico.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Relatorio {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private LocalDate dataDoServico;
    @Column(nullable = false)
    private String placaDaViatura;
    @Column(nullable = false)
    private Integer kmInicial;
    private Integer kmFinal;
    private String avarias;
    private boolean abastecida;

    public Relatorio() {
    }

    public Relatorio(String id, String placaDaViatura, Integer kmInicial, Integer kmFinal, String avarias, boolean abastecida) {
        this.id = id;
        this.placaDaViatura = placaDaViatura;
        this.kmInicial = kmInicial;
        this.kmFinal = kmFinal;
        this.avarias = avarias;
        this.abastecida = abastecida;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getDataDoServico() {
        return dataDoServico;
    }

    public void setDataDoServico(LocalDate dataDoServico) {
        this.dataDoServico = dataDoServico;
    }

    public String getPlacaDaViatura() {
        return placaDaViatura;
    }

    public void setPlacaDaViatura(String placaDaViatura) {
        this.placaDaViatura = placaDaViatura;
    }

    public Integer getKmInicial() {
        return kmInicial;
    }

    public void setKmInicial(Integer kmInicial) {
        this.kmInicial = kmInicial;
    }

    public Integer getKmFinal() {
        return kmFinal;
    }

    public void setKmFinal(Integer kmFinal) {
        this.kmFinal = kmFinal;
    }

    public String getAvarias() {
        return avarias;
    }

    public void setAvarias(String avarias) {
        this.avarias = avarias;
    }

    public boolean isAbastecida() {
        return abastecida;
    }

    public void setAbastecida(boolean abastecida) {
        this.abastecida = abastecida;
    }
}
