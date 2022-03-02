package jdbcexp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RetriveRecord {

	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement ps = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/worklifedb", "root", "password");

			String sql = "select * from  emp1 where emp_id=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, "Ratan"); // 1 specifies the first parameter in the query

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getString("emp_id"));
				System.out.println(rs.getString("emp_name"));
				System.out.println(rs.getInt("age"));
			}
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
