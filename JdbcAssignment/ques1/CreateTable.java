package assignment.ques1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args){
	    String createTable="create table customerdb(custId int primary key,custName varchar(20),address varchar(40),accountNo int,balance double)";
	    Connection conn=null;
		try {
		Class.forName("org.mariadb.jdbc.Driver");
		conn=DriverManager.getConnection("jdbc:mariadb://localhost:3306/sapientdb", "root","Renu@1708");
        if(conn!=null) {
        	System.out.println("Db connected...");
        }
        PreparedStatement st=conn.prepareStatement(""+createTable+"");
        st.execute();
        }catch (ClassNotFoundException e) {
			System.out.println("Driver Not Found...");
        }catch (SQLException e) {
			e.printStackTrace();
        }finally {
    	 try {
    		 conn.close();
    		 
    	 }catch(Exception e){
    		 System.out.println("connection closed..");
     }
	

}
	}
}

