import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class Update {
    public static void main(String[] args) {

        try{
//        Connection con= ConnectionProvider.getConnection();
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/jdbclearning";
            Connection con = DriverManager.getConnection(url,"root", "Muz@8867294668");

        String q = "update table1 set tName = ? , tCity=? where tID =?";
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

            System.out.println("enter new name :");
            String name = br.readLine();

            System.out.println("enter city name :");
            String city = br.readLine();

            System.out.println("enter id :");
            int id = Integer.parseInt(br.readLine());

            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setString(1,name);
            pstmt.setString(2,city );
            pstmt.setInt(3,id);

            pstmt.executeUpdate();
            System.out.println( "\n  ************ VALUES UPDATED>>>> \n ");
            con.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
