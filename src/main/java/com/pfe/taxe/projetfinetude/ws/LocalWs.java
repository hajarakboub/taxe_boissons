package com.pfe.taxe.projetfinetude.ws;


import com.pfe.taxe.projetfinetude.bean.Local;
import com.pfe.taxe.projetfinetude.service.LocalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("boisson/local")
public class LocalWs {
    @Autowired
    private LocalService localService;

    @GetMapping("/ref/{ref}")
    public Local findByRef(@PathVariable String ref) {
        return localService.findByRef(ref);
    }

    @GetMapping("/adresse/{adresse}")
    public List<Local> findByAdresseLike(@PathVariable String adresse) {
        return localService.findByAdresseLike(adresse);
    }

    @GetMapping("/")
    public List<Local> findAll() {
        return localService.findAll();
    }

    @PostMapping("/")
    public int save(@RequestBody Local loc) {
        return localService.save(loc);
    }

    @GetMapping("/redevable/ref/{ref}")
    public List<Local> findByRedevableRef(@PathVariable String ref) {
        return localService.findByRedevableRef(ref);
    }
}
