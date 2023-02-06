package projet.config;
import java.sql.*;

public class DB {
	
	private Connection conn; 

	

	public DB() {
		// TODO Auto-generated constructor stub
	}
	
	public Connection getConn() {
		return conn;
	}

	public void setConn(Connection conn) {
		this.conn = conn;
	}
	
	public void connection(){
		
    	try{  
    		Class.forName("com.mysql.jdbc.Driver");
            setConn(DriverManager.getConnection("jdbc:mysql://localhost/assi", "root", "password")); 
           
        }
        catch (Exception e){
        	e.printStackTrace();
        }
	}
	
	public void deconnection() {
		try {
			this.conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
