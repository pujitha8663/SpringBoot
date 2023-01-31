package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.bean.Spring_Employee;
import com.mysql.cj.protocol.Resultset;

public class Employee_Impl implements EmployeeDao{

   DataSource ds;
   
	public void setDs(DataSource ds) {
	this.ds = ds;
}

@Override
	public void save(Spring_Employee employee) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement ps =null;
		try {
			con=ds.getConnection();
			ps =con.prepareStatement("insert into employee values(?,?,?)");
			ps.setInt(1, employee.getEid());
			ps.setString(2, employee.getEname() );
			ps.setDouble(3, employee.getEsalary());
			ps.executeUpdate();
			System.out.println("aipoaindhi");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			
	}

@Override
public void update(Spring_Employee employee) {
	Connection con = null;
	PreparedStatement ps = null;
	try {
		con=ds.getConnection();
		ps=con.prepareStatement("Update employee set ename=?,esalary=? where eid=?");
		
		ps.setString(1, employee.getEname());
		ps.setDouble(2, employee.getEsalary());
		ps.setInt(3, employee.getEid());
		ps.executeUpdate();
		ps.close();
		con.close();
		System.out.println("aindhi");
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}

@Override
public void delete(Integer id) {
	Connection con = null;
	PreparedStatement ps= null;
	
	try {
		con = ds.getConnection();
		ps= con.prepareStatement("delete from employee where eid=?");
		ps.setObject(1, id);
		ps.executeUpdate();
		con.close();
		ps.close();
		System.out.println("aipoindhi");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}

@Override
public List<Spring_Employee> findAll() {
	Connection con= null;
	PreparedStatement ps= null;
	ResultSet rs = null;
	List<Spring_Employee > emp = new ArrayList<>();
	 try {
		con = ds.getConnection();
		ps= con.prepareStatement("select * from employee");
		rs=ps.executeQuery();
		
		 while(rs.next()) {
			Spring_Employee  st = new Spring_Employee();
			st.setEid(rs.getInt("eid"));
			st.setEname(rs.getString("ename"));
			st.setEsalary(rs.getDouble("esalary"));
			emp.add(st);
		 }
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	return emp;
}



	

	



	

	

}
