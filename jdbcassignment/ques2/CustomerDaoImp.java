package assignment.ques2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class CustomerDaoImp implements CustomerDao{
	@Override
	public Customer findCustomerById(int id){
		Customer cs=new Customer();
		Connection conn=null;
		String sqlC="select * from customerdb where custId="+id;
		try {
			conn=getConnection();
			if(conn!=null) {
				System.out.println("Db connected...");
			}
			PreparedStatement pst=conn.prepareStatement(""+sqlC+"");
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				cs.setCustomerId(rs.getInt("CUSTID"));
				cs.setName(rs.getString("CUSTNAME"));
				cs.setAddress(rs.getString("ADDRESS"));
				cs.setAccountNo(rs.getInt("ACCOUNTNO"));
				cs.setSalary(rs.getDouble("BALANCE"));				
			}
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
		return cs;
	}
	     
	@Override
	public String save(Customer c) {
		String message="";
		Connection conn=null;
		String sqlC="insert into customerdb(custId,custName,address,accountNo,balance)";
		//System.out.println(""+sqlC+""+" values"+("("+c.getCustomerId()+","+""+c.getName()+""+","+""+c.getAddress()+""+","+c.getAccountNo()+","+c.getSalary()+")"));
		try {
			conn=getConnection();
			if(conn!=null) {
				System.out.println("Db connected...");
			}
			PreparedStatement pst=conn.prepareStatement(""+sqlC+""+" values"+("("+c.getCustomerId()+","+"'"+c.getName()+"'"+","+"'"+c.getAddress()+"'"+","+c.getAccountNo()+","+c.getSalary()+")"));
			int count=pst.executeUpdate();
			message="Data is inserted into the table succesfully";
		}catch (ClassNotFoundException e) {
			System.out.println("Driver Not Found...");
	     }catch (SQLException e) {
				e.printStackTrace();
				message="These customer details already present on the table";
	     }finally {
	    	     try {
	    		 conn.close();
	    		 }catch(Exception e){
	    		 System.out.println("connection closed..");
	    	     }
	         }
		return message;
	}
    @Override
	public String update(int id,Customer c) {
		String message="";
		Connection conn=null;
		//System.out.println("update customerdb set custId="+c.getCustomerId()+" where custId="+id);
		String sqlC="update customerdb set custName="+"'"+c.getName()+"'"+",custId="+c.getCustomerId()+",address="+"'"+c.getAddress()+"'"+",accountNo="+c.getAccountNo()+",balance="+c.getSalary()+" where custId="+id;
		System.out.println(sqlC);
		//String values=""+c.getCustomerId()+","+c.getName()+","+c.getAddress()+","+c.getAccountNo()+","+c.getSalary()+"";
		try {
			conn=getConnection();
			if(conn!=null) {
				System.out.println("Db connected...");
			}
			PreparedStatement pst=conn.prepareStatement(""+sqlC+"");
			int count=pst.executeUpdate();
			message="Data is updated into the table succesfully";
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
		return message;
	}

	@Override
	public String delete(int customerId) {
		String message="";
		Connection conn=null;
		String sqlC="delete from customerdb where custId="+customerId;
		try {
			conn=getConnection();
			if(conn!=null) {
				System.out.println("Db connected...");
			}
			PreparedStatement pst=conn.prepareStatement(""+sqlC+"");
			int count=pst.executeUpdate();
			message="Data is deleted";
		}catch (ClassNotFoundException e) {
			System.out.println("Driver Not Found...");
	     }catch (SQLException e) {
				e.printStackTrace();
				message="There is no data on table for this customerid";
	     }finally {
	    	     try {
	    		 conn.close();
	    		 }catch(Exception e){
	    		 System.out.println("connection closed..");
	    	     }
	         }
		return message;
		
	}

	@Override
	public List<Customer> listAll() {
		List<Customer> li=new ArrayList<>();
		Customer cs=new Customer();
		Connection conn=null;
		String sqlC="select * from customerdb";
		
		try {
			conn=getConnection();
			if(conn!=null) {
				System.out.println("Db connected...");
			}
			PreparedStatement pst=conn.prepareStatement(""+sqlC+"");
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				
				cs.setCustomerId(rs.getInt("CUSTID"));
				cs.setName(rs.getString("CUSTNAME"));
				cs.setAddress(rs.getString("ADDRESS"));
				cs.setAccountNo(rs.getInt("ACCOUNTNO"));
				cs.setSalary(rs.getDouble("BALANCE"));
				li.add(cs);
				
			}
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
		return li;
		
	}
    public Connection getConnection() throws SQLException,ClassNotFoundException{
    	Class.forName("org.mariadb.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mariadb://localhost:3306/sapientdb", "root","Renu@1708");
		return conn;
	
		

	}

}
