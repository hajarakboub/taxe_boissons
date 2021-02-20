package com.pfe.taxe.projetfinetude.dao;

import com.pfe.taxe.projetfinetude.bean.Local;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocalDao extends JpaRepository<Local,Long> {
        Local findByRef(String ref);
        List<Local> findByAdresseLike(String adresse);
        List<Local> findByRedevableRef(String ref);
}
