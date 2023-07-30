import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
public class second{
    public static void main(String[] args) {
        System.out.println("1. creating a table");
        System.out.println("2. for reading all data of a table");
        System.out.println("3. for updating data in a table");
        
        Scanner obj=new Scanner(System.in);
       System.out.println("enter the name of the table");
        String name=obj.nextLine();
        System.out.println("enter your choice");

        int choice=obj.nextInt();

        
        switch(choice)
        {
            case 1:
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

        String q="CREATE TABLE "+name+"(PersonID int,Address varchar(255),City varchar(255))";
        

        

        PreparedStatement stm=con.prepareStatement(q);
        stm.executeUpdate();
        System.out.println("table created");
        con.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
