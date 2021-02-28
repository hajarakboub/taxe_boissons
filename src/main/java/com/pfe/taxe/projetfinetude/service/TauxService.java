package com.pfe.taxe.projetfinetude.service;

import com.pfe.taxe.projetfinetude.bean.Taux;
import com.pfe.taxe.projetfinetude.dao.TauxDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TauxService {

    public Taux findByCategorieLocalCode(String code) {
        return tauxDao.findByCategorieLocalCode(code);
    }

    public List<Taux> findAll() {
        return tauxDao.findAll();
    }

    @Autowired
    private TauxDao tauxDao;



}
