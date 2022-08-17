package JDBC_Demo.JDBC_proj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Insert {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql:///JDBC_test", "root", "Password123");

			Statement st = con.createStatement();
			String query = "INSERT INTO employee(EMP_ID, EMP_FNAME, EMP_LNAME, ADDRESS) VALUES (4, 'ALEX', 'ALVARADO', 'MEXICO')";

			st.execute(query);
			
			System.out.println("The record was inserted succesfully!");
			
//			query = "Select * from employee";
//
//			ResultSet rs = st.executeQuery(query);
//			while(rs.next()) {
//				System.out.println(rs.getString(1) + " " + rs.getString(2));
//			}
			con.close();
		} catch(SQLException ex) {
			System.out.println(ex);
		}
	}

}
