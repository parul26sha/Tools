package code.october;

import java.sql.*;
import java.util.Properties;

public class OracleDataBase {
	public static void main(String args[]){  
		try{  
		//step1 load the driver class  
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		  
		//step2 create  the connection object  
		Connection con=DriverManager.getConnection(  
		"jdbc:oracle:thin:@localhost:1521:xe","test_db","rts");   
		
		Statement stmt=con.createStatement();  
		
		ResultSet rs=stmt.executeQuery("select * from Customer");  
		
	
		System.out.println("Name      Phone      Email      Address");
		while(rs.next())  {
		System.out.println(rs.getString("name")+"      "+rs.getLong("phone")+"      "+rs.getString("email")+"      "+rs.getString("address"));  
		}
		//step5 close the connection object  
		con.close();  
		  
		}
	
		catch(Exception e){ System.out.println(e);}  
		 
		}
	}
