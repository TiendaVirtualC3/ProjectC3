package config;

import java.sql.Connection;
import java.sql.DriverManager;


public class conexion {
    Connection con;
    String url = "jdbc:mysql://localhost:3306/db_tienda";
    String user = "root";
    String password = "1006876354";
    
    public Connection conexion(){
        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	System.out.println("Connecting to database..............."+url);
            con = DriverManager.getConnection(url, user, password);
            if(con!=null) {
            	System.out.println("Conexion establecida");
            }
        
        } catch (Exception e) {
        	System.out.println(e);
        }
        return con;
    }
 }  
