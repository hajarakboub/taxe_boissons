package com.pfe.taxe.projetfinetude.ws;

import com.pfe.taxe.projetfinetude.bean.TaxeBoisson;
import com.pfe.taxe.projetfinetude.service.TaxeBoissonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("taxe-boisson/taxe")
public class TaxeBoissonWs{

    @GetMapping("/")
    public List<TaxeBoisson> findAll() {
        return taxeBoissonService.findAll();
    }
    @GetMapping("/redevable/ref/{ref}")
    public List<TaxeBoisson> findByRedevableRef(@PathVariable String ref){
        return taxeBoissonService.findByRedevableRef(ref);
    }
    @PostMapping("/")
    public int save(TaxeBoisson tb) {
        return taxeBoissonService.save(tb);
    }

    @Autowired
    private TaxeBoissonService taxeBoissonService;
}
