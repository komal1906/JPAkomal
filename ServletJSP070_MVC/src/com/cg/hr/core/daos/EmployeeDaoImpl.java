package com.cg.hr.core.daos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import com.cg.hr.core.beans.Employee;
import com.cg.hr.core.exceptions.EmpException;
import com.cg.hr.core.util.JDBCUtil;

public class EmployeeDaoImpl implements EmployeeDao {
	private Connection connect;
	
	public EmployeeDaoImpl() throws EmpException
	{
		
		JDBCUtil util=new JDBCUtil();
		connect= util.getConnect();
		
	}
	public ArrayList<Employee> fetchAllEmp() throws EmpException
	{
		
		Statement stmt= null;
		ResultSet rs=null;
		ArrayList<Employee> empList= new ArrayList<>();
		try {
			
			stmt= connect.createStatement();
			rs=stmt.executeQuery("SELECT emp_id,emp_name,emp_sal from emp19");
			while (rs.next())
			{
				int empid=rs.getInt("emp_id");
				String empname=rs.getString("emp_name");
				Float empsal= rs.getFloat("emp_sal");
				Employee emp=new Employee( empid,empname,empsal);
				empList.add(emp);
			}
			return empList;
		} catch (Exception e) {
			throw new EmpException("Wrong",e);
	
		}
		finally
		{
			try {
				if(rs!=null)
				{
					rs.close();
				}
				if(stmt!=null)
				{
					stmt.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				throw new EmpException("wrong");
			}
		}
		
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		if(connect!=null)
		{
			connect.close();
		}
		super.finalize();
	}
}
