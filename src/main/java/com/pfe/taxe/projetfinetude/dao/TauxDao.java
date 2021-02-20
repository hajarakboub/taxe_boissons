package com.pfe.taxe.projetfinetude.dao;

import com.pfe.taxe.projetfinetude.bean.Taux;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TauxDao extends JpaRepository<Taux, Long> {
    
}
