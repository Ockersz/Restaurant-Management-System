package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class MDashbordItems 
{
    public void addItem(String iname, int uprice, String category)
    {
        ResultSet rs= null;
        
        try
        {
            Statement st=DbConnection.getConnection().createStatement();
            rs=st.executeQuery("select Iname from item where Iname='"+iname+"'");
            if (rs.next()) 
            {
                JOptionPane.showMessageDialog(null, "Item already exist.", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                st.executeUpdate("insert into item(Iname,Uprice,Category) values('"+iname+"','"+uprice+"','"+category+"')");
                JOptionPane.showMessageDialog(null, "Item succesfully added.","Successfully Added", JOptionPane.INFORMATION_MESSAGE);
            }
            
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public ResultSet getItems()
    {
        ResultSet rs = null;
                
        try
        {
            Statement st=DbConnection.getConnection().createStatement();
             rs=st.executeQuery("select * from item");
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return rs;
    }
    
    public ResultSet getItemsByCategory(String category)
    {
         ResultSet rs = null;
                
        try
        {
            Statement st=DbConnection.getConnection().createStatement();
             rs=st.executeQuery("select * from item where Category = '"+category+"' ");
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return rs;
    }
    
     public void updateItem(String iname, int uprice, String category)
    {
        try
        {
            Statement st=DbConnection.getConnection().createStatement();
            st.executeUpdate("UPDATE `item` SET `Uprice`='"+uprice+"',`Category`='"+category+"' WHERE `Iname`='"+iname+"'");
            JOptionPane.showMessageDialog(null, "Item succesfully added.","Successfully Added", JOptionPane.INFORMATION_MESSAGE);

        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
     
      public void deleteItem(String iname)
    {
        try
        {
            Statement st=DbConnection.getConnection().createStatement();
            st.executeUpdate("DELETE FROM `item` WHERE Iname = '"+iname+"' ");
            JOptionPane.showMessageDialog(null, "Item succesfully deleted.","Successfully Added", JOptionPane.INFORMATION_MESSAGE);

        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    
    public int placeOrder(int total,int emp_id)
    {
        int i = 0 ;
        try
        {
            Statement st = DbConnection.getConnection().createStatement();
            i = st.executeUpdate("INSERT INTO `orders`( `Tprice`, `EmpID`) VALUES ('"+total+"','"+emp_id+"')");
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return i;
    }
}
