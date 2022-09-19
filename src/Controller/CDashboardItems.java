package Controller;

import Model.MDashbordItems;
import java.sql.ResultSet;

public class CDashboardItems 
{
    public void addItem(String iname, int uprice, String category)
    {
        MDashbordItems add= new MDashbordItems();
        add.addItem(iname, uprice, category);
    }
    
    public ResultSet showItems()
    {
        MDashbordItems mgeti=new MDashbordItems();
        ResultSet rst=mgeti.getItems();
        return rst;
    }
    public ResultSet showItemsByCategory(String category)
    {
        MDashbordItems mgeti=new MDashbordItems();
        ResultSet rst=mgeti.getItemsByCategory(category);
        return rst;
    }
      public void updateItem(String iname, int uprice, String category)
    {
        MDashbordItems update= new MDashbordItems();
        update.updateItem(iname, uprice, category);
    }
      public void deleteItem(String iname)
    {
        MDashbordItems delete= new MDashbordItems();
        delete.deleteItem(iname);
    }
    
    public int placeOrder(int total,int emp_id)
    {
        MDashbordItems order = new MDashbordItems();
        int i = order.placeOrder(total, emp_id);
        return i ; 
    }
}
