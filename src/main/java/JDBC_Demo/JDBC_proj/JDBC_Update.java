package JDBC_Demo.JDBC_proj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC_Update {

	public static void main(String[] args) {
		String set, cond;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value to set in address: ");
		set = sc.next();
		
		System.out.println("Enter the employee id: ");
		cond = sc.next();
		sc.close();
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql:///JDBC_test", "root", "Password123");

			Statement st = con.createStatement();
			String query = "UPDATE EMPLOYEE SET ADDRESS = '" + set + "' WHERE EMP_ID = " + cond ;

			st.execute(query);
			
			System.out.println("The record was updated succesfully!");
			
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
