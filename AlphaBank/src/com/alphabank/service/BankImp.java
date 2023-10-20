package com.alphabank.service;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import com.alphabank.dao.BranchDAO;
import com.alphabank.dao.CustomerDAO;
import com.alphabank.dao.EmployeeDAO;
import com.alphabank.dao.LoanDAO;
import com.alphabank.model.Account;
import com.alphabank.model.Branch;
import com.alphabank.model.Customer;
import com.alphabank.model.Employee;
import com.alphabank.model.Loan;
import com.alphabank.model.Transaction;

public class BankImp implements Bank{

	@Override
	public boolean add(Customer customer) {
		 CustomerDAO custdao = new CustomerDAO();
		    Scanner scanner = new Scanner(System.in);
		    System.out.println("*********** Enter Customer Details to Create Customer ****************");

		    // Gather customer information from the user
		    System.out.print("Login: ");
		    String login = scanner.next();

		    System.out.print("Password: ");
		    String password = scanner.next();

		    System.out.print("Name: ");
		    String name = scanner.next();

		    System.out.print("Phone: ");
		    String phone = scanner.next();

		    System.out.print("Email: ");
		    String email = scanner.next();

		    System.out.print("Registration Date (dd/MM/yyyy): ");
		    String dateStr = scanner.next();

		    boolean success = custdao.addCustomerDao(login, password, name, phone, email, dateStr);
			return success;
	}

	@Override
	public boolean add(Employee employee) {
		EmployeeDAO empdao = new EmployeeDAO();
		Scanner scanner = new Scanner(System.in);
		System.out.println("*********** Enter Employee Details to Create Employee ****************");

		// Gather customer information from the user

		System.out.print("Name: ");
		String name = scanner.next();

		System.out.print("Phone: ");
		String phone = scanner.next();

		System.out.print("Position: ");
		String position = scanner.next();

		System.out.print("Login: ");
		String login = scanner.next();

		System.out.print("Password: ");
		String password = scanner.next();

		boolean success = empdao.addEmployeeDao(name, phone, position, login, password);
		return success;
	}

	@Override
	public boolean add(Account account) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean add(Loan loan) {
		 LoanDAO loanDAO = new LoanDAO();
		 Loan loanObj = new Loan();
		    Scanner scanner = new Scanner(System.in);
		    System.out.println("*********** Enter Loan Details to Create Locan Account ****************");
		    
		    int loanDuration;
		    
		    int min = 1000000;
			int max = 9999999;
			int id = (int) Math.floor(Math.random() *(max - min + 1) + min);		

		    System.out.print("Branch id: ");
		    int bId = scanner.nextInt();
		    
		    System.out.print("Registration Date (dd/MM/yyyy): ");
		    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
		    LocalDateTime now = LocalDateTime.now();  
		    //Date dateStr =  ;
		    
		    System.out.println("Enter loan type: ");
		    String loanType = scanner.next();
		    
		    System.out.println("Enter Loan Duration: ");
		    loanDuration = scanner.nextInt();
		    
		    int finalLoanDuration=0;
		    if(loanType.equalsIgnoreCase("Personal Loan")) {
		    	if(loanDuration <= 5) {
		    		finalLoanDuration =  loanDuration;
	    		}
		    	if(loanDuration>5) {
		    		System.out.println("Max loan Duration for Personal Loan can be 5 Years.!");
		    	}	
		    }else if(loanType.equalsIgnoreCase("Two Wheeler Loan") || loanType.equalsIgnoreCase("Car Loan") ) {
		    		if(loanDuration <= 7) {
		    			finalLoanDuration = loanDuration;		    		}
		    		if(loanDuration>7) {
		    			System.out.println("Max loan Duration of Car Loan or Two Wheeler Loan can be 7 Years.!");
		    		}
		    }

		    System.out.print("Name: ");
		    String name = scanner.next();

		    System.out.print("Phone: ");
		    String phone = scanner.next();

		    System.out.print("Email: ");
		    String email = scanner.next();


		 //   boolean success = loanDAO.addLoanDAO(id, bId,loanType,finalLoanDuration, phone, email);
		    return false;
	}

	@Override
	public boolean add(Branch branch) {
		BranchDAO branchdao = new BranchDAO();
		Scanner scanner = new Scanner(System.in);
		System.out.println("*********** Enter Branch Details to Create Branch ****************");

		// Gather customer information from the user

		System.out.print("Branch_id: ");
		String id = scanner.next();

		System.out.print("Address: ");
		String address = scanner.next();

		System.out.print("Phone: ");
		String phone = scanner.next();

		boolean success = branchdao.addBranchDao(id, address, phone);
		return success;
	}

	@Override
	public boolean add(Transaction transaction) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Customer> findAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer findCustomer(String param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> findAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee findEmployee(String param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> findAccountsOfCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Loan> findLoansOfCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Transaction> findTransactionsOfAccount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Transaction> findTransactionsOfCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTransactionDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Employee employee) {
		EmployeeDAO employeeDAO = new EmployeeDAO();

		// Update the employee's information using the provided Employee object
		boolean success = employeeDAO.updateEmployeeDao(employee);

		return success;
	}

	@Override
	public boolean update(Account account) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Loan loan) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Branch branch) {
		BranchDAO branchDAO = new BranchDAO();

		// Update the employee's information using the provided Employee object
		boolean success = branchDAO.updateBranchDao(branch);

		return success;
	}

	@Override
	public boolean delete(Customer customer) {
		CustomerDAO custdao = new CustomerDAO();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter ID to delete: ");
		int customerId = scanner.nextInt();
		boolean success = custdao.deleteCustomerDao(customerId);
		return success;
	}

	@Override
	public boolean delete(Employee employee) {
		EmployeeDAO empdao = new EmployeeDAO();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter ID to delete: ");
		int employeeId = scanner.nextInt();
		boolean success = empdao.deleteEmployeeDao(employeeId);
		return success;
	}

	@Override
	public boolean delete(Account account) {
		// TODO Auto-generated method stub
		
		return false;
	}

	@Override
	public boolean delete(Loan loan) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Branch branch) {
		BranchDAO branchdao = new BranchDAO();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter ID to delete: ");
		String branchId = scanner.next();
		boolean success = branchdao.deleteBranchDao(branchId);
		return success;
	}
	// Implementation of Bank methods
	}
