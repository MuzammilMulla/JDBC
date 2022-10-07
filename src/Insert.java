import java.sql.*;

public class Insert {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/jdbclearning";
            String username="root";
            String password = "Muz@8867294668";
            Connection con = DriverManager.getConnection(url, username, password);

            //create a query
            String q= "create table table1( tID int(10) primary key auto_increment,tCity varchar(15),tName varchar(20))";

            //create a statement
            Statement stmt = con.createStatement();
            stmt.executeUpdate(q);
            System.out.println("table created ....");


            con.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
