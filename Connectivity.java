package immortal;
import java.sql.*;

public class Immortal 
{
    public static void main(String[] args)
    {
        try
        {
        String Query = "Select * from balance";
        Class.forName("com.mysql.cj.jdbc.MysqlDataSource");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/immortal","root","7306323999");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(Query);
        while(rs.next())
        {
        String Name = rs.getString(1);
        System.out.println(Name);
        }
        con.close();
        }
        catch(Exception e)
        {
        }
    }
}
