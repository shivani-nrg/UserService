package com.management.UserMS.service;

import java.util.regex.Pattern;

import javax.naming.InvalidNameException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.management.UserMS.controller.SellerController;
import com.management.UserMS.dto.BuyerDTO;
import com.management.UserMS.dto.SellerDTO;
import com.management.UserMS.dto.SellerLoginDTO;
import com.management.UserMS.entity.Buyer;
import com.management.UserMS.entity.Seller;
import com.management.UserMS.repository.SellerRepository;
@Service
public class SellerService {
	private static final Logger LOGGER = LoggerFactory.getLogger(SellerController.class);
	@Autowired
	SellerRepository sellerRepo;
	
	@Autowired
	SellerService sellerService;

	
	
	public void sellerRegisterion(SellerDTO sellerDTO) throws Exception {
		validateSeller(sellerDTO);
		Seller se=sellerDTO.createEntity();
		sellerRepo.save(se);
	}
	
	private void validateSeller(SellerDTO sellerDTO) throws Exception {
		
		
		if(!isValidName(sellerDTO.getName()))
			throw new InvalidNameException("Invalid Name");
		if(!isValidEmail(sellerDTO.getEmail()))
			throw new Exception("Invalid Email");
		if(!isValidPhoneNumber(sellerDTO.getPhoneNumber()))
			throw new Exception("Invalid Phonenumber");
		if(!isvalidPassword(sellerDTO.getPassword()))
			throw new Exception("Invalid Password");
		if(!isAlreadyPhoneNumberExist(sellerDTO.getPhoneNumber()))
			throw new Exception("PhoneNumber Already exists");
		if(!isAlreadyEmailIdExist(sellerDTO.getEmail()))
			throw new Exception("Email Already exists");
		
	}

	private boolean isAlreadyEmailIdExist(String email) {
		
		Seller seller=sellerRepo.findByEmail(email);
		if (seller!=null)
			return false;
		return true;
	}

	private boolean isAlreadyPhoneNumberExist(String phoneNumber) {
		
		Seller seller = sellerRepo.findByPhoneNumber(phoneNumber);
		if (seller!=null)
			return false;
		return true;
	}

	private boolean isvalidPassword(String password) {
		
		return Pattern.matches("(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*]).{7,20}$",password);
	}

	private boolean isValidPhoneNumber(String phoneNumber) {
		
		return Pattern.matches("^\\d{10}$", phoneNumber);
	}

	private boolean isValidEmail(String email) {
		
		return Pattern.matches("^[A-Za-z0-9+_.-]+@(.+)$",email);
	}

	private boolean isValidName(String name) {
		
		return Pattern.matches("^[a-zA-Z]+[-a-zA-Z\\s]+([-a-zA-Z]+)$", name);
	}

	
	public boolean sellerLogin(SellerDTO sellerDTO) throws Exception {

		Seller seller = sellerRepo.findByEmail(sellerDTO.getEmail());
		if (seller != null) {
			if (seller.getPassword().equals(sellerDTO.getPassword())) {
			return true;
			} else {
				throw new Exception("BuyerLogin:Invalid Password");
			}
		}
		return false;
	}
	
	public boolean deactivateSeller(SellerDTO sellerDTO) throws Exception {

		Seller seller = sellerRepo.findByEmail(sellerDTO.getEmail());
		if (seller != null) {
			if(seller.getPassword().equals(sellerDTO.getPassword())) {
			seller.setIsActive(false);
			sellerRepo.save(seller);
			return true;
		} else {
			throw new Exception("Invalid Email ID/Password ");
		}
		}
			return false;
		}
	
}