package com.pfe.taxe.projetfinetude.service;

import com.pfe.taxe.projetfinetude.bean.Redevable;
import com.pfe.taxe.projetfinetude.dao.RedevableDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RedevableService {
    @Autowired
    private RedevableDao redevableDao;

    public Redevable findByRef(String ref) {
        return redevableDao.findByRef(ref);
    }

    public List<Redevable> findByType(String type) {
        return redevableDao.findByType(type);
    }

    public List<Redevable> findAll() {
        return redevableDao.findAll();
    }

    public int save(Redevable red) {
        if(findByRef(red.getRef())!= null){
            return -1;
        } else {
            redevableDao.save(red);
            return 1;
        }
    }



}
