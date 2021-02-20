package com.pfe.taxe.projetfinetude.bean;

import javax.persistence.*;

@Entity
public class Taux {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    private CategorieLocal Categorie;

    private int pourcentage;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CategorieLocal getCategorie() {
        return Categorie;
    }

    public void setCategorie(CategorieLocal categorie) {
        Categorie = categorie;
    }

    public int getPourcentage() {
        return pourcentage;
    }

    public void setPourcentage(int pourcentage) {
        this.pourcentage = pourcentage;
    }
}
