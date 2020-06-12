package com.management.UserMS.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

//import com.infosys.infytel.customer.dto.PlanDTO;
//import com.management.UserMS.Validator.BuyerValidator;
import com.management.UserMS.dto.BuyerDTO;
import com.management.UserMS.dto.CartDTO;
import com.management.UserMS.dto.OrderDetailsDTO;
import com.management.UserMS.dto.ProductDTO;
import com.management.UserMS.dto.WishlistDTO;
import com.management.UserMS.entity.Buyer;
import com.management.UserMS.repository.CartRepository;
import com.management.UserMS.repository.WishlistRepository;
import com.management.UserMS.service.BuyerService;

@RestController
@CrossOrigin
@RequestMapping(value="/api")
public class BuyerController {

	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	BuyerService buyerService;
	
	@Autowired
	CartRepository cartRepo;
	
	@Autowired
	WishlistRepository wishlistRepo;

	

	@PostMapping(value="buyer/register",  consumes = MediaType.APPLICATION_JSON_VALUE)
	public String registerUser(@RequestBody BuyerDTO buyerDTO) {
		try {
		logger.info("Registration request for buyer {}", buyerDTO);
		buyerDTO.setIsActive(true);
		buyerDTO.setIsPrivileged(false);
		buyerDTO.setRewardPoints(0);
		buyerService.registerBuyer(buyerDTO);
		return "Successfull";
		}catch(Exception e) {
			return("Not sucessfull");
		}
	}

	@PostMapping(value = "buyer/login",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String loginBuyer(@RequestBody BuyerDTO buyerDTO) throws Exception {
		try {
			buyerService.buyerLogin(buyerDTO);
			return "Login Successfull";
		} catch (Exception e) {
			return " Login unsuccessfull, check your credentials and try again";
		}
	}


	@PostMapping(value = "buyer/deactivate",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String deactivateBuyer(@RequestBody BuyerDTO buyerDTO) throws Exception{
			try {
				buyerService.deactivateBuyer(buyerDTO);
			} catch (Exception e) {
				throw new Exception("Invalid Credentials");
			}
			return "Account Deactivated";
	
	}
	
	@GetMapping(value = "rewardPoint/{buyerId}")
	public int getRewardPoints(@PathVariable Integer buyerId) {
		System.out.println("BuyerID is:"+ buyerId);
		int Points = buyerService.getRewardPoints(buyerId);
		return Points;
	
	}
	
	@PutMapping(value = "rewardPoint/update/{buyerId}/{point}")
	public void updateRewardPoint(@PathVariable Integer buyerId,@PathVariable Integer point) {
	
		buyerService.updateRewardPoint(buyerId, point);

	}
	
	@GetMapping(value = "buyer/isPrivilege/{buyerId}")
	public boolean isBuyerPrivileged(@PathVariable Integer buyerId) {
		System.out.println("inside buyer privilege");
		return buyerService.IsPrivileged(buyerId);
	}
	
	@PostMapping(value = "buyer/products/wishlist/{buyerId}",consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addProducttoWishlist(@PathVariable Integer buyerId,@RequestBody ProductDTO productDTO) {
		productDTO= new RestTemplate().getForObject("http://localhost:3457/products"+productDTO.getProdId(),ProductDTO.class);
		buyerService.addProductTowishlist(productDTO);
	}
	
	@PostMapping(value = "buyer/products/cart/{buyerId}",consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addProducttoCart(@PathVariable Integer buyerId,@RequestBody ProductDTO productDTO) {
		productDTO= new RestTemplate().getForObject("http://localhost:3457/products"+productDTO.getProdId(),ProductDTO.class);
		buyerService.addProductToCart(productDTO);
	}
	
	@DeleteMapping(value = "buyer/cart/remove/{prodId}",consumes = MediaType.APPLICATION_JSON_VALUE)
	public void removeProductfromCart(@PathVariable Integer prodId)
	{
		cartRepo.deleteById(prodId);
	
	}
	@DeleteMapping(value = "buyer/wishlist/remove/{prodId}",consumes = MediaType.APPLICATION_JSON_VALUE)
	public void removeProductfromWishlist(@PathVariable Integer prodId)
	{
		wishlistRepo.deleteById(prodId);
	
	}
	
	@GetMapping(value = "buyer/wishlist/{buyerId}")
	public List<WishlistDTO> allWishlistItems(@PathVariable Integer buyerId) {
		System.out.println("inside buyer privilege");
		return buyerService.allWishlistItems(buyerId);
	}
	
	
	@GetMapping(value = "buyer/cart/{buyerId}")
	public List<CartDTO> allCartItems(@PathVariable Integer buyerId) {
		System.out.println("inside buyer privilege");
		return buyerService.allCartItems(buyerId);
	}
	

	
}



