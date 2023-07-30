import java.sql.*;
class first{
    public static void main(String[] args) {
        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/db";
        Connection con=DriverManager.getConnection(url,"root","dgdk7890");
        if(con.isClosed())
        {
            System.out.println("connection closed....");
        }
        else{
            System.out.println("connection cretaed");
        }

        String q="CREATE TABLE oneto (PersonID int,Address varchar(255),City varchar(255))";
        

        Statement stm=con.createStatement();
        stm.executeUpdate(q);
        System.out.println("table created");
        con.close();

        } catch (Exception e) {
           System.out.println("error is"+e);
        }

    }
}