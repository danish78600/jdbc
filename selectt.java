import java.sql.*;
class selectt{
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

        String q="select * from oneto";

        

        Statement stm=con.createStatement();
        ResultSet set=stm.executeQuery(q);
        while(set.next())
        {
            int id=set.getInt(1);
            String address=set.getString(2);
            String city=set.getString(3);
            System.out.println(id);
            System.out.println(address);
            System.out.println(city);
        }
        System.out.println("data fetched");
        con.close();

        } catch (Exception e) {
           System.out.println(e);
        }

    }
}