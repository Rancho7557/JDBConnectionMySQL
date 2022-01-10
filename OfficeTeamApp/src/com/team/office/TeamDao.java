package com.team.office;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class TeamDao {
 
	   public static boolean insertTeamTcsToDB(Team tm) {
	 
		   boolean f = false;
		   
		   try {
			   //JDBC CODE...!
			   Connection con = CP.createC();
			   String q="insert into Team(tcsname,tcsphoneNo,tcsCity) values(?,?,?)";
			   
			   //prepared Statement
			   PreparedStatement pstmt = con.prepareStatement(q);
			   
			   //set the values of parameter
			   pstmt.setString(1, tm.getTcsName());
			   pstmt.setString(2, tm.getTcsPhoneNo());
			   pstmt.setString(3, tm.getTcsCity());
			   
			   //execute....!
			   pstmt.executeUpdate();
			   f = true;
			   
		   } catch (Exception e) {
			   //TODO: handle exception
			   e.printStackTrace();
		   }
		   return f;
     }

	public static boolean deleteTeam(int officeId) {
		
		// TODO Auto-generated method tm
		 
			   boolean f = false;
			   
			   try {
				   //JDBC CODE...!
				   Connection con = CP.createC();
				   String q="delete from Team where tcsId = ?";
				   
				   //prepared Statement
				   PreparedStatement pstmt = con.prepareStatement(q);
				   
				   //set the values of parameter
				   pstmt.setInt(1, officeId);
				   
				   
				   //execute....!
				   pstmt.executeUpdate();
				   f = true;
				   
			   } catch (Exception e) {
				   //TODO: handle exception
				   e.printStackTrace();
			   }
			   return f;
	     }

	public static void showAllTeam() {
		// TODO Auto-generated method stub
		
		 try {
			   //JDBC CODE...!
			   Connection con = CP.createC();
			   String q="select * from Team;";
			   Statement stmt = (Statement) con.createStatement();  
			   
			   
			  ResultSet set = ((java.sql.Statement) stmt).executeQuery(q);
			  
			  while(set.next())
			  {
				  int id = set.getInt(1);
				  String name = set.getString(2);
				  String phone = set.getString(3);
				  String city =  set.getString("tcsCity");
				  
				  System.out.println("ID : " + id);
				  System.out.println("Name : " + name);
				  System.out.println("Phone : " + phone);
				  System.out.println("City : " + city);
				  System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
				  
				  
			  }
			    
			   
		   } catch (Exception e) {
			   //TODO: handle exception
			   e.printStackTrace();
		   }
		
		 
	}

	
}

