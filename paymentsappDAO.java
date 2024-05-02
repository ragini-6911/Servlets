package firstWebApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class paymentsappDAO {
	public void insert(user u)
	{
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
				 
				 Connection  con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/registration","root","root");
				 Statement stmt = con.createStatement();
				String query = "insert into user_info(firstname,lastname,phnno,address,dob,userpassword)values('"+u.getFirstname()+"','"+u.getLastname()+"','"+u.getPhnno()+"','"+u.getAddress()+"','"+u.getDob()+"','"+u.getPassword()+"')";
				System.out.println(query);
				stmt.executeUpdate(query);
				con.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}
	public boolean validlogin(String phonenumber,String password)
	{
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
				 
				 Connection  con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/registration","root","root");
				 Statement stmt = con.createStatement();
				String query = "select phono,userpassword from udetails";
				ResultSet rs=stmt.executeQuery(query);
				while(rs.next())
				{
					if(rs.getString("phone_number").equals(phonenumber)&& rs.getString("password").equals(password))
					{
						return true;
					}
				}
				System.out.println(query);
				
				con.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		    return false;
	}

}

