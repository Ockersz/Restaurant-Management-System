package Model;
import java.sql.*;
import javax.swing.*;
public class MRegister 
{
    public void registerUser(String name, String username, String password)
    {
        ResultSet rs= null;
        
        try 
        {
            Statement st=DbConnection.getConnection().createStatement();
            rs=st.executeQuery("select EUsername from employee where EUsername='"+username+"'");
            if (rs.next()) 
            {
                JOptionPane.showMessageDialog(null, "Username already exist. Please use another username", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                st.executeUpdate("insert into employee(Ename,Eusername,Epassword) values('"+name+"','"+username+"','"+password+"')");
                JOptionPane.showMessageDialog(null, "User Registered","Successfully Registered", JOptionPane.INFORMATION_MESSAGE);
            }
            
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
