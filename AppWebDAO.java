package servletapplication;

	import java.sql.CallableStatement;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.Statement;
	import java.util.*;

	public class AppWebDAO {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		public void insertUser(String uname, int pwd) {
			try {
				Scanner sc = new Scanner(System.in);
				Class.forName("com.mysql.cj.jdbc.Driver");

				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/logincred", "root", "Ragini@2001");
				System.out.println("Enter username");
				uname = sc.next();
				System.out.println("Enter password");
				pwd = sc.nextInt();
				ps = con.prepareStatement("INSERT INTO loginuser values(?,?)");
				ps.setString(1, uname);
				ps.setInt(2, pwd);
				int i = ps.executeUpdate();
				if (i > 0) {
					System.out.println("success");

				} else {
					System.out.println("not done");
				}

				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		public ResultSet getAllUsers() {
			try {

				Class.forName("com.mysql.cj.jdbc.Driver");

				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/logincred", "root", "Ragini@2001");

				ps = con.prepareStatement("SELECT * FROM loginuser ");

				rs = ps.executeQuery();

				while (rs.next()) {
					System.out.println(rs.getString(1) + " " + rs.getInt(2));
				}
				con.close();
			} catch (Exception ex) {
				ex.printStackTrace();

			}
			return rs;

		}
		


}
