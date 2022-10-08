import java.sql.*;
public class PracticeConnection {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/practice";
            Connection con = DriverManager.getConnection(url,"root", "Muz@8867294668");

            String q= "create table student (id int primary key, name varchar(20), marks int not null)";
            Statement statement = con.createStatement();
            statement.executeUpdate(q);

            System.out.println("*********** CREATED TABLE STUDENT");

            String q1 = "insert into student  (id,name,marks) values (?,?,?)";
            PreparedStatement statement1 = con.prepareStatement(q1);

            statement1.setInt(1,01);
            statement1.setString(1,"anuj");
            statement1.setInt(1,90);
            statement1.executeUpdate();

            System.out.println("*********** VALUES INSERTED");
            con.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}