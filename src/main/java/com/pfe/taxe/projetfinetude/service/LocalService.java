package com.pfe.taxe.projetfinetude.service;

import com.pfe.taxe.projetfinetude.bean.Local;
import com.pfe.taxe.projetfinetude.bean.Redevable;
import com.pfe.taxe.projetfinetude.dao.LocalDao;
import com.pfe.taxe.projetfinetude.dao.RedevableDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalService {
    @Autowired
    private LocalDao localDao;

    public Local findByRef(String ref) {
        return localDao.findByRef(ref);
    }

    public List<Local> findByAdresseLike(String adresse) {
        return localDao.findByAdresseLike(adresse);
    }

    public List<Local> findAll() {
        return localDao.findAll();
    }

    public int save(Local loc) {
        if(findByRef(loc.getRef())!= null){
            return -1;
        } else {
            localDao.save(loc);
            return 1;
        }
    }

    public List<Local> findByRedevableRef(String ref) {
        return localDao.findByRedevableRef(ref);
    }

}
