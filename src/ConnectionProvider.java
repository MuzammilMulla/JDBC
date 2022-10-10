import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
   private  static Connection con;

   public static Connection getConnection() {

       try{
       if(con == null){
       Class.forName("com.mysql.cj.jdbc.Driver");
       String url= "jdbc/mysql://localhost:3306/jdbclearning";
       String username="root";
       String password ="Muz@8867294668";
       con = DriverManager.getConnection(url, username, password);
       }
       }
       catch (Exception e ){
           e.printStackTrace();
       }
       return con;
    }
}
