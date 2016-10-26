package com.qaz.dao;

import com.qaz.entity.Signine;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by innofin-04 on 2016/10/25.
 */
public interface signInDao extends JpaRepository<Signine, Integer> {
//    List<Product> findByNameOrderByIdDesc(String name);
//    List<Product> findByName(String name);
}