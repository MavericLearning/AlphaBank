package com.alphabank.service;

import java.util.Scanner;

import com.alphabank.controller.CustomerController;
import com.alphabank.model.Account;
import com.alphabank.model.Customer;

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
			boolean customerLogin = obj.LoginAsCustomer();

			System.out.println("1. Check Balance");
			System.out.println("2. View Customer Information");
			System.out.println("3. Deposit Money");
			System.out.println("4. Withdraw Money");
			System.out.println("5. Update Personal Information");
			System.out.println("6. Display Bank Statement");
			System.out.println("7. Change Password");


			if(customerLogin==true) {
				Scanner inputLogin = new Scanner(System.in);
				int custChoice = inputLogin.nextInt();
				switch (custChoice) {
				case 1: 
					System.out.println("Your current balance is: "+accountObj.getCurrentBalance());
					break;

				case 2:	
					System.out.println("Customer Information:");
					System.out.println("Name: "+accountObj.getCustomer().getName());
					System.out.println("Mobile Number: "+accountObj.getCustomer().getPhone());
					System.out.println("Email: "+accountObj.getCustomer().getEmail());
					
					System.out.println(accountObj.getCustomer().getId());
					System.out.println(accountObj.getCustomer().getLoans());
					System.out.println(accountObj.getCustomer().getAccounts());
					System.out.println(accountObj.getCustomer().getRegistrationDate());
					break;
				case 3:
					Scanner sc = new Scanner(System.in);
					System.out.println("Enter the customer ID:");
					int customerId = sc.nextInt();
					System.out.println("Enter the amount to be deposited:");
					int amountDeposit =sc.nextInt();
					
					CustomerController customerController = new CustomerController();
					Customer cus = customerController.findCustomerByID(customerId);					
					cus.get
					
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
					break;
				}
			}
		}
		break;
		case 2:{
			obj.LoginAsEmployee();
			break;
		}

		default:
			System.out.println("Invalid Choice...");
			break;

		}
	}
}		


