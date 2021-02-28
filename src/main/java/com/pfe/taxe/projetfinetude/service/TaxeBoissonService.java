package com.pfe.taxe.projetfinetude.service;

import com.pfe.taxe.projetfinetude.bean.*;
import com.pfe.taxe.projetfinetude.dao.LocalDao;
import com.pfe.taxe.projetfinetude.dao.TaxeBoissonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaxeBoissonService {

    public int save(TaxeBoisson taxeBoisson) {
       return save(taxeBoisson.getLocal().getRef(),taxeBoisson.getRedevable().getRef(),taxeBoisson.getTrimestre(),taxeBoisson.getAnnee(),taxeBoisson.getBenefice(),false);
    }

    public int simuler(TaxeBoisson taxeBoisson) {
        return save(taxeBoisson.getLocal().getRef(),taxeBoisson.getRedevable().getRef(),taxeBoisson.getTrimestre(),taxeBoisson.getAnnee(),taxeBoisson.getBenefice(),true);
    }


        public int save(String refLocal, String refRedevable, Integer trimestre , Integer annee,Double benefice,boolean simuler) {
        Local local = localService.findByRef(refLocal);
        Redevable redevable = redevableService.findByRef(refRedevable);
        TaxeBoisson taxeBoisson = taxeBoissonDao.findByLocalRefAndTrimestreAndAnnee(refLocal, trimestre, annee);
        CategorieLocal categorieLocal = local.getCategorieLocal();
        Taux taux = tauxService.findByCategorieLocalCode(categorieLocal.getCode());

        if (local == null)
            return -1;
        else if (redevable == null)
            return -2;
        else if (taxeBoisson != null)
            return -3;
        else if (categorieLocal == null || categorieLocal.getId() ==null) {
            return -4;
        }
        else if (taux == null) {
            return -5;
        }
        else{
            TaxeBoisson myTaxeBoisson= new TaxeBoisson();
            myTaxeBoisson.setRedevable(redevable);
            myTaxeBoisson.setTaux(taux);
            myTaxeBoisson.setAnnee(annee);
            myTaxeBoisson.setBenefice(benefice);
            myTaxeBoisson.setLocal(local);
            myTaxeBoisson.setTrimestre(trimestre);
            double montant=taux.getPourcentage()*benefice;
            myTaxeBoisson.setMontantBase(montant);
            if(simuler==true)
            taxeBoissonDao.save(myTaxeBoisson);
            return  1;
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
    @Autowired
    private LocalService localService;
    @Autowired
    private RedevableService redevableService;
    @Autowired
    private TauxService tauxService;



}
