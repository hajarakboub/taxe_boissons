package com.pfe.taxe.projetfinetude.dao;

import com.pfe.taxe.projetfinetude.bean.Redevable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RedevableDao extends JpaRepository<Redevable,Long> {

}
