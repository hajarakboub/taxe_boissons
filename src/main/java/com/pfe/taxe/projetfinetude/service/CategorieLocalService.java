package com.pfe.taxe.projetfinetude.service;

import com.pfe.taxe.projetfinetude.bean.CategorieLocal;
import com.pfe.taxe.projetfinetude.dao.CategorieDao;
import com.pfe.taxe.projetfinetude.dao.RedevableDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategorieLocalService {

    public CategorieLocal findByCode(int code) {
        return categorieDao.findByCode(code);
    }

    public List<CategorieLocal> findByLibelle(String libelle) {
        return categorieDao.findByLibelle(libelle);
    }

    public List<CategorieLocal> findAll() {
        return categorieDao.findAll();
    }

    public List<CategorieLocal> findAll(Sort sort) {
        return categorieDao.findAll(sort);
    }

    public List<CategorieLocal> findAllById(Iterable<Long> iterable) {
        return categorieDao.findAllById(iterable);
    }

    public <S extends CategorieLocal> S save(S s) {
        return categorieDao.save(s);
    }

    public Optional<CategorieLocal> findById(Long aLong) {
        return categorieDao.findById(aLong);
    }

    public void delete(CategorieLocal categorieLocal) {
        categorieDao.delete(categorieLocal);
    }

    public void deleteAll(Iterable<? extends CategorieLocal> iterable) {
        categorieDao.deleteAll(iterable);
    }

    @Autowired
    private CategorieDao categorieDao;
}
