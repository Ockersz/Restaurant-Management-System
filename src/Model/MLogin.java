package Model;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class MLogin 
{
    public ResultSet checkUser(String username, String password)
    {
        ResultSet rs = null;
        
        try 
        {
            Statement st=DbConnection.getConnection().createStatement();
            rs=st.executeQuery("select EmpNo,EUsername, EPassword from employee where EUsername='"+username+"' and EPassword='"+password+"'");
            
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return rs;
    }
    
}
