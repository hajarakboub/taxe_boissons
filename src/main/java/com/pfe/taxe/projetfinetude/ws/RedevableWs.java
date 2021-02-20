package com.pfe.taxe.projetfinetude.ws;

import com.pfe.taxe.projetfinetude.bean.Redevable;
import com.pfe.taxe.projetfinetude.service.RedevableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("boisson/redovable")
public class RedevableWs {

    @Autowired
    private RedevableService redevableService;

    @GetMapping("boisson/redovable/findbyref")
    public Redevable findByRef(String ref) {
        return redevableService.findByRef(ref);
    }

    @GetMapping("boisson/redovable/findbytype")
    public List<Redevable> findByType(String type) {
        return redevableService.findByType(type);
    }

    @GetMapping("boisson/redovable/findbyall")
    public List<Redevable> findAll() {
        return redevableService.findAll();
    }

    @PostMapping("boisson/redovable/saveredevable")
    public int save(Redevable red) {
        return redevableService.save(red);
    }
}
