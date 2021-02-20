package com.pfe.taxe.projetfinetude.ws;


import com.pfe.taxe.projetfinetude.bean.Local;
import com.pfe.taxe.projetfinetude.service.LocalService;
import com.pfe.taxe.projetfinetude.service.RedevableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("boisson/local")
public class LocalWs {
    @Autowired
    private LocalService localService;

    @GetMapping("boisson/local/findbyref")
    public Local findByRef(String ref) {
        return localService.findByRef(ref);
    }

    @GetMapping("boisson/local/findbyadresse")
    public List<Local> findByAdresseLike(String adresse) {
        return localService.findByAdresseLike(adresse);
    }

    @GetMapping("boisson/local/findall")
    public List<Local> findAll() {
        return localService.findAll();
    }

    @PostMapping("boisson/local/savelocal")
    public int save(Local loc) {
        return localService.save(loc);
    }

    @GetMapping("boisson/local/redevableref")
    public List<Local> findByRedevableRef(String ref) {
        return localService.findByRedevableRef(ref);
    }
}
