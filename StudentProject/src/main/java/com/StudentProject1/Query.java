package com.StudentProject1;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Query {
	private static final Student Student = null;

	ResultSet rs = null;
	
	String str;
	
	
	
	public int register(String Username , String Password, String Email,String PhoneNumber,String Gender,String UserTpye) throws ClassNotFoundException, SQLException
	{
		str=Username;
		System.out.println();
		String qry = "insert into register values('"+Username+"','"+Password+"','"+Email+"','"+PhoneNumber+"','"+Gender+"','"+UserTpye+"')";
		Connection con = DbConnection.getConnection();
		Statement st = con.createStatement();
		int count = st.executeUpdate(qry);
		return count;
	}
	
//	public String Uname(String Username) throws SQLException, ClassNotFoundException
//	{
//		String user="";
//		String qry="select * from Register_page where Username = '"+Username+"'";
//		Connection con = DbConnection.getConnection();
//		Statement st = con.createStatement();
//		rs = st.executeQuery(qry);
//		
//		user = rs.getString("Username");
//		
//		return user;
//		
//	}

	
public String Login(String Username,String Password) throws SQLException, ClassNotFoundException
{
	String User="";
	String Pass="";
	
	String qry="select * from register where Username = '"+Username+"' and Password = '"+Password+"'";
	Connection con = DbConnection.getConnection();
	Statement st = con.createStatement();
	rs = st.executeQuery(qry);
	
	while(rs.next())
	{
		User = rs.getString("Username");
		Pass = rs.getString("Password");
		
	}
	return User;
	
}

  public int update(String Marks , String Rollno) throws ClassNotFoundException, SQLException
  {
	  String qry ="update Student set Marks = '"+Marks+"' where Rollno = '"+Rollno+"'";
	  Connection con = DbConnection.getConnection();
	  Statement st = con.createStatement();
	  int count = st.executeUpdate(qry);
	  return count;
  }
  
  public int Delete(String Rollno) throws SQLException, ClassNotFoundException
  {
	  String qry = "delete from Student where Rollno = '"+Rollno+"'";
	  Connection con = DbConnection.getConnection();
	  Statement st = con.createStatement();
	  int count = st.executeUpdate(qry);
	  return count;
  }
  
  public int Add(String Sname, String Branch , String Rollno , String Marks) throws ClassNotFoundException, SQLException
  {
	  String qry = "insert into Student values('"+Sname+"','"+Branch+"','"+Rollno+"','"+Marks+"')";
	  Connection con = DbConnection.getConnection();
	  Statement st = con.createStatement();
	  int row = st.executeUpdate(qry);
	  return row;
  }
  
//  public Student dispaly (String Sname , String Branch , String Rollno , String Marks) throws ClassNotFoundException, SQLException
//  {
//	  String Sn="";
//	  String Br="";
//	  String Rn="";
//	  String Mk="";
//	  
//	  String qry ="select * from Student";
//	  Connection con = DbConnection.getConnection();
//	  Statement st = con.createStatement();
//	  rs = st.executeQuery(qry);
//	  
//	  while(rs.next())
//	  {
//		  Sn = rs.getString("Sname");
//		  Br = rs.getString("Branch");
//		  Rn = rs.getString("Rollno");
//		  Mk = rs.getString("Marks");
//		  
//	  }
//	  return Student;
//  }
  
  
}