package com.pfe.taxe.projetfinetude.dao;

import com.pfe.taxe.projetfinetude.bean.CategorieLocal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategorieDao extends JpaRepository<CategorieLocal, Long> {
    CategorieLocal findByCode(int code);

    List<CategorieLocal> findByLibelle(String libelle);
}
