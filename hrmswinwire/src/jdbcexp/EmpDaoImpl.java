package jdbcexp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpDaoImpl {

	Connection con = null;
	PreparedStatement ps = null;

	private Connection getConnection() throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/worklifedb", "root", "password");
		} catch (ClassNotFoundException e) {
			// e.printStackTrace();
			throw new DriverNotFoundExpection();
		}
		return con;
	}

	void saveEmployee(EmpPojo empPojo) {
		try {
			con = getConnection();
			String sql = "insert into emp1 values(?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, "Priya"); // 1 specifies the first parameter in the query
			ps.setString(2, "Kumar");
			ps.setInt(3, 45);
			int i = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DataBaseConnectionProblem();
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

	EmpPojo getEmployee(String empId) {
		EmpPojo empPojo = new EmpPojo();

		try {
			con = getConnection();
			String sql = "select * from  emp1 where emp_id=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, empId); // 1 specifies the first parameter in the query

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				empPojo.setEmpId(rs.getString("emp_id"));
				empPojo.setName(rs.getString("emp_name"));
				empPojo.setAge(rs.getInt("age"));
			}
			return empPojo;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DataBaseConnectionProblem();
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
