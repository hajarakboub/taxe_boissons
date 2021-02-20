package com.pfe.taxe.projetfinetude.bean;

import javax.persistence.*;

@Entity

public class TaxeBoisson {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Redevable redevable;
    @ManyToOne
    private Local local;
    private Integer trimestre;
    private Integer annee;
    private Double benefice;
    private  Double montantBase;
    @ManyToOne
    private Taux taux;

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Double getMontantBase() {
        return montantBase;
    }

    public void setMontantBase(Double montantBase) {
        this.montantBase = montantBase;
    }

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
