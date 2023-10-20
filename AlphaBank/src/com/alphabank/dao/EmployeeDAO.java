package com.alphabank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.alphabank.model.Customer;
import com.alphabank.model.Employee;
import com.alphabank.service.BankImp;
import com.alphabank.connection.JDBCConnect;

public class EmployeeDAO {

	public boolean addEmployeeDao(String name,String phone,String position, String login, String password ) {
	    // Database Connection
	    JDBCConnect connection = new JDBCConnect();
	    Connection con = null;
	    PreparedStatement preparedStatement = null;
	    
	    try {
	        con = connection.getConnection();

	        // Create a Customer object
	        Employee employee = new Employee();
	        employee.setName(name);
	        employee.setPhone(phone);
	        employee.setPosition(position);
	        employee.setBranch(null);
	        employee.setManager(employee);
	        employee.setLogin(login); 
	        employee.setPassword(password);;

	        // Insert the customer into the database
	        String insertQuery = "INSERT INTO employees (name,phone,position,login,password ) VALUES (?, ?, ?, ?, ?)";
	        preparedStatement = con.prepareStatement(insertQuery);
	        preparedStatement.setString(1, employee.getName());
	        preparedStatement.setString(2, employee.getPhone());
	        preparedStatement.setString(3, employee.getPosition());
	        preparedStatement.setString(4, employee.getLogin());
	        preparedStatement.setString(5, employee.getPassword());

	        preparedStatement.executeUpdate();

	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        try {
	            if (preparedStatement != null) {
	                preparedStatement.close();
	            }
	            if (con != null) {
	                con.close();
	                System.out.println("Closing Connection......");
	            } else {
	                System.out.println("Can't close the connection.");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	    return true;
	}
	
	
	public boolean deleteEmployeeDao(int id) {

		try {
			JDBCConnect connection = new JDBCConnect();
			Connection con = connection.getConnection();
			PreparedStatement preparedStatement = null;

			String deleteQuery = "DELETE FROM Employees WHERE id = ?";
			preparedStatement = con.prepareStatement(deleteQuery);
			preparedStatement.setInt(1, id);

			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;

	}
	//added recently
	public boolean updateEmployeeDao(Employee employee) {
	    try {
	        JDBCConnect connection = new JDBCConnect();
	        Connection con = connection.getConnection();
	        PreparedStatement preparedStatement = null;

	        // Check if the name and phone number are not empty or null
	        if (employee.getName() != null && !employee.getName().isEmpty() && employee.getPhone() != null && !employee.getPhone().isEmpty()) {
	            // Define the SQL query to update the name and phone number
	            String updateQuery = "UPDATE Employees SET name = ?, phone = ? WHERE id = ?";
	            preparedStatement = con.prepareStatement(updateQuery);

	            // Set the updated values using the Employee object
	            preparedStatement.setString(1, employee.getName());
	            preparedStatement.setString(2, employee.getPhone());
	            preparedStatement.setInt(3, employee.getId());

	            int rowsAffected = preparedStatement.executeUpdate();

	            return rowsAffected > 0;
	        } else {
	            // Handle the case where the name or phone number is empty
	            return false;
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	        return false;
	    }
	}

    }
	



