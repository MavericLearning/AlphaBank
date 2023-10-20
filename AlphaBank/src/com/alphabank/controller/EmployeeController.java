package com.alphabank.controller;

import java.util.Scanner;

import com.alphabank.model.Customer;
import com.alphabank.model.Employee;
import com.alphabank.service.BankImp;

public class EmployeeController {

	public Employee createEmployee() {

		Scanner sc = new Scanner(System.in);

//			we have added customer in BankIMP.java and called it here
		BankImp bank = new BankImp(); // Create an instance of BankIMP
		Employee employee = new Employee();
		// Call the 'add' method on the BankIMP instance
		if (bank.add(employee)) {
			System.out.println("Employee added successfully!");
		} else {
			System.out.println("Failed to add Employee.");
		}
		return employee;

	}

	// added this
	public boolean updateEmployee() {
		BankImp bank = new BankImp();
		Employee employee = new Employee();

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the Employee ID to update: ");
		int employeeId = scanner.nextInt();
		employee.setId(employeeId);

		System.out.print("Enter new name: ");
		String newName = scanner.next();
		employee.setName(newName);

		System.out.print("Enter new phone number: ");
		String newPhone = scanner.next();
		employee.setPhone(newPhone);

		// Call the update method from BankImp to update the employee's information
		if (bank.update(employee)) {
			System.out.println("Employee information updated successfully!");
			return true;
		} else {
			System.out.println("Failed to update employee information.");
			return false;
		}
	}

	public boolean removeEmployee() {
		BankImp bank = new BankImp(); // Create an instance of BankIMP
		Employee employee = new Employee();
		boolean success = bank.delete(employee);

		if (success) {
			System.out.println("Employee deleted successfully!");
		} else {
			System.out.println("Failed to delete Employee.");
		}
		return true;
	}

	public boolean setManager() {
		return false;

	}

}
