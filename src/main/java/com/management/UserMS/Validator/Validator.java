//package com.management.UserMS.Validator;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import com.management.UserMS.dto.BuyerDTO;
//import com.management.UserMS.dto.SellerDTO;
//import com.management.UserMS.entity.Buyer;
//
//public class Validator {
//	public static boolean buyerValidate(BuyerDTO buyerDto) throws Exception {
//		if(!(name(buyerDto.getName()))) {
//			throw new Exception("Name is not valid");
//		}
//		else if(!(emailid(buyerDto.getEmail()))) {
//			throw new Exception("EmailID is not valid");
//		}
//		else if(!(contactno(buyerDto.getPhoneNumber()))) {
//			throw new Exception("Phone Number is not valid");
//		}
//		else if(!(password(buyerDto.getPassword()))) {
//			throw new Exception("Phone Number is not valid");
//			}
//		return false;
//		}
//	
//		public static boolean name(String name) {
//			if(name.matches("[a-zA-Z][a-zA-Z ]+[a-zA-Z]$)")) {
//				return true;
//			}
//			else {
//				return false;
//			}}
//		
//		public static boolean emailid(String mail) {
//			if(mail.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" +
//					"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")) {
//				return true;
//			}else {
//				return false;
//			}
//		}
//		
//		public static boolean contactno(String number) {
//			//String a=Long.toString(number);
//			if(number.matches("^(?:(?:\\+|0{0,2})91(\\s*[\\-]\\s*)?|[0]?)?[789]\\d{9}$")){
//				return true;
//			}else {
//				return false;
//			}
//		}
//		
//		public static boolean password(String password) {
//			if(password.matches("^(?=.*[0-9])"
//	                + "(?=.[a-z])(?=.[A-Z])"
//	                + "(?=.*[@#$%^&+=])"
//	                + "(?=\\S+$).{7,20}$")) {
//				return true;
//			}else {
//				return false;
//			}
//			
//		}
//		
//		public static void sellerValidate(SellerDTO sellerDto) throws Exception {
//			if(!(Name(sellerDto.getName()))) {
//				throw new Exception("Name is not valid");
//			}
//			else if(!(Emailid(sellerDto.getEmail()))) {
//				throw new Exception("EmailID is not valid");
//			}
//			else if(!(Contactno(sellerDto.getPhoneNumber()))) {
//				throw new Exception("Phone Number is not valid");
//			}
//			else if(!(Password(sellerDto.getPassword()))) {
//				throw new Exception("Phone Number is not valid");
//				}
//			}
//		
//			public static boolean Name(String name) {
//				if(name.matches("[a-zA-Z][a-zA-Z ]+[a-zA-Z]$)")) {
//					return true;
//				}
//				else {
//					return false;
//				}}
//			
//			public static boolean Emailid(String mail) {
//				if(mail.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" +
//						"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")) {
//					return true;
//				}else {
//					return false;
//				}
//			}
//			
//			public static boolean Contactno(String number) {
//				//String a=Long.toString(number);
//				if(number.matches("^(?:(?:\\+|0{0,2})91(\\s*[\\-]\\s*)?|[0]?)?[789]\\d{9}$")){
//					return true;
//				}else {
//					return false;
//				}
//			}
//			
//			public static boolean Password(String password) {
//				if(password.matches("^(?=.*[0-9])"
//		                + "(?=.[a-z])(?=.[A-Z])"
//		                + "(?=.*[@#$%^&+=])"
//		                + "(?=\\S+$).{7,20}$")) {
//					return true;
//				}else {
//					return false;
//				}
//				
//			}
//	}