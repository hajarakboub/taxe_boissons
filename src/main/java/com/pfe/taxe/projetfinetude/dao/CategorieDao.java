package com.pfe.taxe.projetfinetude.dao;

import com.pfe.taxe.projetfinetude.bean.CategorieLocal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieDao  extends JpaRepository<CategorieLocal, Long> {
}
