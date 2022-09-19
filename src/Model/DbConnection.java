package Model;
import java.sql.*;
import javax.swing.JOptionPane;
public class DbConnection 
{
    private static Connection con;
    
    public static Connection getConnection()
    {
        try 
        {
            String path="jdbc:mysql://localhost/cafe";
            con=DriverManager.getConnection(path,"root","");
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return con;
    }
}
