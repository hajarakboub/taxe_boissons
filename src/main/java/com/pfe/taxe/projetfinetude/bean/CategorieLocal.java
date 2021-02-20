package com.pfe.taxe.projetfinetude.bean;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class CategorieLocal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int code ;

    private String libelle;
}
