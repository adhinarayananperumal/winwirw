package jdbcexp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateRecord {
	
	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/worklifedb", "root", "password");

			String sql = "update  emp1 set age=? , emp_name=? where emp_id=?";

			ps = con.prepareStatement(sql);

			ps.setInt(1, 23); // 1 specifies the first parameter in the query
			ps.setString(2, "Ravi1");
			ps.setString(3, "e345");

			int i = ps.executeUpdate();
			
			System.out.println("Employee updated successfully   " + i);

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
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
