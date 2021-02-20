package com.pfe.taxe.projetfinetude.ws;

import com.pfe.taxe.projetfinetude.bean.CategorieLocal;
import com.pfe.taxe.projetfinetude.service.CategorieLocalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("boisson/CategorieLocal")
public class CategorieWs {
    @Autowired
    private CategorieLocalService categorieLocalService;

    @GetMapping("/code/{code}")
    public CategorieLocal findByCode(int code) {
        return categorieLocalService.findByCode(code);
    }
    @GetMapping("/libelle/{libelle}")
    public List<CategorieLocal> findByLibelle(String libelle) {
        return categorieLocalService.findByLibelle(libelle);
    }
    @GetMapping("/")
    public List<CategorieLocal> findAll() {
        return categorieLocalService.findAll();
    }

    @PostMapping("/")
    public CategorieLocal save(CategorieLocal s) {
        return categorieLocalService.save(s);
    }

    public Optional<CategorieLocal> findById(Long aLong) {
        return categorieLocalService.findById(aLong);
    }

    public void delete(CategorieLocal categorieLocal) {
        categorieLocalService.delete(categorieLocal);
    }

    public void deleteAll(Iterable<? extends CategorieLocal> iterable) {
        categorieLocalService.deleteAll(iterable);
    }
}
