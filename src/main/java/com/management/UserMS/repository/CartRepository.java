package com.management.UserMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.management.UserMS.entity.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer> {

}
