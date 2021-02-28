package com.pfe.taxe.projetfinetude.ws;


import com.pfe.taxe.projetfinetude.bean.Taux;
import com.pfe.taxe.projetfinetude.service.TauxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("boisson/taux")
public class TauxWs {

    @GetMapping("/")
    public List<Taux> findAll() {
        return tauxService.findAll();
    }

    @GetMapping("/categorie/code/{code}")
    public Taux findByCategorieLocalCode(@PathVariable String code) {
        return tauxService.findByCategorieLocalCode(code);
    }

    @Autowired
    private TauxService tauxService;

}
