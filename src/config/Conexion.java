package config;

/*Imports*/
//import com.sun.jdi.connect.spi.Connection;
import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {
    
    Connection con;
    public Conexion(){
        try{
//            Class.forName("com.mysql.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/registro","root","123456");
            System.out.println("Se conectó a BD ");
        }catch (Exception e){
            System.out.println("NO SE CONECTÓ A LA BD ");
        }
    }
    
    public Connection getConnection(){
        return con;
    }
    
    
}
