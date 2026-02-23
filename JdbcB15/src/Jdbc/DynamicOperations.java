package Jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DynamicOperations {

	public void saveEmployee(String name, String dept, long salary, String city) throws SQLException {
		Connection con = JdbcUtil.getConnection();
		try {
			PreparedStatement ptst = con.prepareStatement(
					"insert into employee(name,dept,salary,city) values(?,?,?,?)");
							  ptst.setString(1, name);
							  ptst.setString(2, dept);
							  ptst.setLong(3, salary);
							  ptst.setString(4, city);
							  int insertedRows = ptst.executeUpdate();
							  System.out.println(insertedRows);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			con.close();
		}
		
	}
	
	public void updateEmployee(String dept) throws SQLException {
		Connection con=JdbcUtil.getConnection();
		try {
			PreparedStatement ptst=con.prepareStatement("update employee set dept=? where eid=5");
							  ptst.setString(1, dept);
							  int updatedRows=ptst.executeUpdate();
							  System.out.println(updatedRows);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			con.close();
		}
	}
	
	public void deleteEmployee(int id) throws SQLException {
		Connection con=JdbcUtil.getConnection();
		try {
			PreparedStatement ptst=con.prepareStatement("delete from employee where eid=?");
							  ptst.setInt(1, id);
							  int deletedRows=ptst.executeUpdate();
							  System.out.println(deletedRows);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			con.close();
		}
	}
	
	public void readEmployee(int id) throws SQLException {
		Connection con=JdbcUtil.getConnection();
		try {
			PreparedStatement ptst=con.prepareStatement("select*from jdbcb15.employee where eid=?");
							  ptst.setInt(1, id);
							  ResultSet rs=ptst.executeQuery();
							  
					while(rs.next()) {
						int eid=rs.getInt(1);
						String name=rs.getString(2);
						String dept=rs.getString(3);
						long salary=rs.getLong(4);
						String city=rs.getString(5);
						System.out.println("id: "+eid+" name: "+name+" dept: "+dept+" salary: "+salary+" city: "+city);
					}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			con.close();
		}
	}
	
	public void andEmployee(String dept) throws SQLException {
		Connection con=JdbcUtil.getConnection();
		try {
			PreparedStatement ptst=con.prepareStatement("select*from employee where dept=? and salary>100000");
							  ptst.setString(1, dept);
							  ResultSet rs=ptst.executeQuery();
							  
					while(rs.next()) {
						int id=rs.getInt(1);
						String name=rs.getString(2);
						String depart=rs.getString(3);
						long sal=rs.getLong(4);
						String city=rs.getString(5);
						System.out.println("id: "+id+" name: "+name+" dept: "+depart+" salary: "+sal+" city: "+city);
					}	
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			con.close();
		}
	}
	
	public void orEmployee(String dept,String dept1) {
		Connection con=JdbcUtil.getConnection();
		try {
			PreparedStatement ptst=con.prepareStatement("select*from employee where dept=? or dept=?");
							  ptst.setString(1, dept);
							  ptst.setString(2, dept1);
							  ResultSet rs=ptst.executeQuery();
					
					while(rs.next()) {
						int id=rs.getInt(1);
						String name=rs.getString(2);
						String depart=rs.getString(3);
						long salary=rs.getLong(4);
						String city=rs.getString(5);
						System.out.println("id: "+id+" name: "+name+" dept: "+depart+" salary: "+salary+" city: "+city);
					}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void betweenEmp(long salary,long salary1) throws SQLException {
		Connection con=JdbcUtil.getConnection();
		try {
			PreparedStatement ptst=con.prepareStatement("select*from employee where salary between ? and ?;");
							  ptst.setLong(1, salary);
							  ptst.setLong(2, salary1);
							  ResultSet rs=ptst.executeQuery();
							  
					while(rs.next()) {
						int id=rs.getInt(1);
						String name=rs.getString(2);
						String dept=rs.getString(3);
						long sal=rs.getLong(4);
						String city=rs.getString(5);
						System.out.println("id: "+id+" name: "+name+" dept: "+dept+" salary: "+sal+" city: "+city);
					}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			con.close();
		}
	}
	
	public void readbydeptEmp(String dept) throws SQLException {
		Connection con=JdbcUtil.getConnection();
		try {
			PreparedStatement ptst=con.prepareStatement("select*from employee where dept=?");
							  ptst.setString(1, dept);
							  ResultSet rs=ptst.executeQuery();
					while(rs.next()) {
						int id=rs.getInt(1);
						String name=rs.getString(2);
						String depart=rs.getString(3);
						long salary=rs.getLong(4);
						String city=rs.getString(5);
						System.out.println("id: "+id+" name: "+name+" dept: "+depart+" salary: "+salary+" city: "+city);
					}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			con.close();
		}
	}
	
	public void likeEmp(String name) {
		Connection con=JdbcUtil.getConnection();
		try {
			PreparedStatement ptst=con.prepareStatement("select*from employee where name like ?");
							 ptst.setString(1, name);
							  ResultSet rs=ptst.executeQuery();
					while(rs.next()) {
						  int id=rs.getInt(1);
						  String ename=rs.getString(2);
						  String dept=rs.getString(3);
						  long salary=rs.getLong(4);
						  String city=rs.getString(5);
				System.out.println("id: "+id+" name: "+ename+" dept: "+dept+" salary: "+salary+" city: "+city);
					}	
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void groupEmployee() {
		Connection con=JdbcUtil.getConnection();
		try {
 PreparedStatement ptst=con.prepareStatement("select dept, min(salary), max(salary), sum(salary), avg(salary), count(salary) from employee group by dept");
 				   
 				   ResultSet rs=ptst.executeQuery();
 				   while(rs.next()) {
 					   String depart=rs.getString(1);
 					   long min=rs.getLong(2);
 					   long max=rs.getLong(3);
 					   long sum=rs.getLong(4);
 					   double avg=rs.getDouble(5);
 					   int count=rs.getInt(6);
 					  System.out.println("dept: "+depart+" min: "+min+" max: "+max+" sum: "+sum+" avg: "+avg+" count: "+count);
 				   }
 
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void orderEmployee(String order) {
		Connection con=JdbcUtil.getConnection();
		PreparedStatement ptst=null;
		try {
			if(order.equals("asc")) {
				ptst=con.prepareStatement("select * from employee order by salary asc");
			}else {
				ptst=con.prepareCall("select * from employee order by salary desc");
			}
			ResultSet rs=ptst.executeQuery();
					while(rs.next()) {
						long sal=rs.getLong(4);
						System.out.println(" salary: "+sal);
					}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws SQLException {
		DynamicOperations dop = new DynamicOperations();
		//dop.saveEmployee("Byula", "aws", 120000, "Guntur");
		//dop.updateEmployee("Devops");
		//dop.deleteEmployee(12);
		//dop.readEmployee(5);
		//dop.andEmployee("Java");
		//dop.orEmployee("aws", "sql");
		//dop.betweenEmp(100000l, 200000l);
		//dop.readbydeptEmp("python");
		//dop.likeEmp("%b%");
		//dop.groupEmployee();
		dop.orderEmployee("desc");
		
	}

	}
