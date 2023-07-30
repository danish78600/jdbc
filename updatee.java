import java.sql.*;
class updatee{
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

        
        String q="update oneto set City=? where PersonID=?";

        

        PreparedStatement stm=con.prepareStatement(q);
        stm.setString(1,"mohali");
        stm.setInt(2,1);

        stm.executeUpdate();
        System.out.println("updated.......");
        con.close();

        } catch (Exception e) {
           System.out.println("error is"+e);
        }

    }
}