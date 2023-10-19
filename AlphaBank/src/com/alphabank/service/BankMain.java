package com.alphabank.service;

import java.util.Scanner;

import com.alphabank.controller.CustomerController;
import com.alphabank.model.Account;

public class BankMain extends LoginImpl {

	public static void main(String[] args) {
	
		CustomerController b1=new CustomerController();
		//b1.createCustomer();
        //b1.removeCustomer();
		b1.findCustomerByID();
		LoginImpl obj = new LoginImpl();
		Bank objBank = new BankImp();
		Account accountObj = new Account();
		
		Scanner input = new Scanner(System.in);
		System.out.println("-------------------Login-------------------");
		System.out.println("1.Login As Customer");
		System.out.println("2.Login As Employee");
		
		int choice=input.nextInt();
		switch(choice) {

		case 1:{
			 obj.LoginAsCustomer();
			    System.out.println("1. Check Balance");
		 		System.out.println("2. View Customer Information");
		 		System.out.println("3. Deposit Money");
		 		System.out.println("4. Withdraw Money");
		 		System.out.println("5. Update Personal Information");
		 		System.out.println("6. Display Bank Statement");
		 		System.out.println("7. Change Password");
			 boolean customerLogin = obj.LoginAsCustomer();
			 	if(customerLogin==true) {
			 		Scanner inputLogin = new Scanner(System.in);
			 		int custChoice = inputLogin.nextInt();
			 		System.out.println("1. Check Balance");
			 		System.out.println("2. View Customer Information");
			 		System.out.println("3. Deposit Money");
			 		System.out.println("4. Withdraw Money");
			 		System.out.println("5. Update Personal Information");
			 		System.out.println("6. Display Bank Statement");
			 		System.out.println("7. Change Password");
			 		
			 		
			 		
			 		switch (custChoice) {
					case 1: 
						 System.out.println("Your current balance is: "+accountObj.getCurrentBalance());
						break;
						
					case 2:	
						System.out.println("Customer Information:");
						System.out.println("Name: "+accountObj.getCustomer().getName());
						System.out.println("Mobile Number: "+accountObj.getCustomer().getPhone());
						System.out.println("Email: "+accountObj.getCustomer().getEmail());
						break;
					case 3:
						break;
					case 4:
						break;
					case 5:
						break;
					case 6:
						break;
					case 7:
						System.out.println("Password Change");
						break;
					default:
					}
			 	break;
			 	}
			 break;
		}
			
		case 2:{
			obj.LoginAsEmployee();
			break;
		   }
		}
	}		
}

