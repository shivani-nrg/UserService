package com.management.UserMS.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.management.UserMS.entity.Wishlist;

public interface WishlistRepository extends JpaRepository<Wishlist, Integer> {

}
