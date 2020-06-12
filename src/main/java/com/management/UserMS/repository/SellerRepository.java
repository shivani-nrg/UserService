package com.management.UserMS.repository;



import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.management.UserMS.dto.SellerDTO;
import com.management.UserMS.entity.Seller;


@Repository
@Transactional
public interface SellerRepository extends JpaRepository<Seller,Integer>{
	public Seller findBySellerId(int Id);

	public Seller findByEmail(String email);

	public Seller findByPhoneNumber(String phoneNumber);

	public void save(SellerDTO sellerDTO);
}