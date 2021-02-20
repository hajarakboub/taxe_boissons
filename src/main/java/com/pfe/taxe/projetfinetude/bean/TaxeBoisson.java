package com.pfe.taxe.projetfinetude.bean;

import javax.persistence.*;

@Entity

public class TaxeBoisson {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Redevable redevable;
    private Integer trimestre;
    private Integer annee;
    private Double benefice;
    @ManyToOne
    private Taux taux;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Redevable getRedevable() {
        return redevable;
    }

    public void setRedevable(Redevable redevable) {
        this.redevable = redevable;
    }

    public Integer getTrimestre() {
        return trimestre;
    }

    public void setTrimestre(Integer trimestre) {
        this.trimestre = trimestre;
    }

    public Integer getAnnee() {
        return annee;
    }

    public void setAnnee(Integer annee) {
        this.annee = annee;
    }

    public Double getBenefice() {
        return benefice;
    }

    public void setBenefice(Double benefice) {
        this.benefice = benefice;
    }

    public Taux getTaux() {
        return taux;
    }

    public void setTaux(Taux taux) {
        this.taux = taux;
    }
}
