package JDBC_Demo.JDBC_proj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Delete {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql:///JDBC_test", "root", "Password123");

			Statement st = con.createStatement();
			String query = "DELETE FROM EMPLOYEE WHERE EMP_ID = 4";

			st.execute(query);
			
			System.out.println("The record was deleted succesfully!");
			
//			query = "Select * from employee";
//
//			ResultSet rs = st.executeQuery(query);
//			while(rs.next()) {
//				System.out.println(rs.getString(1) + " " + rs.getString(2) +  " " + rs.getString(3) + " " + rs.getString(4));
//			}
			con.close();
		} catch(SQLException ex) {
			System.out.println(ex);
		}
	}

}
