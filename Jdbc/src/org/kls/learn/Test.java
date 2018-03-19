package org.kls.learn;

import java.beans.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test {
	 public static void main(String[] args)
	 {
	  try
	  {
	   Class.forName("com.mysql.jdbc.Driver");
	   Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/employe","root","root");
	   Statement s=c.createStatement();
	   ResultSet result1=s.executeQuery("select * from emp");
	   while(result1.next())
	   {
	    System.out.println(result1.getString(1));
	    System.out.println(result1.getString(2));
	   }
	  }catch(SQLException e)
	     {
	      System.out.println(e);
	     }
	   catch(Exception i)
	   {
	    System.out.println(i);
	   }
	  
	 }
}
