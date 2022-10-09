import java.net.ConnectException;
import java.sql.*;
import java.io.*;
public class DynamicInsert {
    public static void main(String[] args) {

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/jdbclearning";
            String username= "root";
            String password ="Muz@8867294668";

            Connection con= DriverManager.getConnection(url, username, password);

            String q= "insert into table1 (tName,tCity) values (?,?)";
            PreparedStatement pstmt = con.prepareStatement(q);

            //buffered reader and input stream
            BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter name: ");
            String name = br.readLine();  // to read the input

            System.out.println("Enter city : ");
            String city = br.readLine(); // to read the input

            pstmt.setString(1,name);
            pstmt.setString(2,city);

            pstmt.executeUpdate();
            System.out.println(" INSERTED");
            con.close();

        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
