package com.woong3e.springdatajpa.menu.repository;

import com.woong3e.springdatajpa.menu.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
