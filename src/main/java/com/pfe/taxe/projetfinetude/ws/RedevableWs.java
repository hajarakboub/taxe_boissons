package com.pfe.taxe.projetfinetude.ws;

import com.pfe.taxe.projetfinetude.bean.Redevable;
import com.pfe.taxe.projetfinetude.service.RedevableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("boisson/redevable")
public class RedevableWs {

    @Autowired
    private RedevableService redevableService;

    @GetMapping("/ref/{ref}")
    public Redevable findByRef(@PathVariable String ref) {
        return redevableService.findByRef(ref);
    }

    @GetMapping("/type/{type}")
    public List<Redevable> findByType(@PathVariable String type) {
        return redevableService.findByType(type);
    }

    @GetMapping("/")
    public List<Redevable> findAll() {
        return redevableService.findAll();
    }

    @PostMapping("/")
    public int save(@RequestBody Redevable red) {
        return redevableService.save(red);
    }
}
