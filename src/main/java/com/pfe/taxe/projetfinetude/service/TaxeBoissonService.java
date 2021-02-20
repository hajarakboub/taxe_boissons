package com.pfe.taxe.projetfinetude.service;

import com.pfe.taxe.projetfinetude.bean.Redevable;
import com.pfe.taxe.projetfinetude.bean.TaxeBoisson;
import com.pfe.taxe.projetfinetude.dao.TaxeBoissonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TaxeBoissonService {

    public List<TaxeBoisson> findByRedevableRef(String ref) {
        return taxeBoissonDao.findByRedevableRef(ref);
    }

    public List<TaxeBoisson> findAll() {
        return taxeBoissonDao.findAll();
    }

    @Autowired
    private TaxeBoissonDao taxeBoissonDao;

}
