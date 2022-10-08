import java.sql.*;
public class PreparedStatementInsert {
    public static void main(String[] args) {

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url= "jdbc:mysql://localhost:3306/jdbclearning";
            String username= "root";
            String password = "Muz@8867294668";

            Connection con = DriverManager.getConnection(url, username, password);

            //creating a query (dynamic , prepared query)
            String q= "insert into table1 (tName,tCity) values (?,?)";
            //get the PreparedStatement Object
            PreparedStatement pstmt = con.prepareStatement(q);

            //set the values
            pstmt.setString(1, "manju");
            pstmt.setString(2,"belgaum");

            pstmt.setString(1,"chinnu");
            pstmt.setString(2,"hirebagewadi");
            pstmt.executeUpdate();

            System.out.println("************************");
            System.out.println("Inserted...");
            System.out.println("************************");

            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
