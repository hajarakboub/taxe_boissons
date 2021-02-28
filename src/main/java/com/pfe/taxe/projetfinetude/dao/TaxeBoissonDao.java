package com.pfe.taxe.projetfinetude.dao;

import com.pfe.taxe.projetfinetude.bean.TaxeBoisson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaxeBoissonDao extends JpaRepository<TaxeBoisson,Long> {
    List<TaxeBoisson> findByRedevableRef(String ref);
    TaxeBoisson findByLocalRefAndTrimestreAndAndAnnee(String ref,Integer trimestre,Integer annee);
}
