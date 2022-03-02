import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcExample {

	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/worklifedb", "root", "password");

			String sql = "insert into emp1 values(?,?,?)";

			ps = con.prepareStatement(sql);

			ps.setString(1, "Priya"); // 1 specifies the first parameter in the query
			ps.setString(2, "Kumar");
			ps.setInt(3, 45);

			int i = ps.executeUpdate();
			
			System.out.println("Employee saved successfully");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
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
