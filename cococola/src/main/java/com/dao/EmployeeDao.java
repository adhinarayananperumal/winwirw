package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.pojo.EmployeePojo;

public class EmployeeDao {

	private Connection con = null;
	private PreparedStatement ps = null;

	private int generateEmpId() {
		int max = 100000;
		int min = 1;
		int empId;

		Random rand = new Random();
		empId = rand.nextInt((max - min) + 1) + min;
		return empId;
	}

	private Connection getConnection() throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/worklifedb", "root", "password");
		} catch (ClassNotFoundException e) {
			// e.printStackTrace();
		}
		return con;
	}

	public void saveEmployee(EmployeePojo employeePojo) {
		try {
			employeePojo.setEmpId(generateEmpId());
			con = getConnection();
			String sql = "insert into emp11 values(?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setInt(1, employeePojo.getEmpId()); // 1 specifies the first parameter in the query
			ps.setString(2, employeePojo.getFirstname()); // 1 specifies the first parameter in the query
			ps.setString(3, employeePojo.getLastname());
			ps.setInt(4, employeePojo.getAge());
			int i = ps.executeUpdate();
			System.out.println("No of successfully inserted record" + i);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}

	}

	public List<EmployeePojo> listEmployee() {

		List empList = new ArrayList();
		try {
			con = getConnection();
			String sql = "select * from  emp11";
			ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				EmployeePojo empPojo = new EmployeePojo();
				empPojo.setEmpId(rs.getInt("emp_id"));
				empPojo.setFirstname(rs.getString("emp_firstname"));
				empPojo.setLastname(rs.getString("emp_lastname"));
				empPojo.setAge(rs.getInt("age"));

				empList.add(empPojo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return empList;
	}

	public EmployeePojo getEmployee(int empId) {
		EmployeePojo empPojo = new EmployeePojo();

		try {
			con = getConnection();
			String sql = "select * from  emp11 where emp_id=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, empId); // 1 specifies the first parameter in the query

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				empPojo.setEmpId(rs.getInt("emp_id"));
				empPojo.setFirstname(rs.getString("emp_firstname"));
				empPojo.setLastname(rs.getString("emp_lastname"));
				empPojo.setAge(rs.getInt("age"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return empPojo;
	}

	public void updateEmployee(EmployeePojo employeePojo) {

		try {
			con = getConnection();
			String sql = "update emp11 set emp_firstname=? , emp_lastname=?, age=? where emp_id=?";
			ps = con.prepareStatement(sql);
			ps.setInt(4, employeePojo.getEmpId()); // 1 specifies the first parameter in the query
			ps.setString(1, employeePojo.getFirstname()); // 1 specifies the first parameter in the query
			ps.setString(2, employeePojo.getLastname());
			ps.setInt(3, employeePojo.getAge());
			int i = ps.executeUpdate();
			System.out.println("No of successfully updated record" + i);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}

	}

	public void deleteEmployee(int empId) {
		try {
			con = getConnection();
			String sql = "delete from  emp11 where emp_id=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, empId); // 1 specifies the first parameter in the query
			int i = ps.executeUpdate();
			System.out.println("No of successfully deleted record" + i);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
