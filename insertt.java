import java.sql.*;
import java.util.Scanner;
class insertt{
    public static void main(String[] args) {
        try {
        // Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/db";
        Connection con=DriverManager.getConnection(url,"root","dgdk7890");
        if(con.isClosed())
        {
            System.out.println("connection closed....");
        }
        else{
            System.out.println("connection cretaed");
        }
        Scanner obj=new Scanner(System.in);
        System.out.println("enteer the persons id");
        int uniqueid=obj.nextInt();
        
        System.out.println("enteer the address");
        String address=obj.nextLine();
        

        System.out.println("enteer the city");
        String city=obj.nextLine();


        String q="insert into oneto(PersonID,Address,City)VALUES(?,?,?)";
        PreparedStatement stm=con.prepareStatement(q);
        stm.setInt(1,uniqueid);
        stm.setString(2,address);
        stm.setString(3,city);

        stm.executeUpdate();
        System.out.println("inserted data......");
        con.close();

        } catch (Exception e) {
           System.out.println("error is"+e);
        }

    }
}