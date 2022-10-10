import java.sql.*;
public class Select {
    public static void main(String[] args) {

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/jdbclearning";
            Connection con = DriverManager.getConnection(url, "root", "Muz@8867294668");
            String q= "select * from table1";
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(q);

            while (resultSet.next()){
                int id= resultSet.getInt(1);
                String city= resultSet.getString(2);
                String name= resultSet.getString(3);

                System.out.println(id +" "+ city+ " "+ name);
            }
            con.close();

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
