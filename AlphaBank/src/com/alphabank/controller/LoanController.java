package com.alphabank.controller;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import com.alphabank.model.Branch;
import com.alphabank.model.Customer;
import com.alphabank.model.Loan;

public class LoanController {
	
	Scanner sc = new Scanner(System.in);
	private int id;
	private Customer customer;
	private Branch branch;
	private Date startingDate;
	private Date dueDate;
	private BigDecimal amount;

	/*
	 * public Loan createLoan(){
	 * 
	 * return ;
	 * 
	 * }
	 */
	
	public boolean updateLoan(){
		
		return false;
		
	}
	
	public boolean removeLoan(){
		
		return false;
	}
	
	public List<Loan> getLoansOfCustomer(){
		
		return null;
		
	}
	
	public String getLoanDetails() {
		
		return "";
		
	}
	
}

