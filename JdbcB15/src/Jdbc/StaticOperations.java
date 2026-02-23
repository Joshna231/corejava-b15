package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StaticOperations {

	//

	public void saveEmployee() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Jdbcb15", "root", "root");
			Statement stmt = con.createStatement();
			int insertedrows = stmt.executeUpdate(
					"insert into employee(name,dept,salary,city) values('Thabitha','sql',10000,'Banglore')");
			System.out.println("inserted rows" + insertedrows);
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public void updateEmployee() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Jdbcb15", "root", "root");
			Statement stmt = con.createStatement();
			int updaterows = stmt.executeUpdate("update Jdbcb15.employee set dept='aws' where eid=4");
			System.out.println("update rows" + updaterows);
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public void DeleteEmployee() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Jdbcb15", "root", "root");
			Statement stmt = con.createStatement();
			int deleterows = stmt.executeUpdate("delete from employee where eid=11");
			System.out.println("delete rows" + deleterows);
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public void GetAllemps() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Jdbcb15", "root", "root");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from employee");
			
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String dept = rs.getString(3);
				long salary = rs.getLong(4);
				String city = rs.getString(5);
System.out.println("id:  " + id + " name:  " + name + " dep: " + dept + " salary: " + salary + " city: " + city);
			}
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		StaticOperations sop = new StaticOperations();
		// sop.saveEmployee();
		// sop.updateEmployee();
		// sop.DeleteEmployee();
		sop.GetAllemps();
	}
}
