package com.pfe.taxe.projetfinetude.dao;

import com.pfe.taxe.projetfinetude.bean.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<User, Integer> {

     User findByUsername(String username) ;

}