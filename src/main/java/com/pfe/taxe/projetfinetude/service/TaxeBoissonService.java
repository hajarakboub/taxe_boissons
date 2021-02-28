package com.pfe.taxe.projetfinetude.service;

import com.pfe.taxe.projetfinetude.bean.Redevable;
import com.pfe.taxe.projetfinetude.bean.TaxeBoisson;
import com.pfe.taxe.projetfinetude.dao.TaxeBoissonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaxeBoissonService {
    public int save(TaxeBoisson tb) {
        TaxeBoisson loadedTaxe = taxeBoissonDao.findByLocalRefAndTrimestreAndAndAnnee(tb.getLocal().getRef(), tb.getTrimestre(), tb.getAnnee());
        if (loadedTaxe != null) {
            return -1;
        } else {
            taxeBoissonDao.save(tb);
            return 1;
        }
    }

    public List<TaxeBoisson> findByRedevableRef(String ref) {
        return taxeBoissonDao.findByRedevableRef(ref);
    }

    public List<TaxeBoisson> findAll() {
        return taxeBoissonDao.findAll();
    }

    @Autowired
    private TaxeBoissonDao taxeBoissonDao;

}
