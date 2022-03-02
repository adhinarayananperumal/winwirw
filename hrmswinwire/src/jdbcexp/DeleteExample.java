package jdbcexp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteExample {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/worklifedb", "root", "password");

			String sql = "delete from  emp1 where emp_id=?";

			ps = con.prepareStatement(sql);

			ps.setString(1, "e345"); // 1 specifies the first parameter in the query
			

			int i = ps.executeUpdate();
			
			System.out.println("Employee record deleted successfully");

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
