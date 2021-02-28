package com.pfe.taxe.projetfinetude.dao;

import com.pfe.taxe.projetfinetude.bean.Taux;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TauxDao extends JpaRepository<Taux, Long> {

    Taux findByCategorieLocalCode(String code);
}
