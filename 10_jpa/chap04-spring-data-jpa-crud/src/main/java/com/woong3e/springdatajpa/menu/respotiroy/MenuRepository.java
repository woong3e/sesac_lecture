package com.woong3e.springdatajpa.menu.respotiroy;

import com.woong3e.springdatajpa.menu.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu, Integer> {

}

