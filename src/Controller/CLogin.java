package Controller;
import Model.*;
import java.sql.ResultSet;
public class CLogin 
{
    public ResultSet checkUser(String username, String password)
    {
        MLogin mcheck=new MLogin();
        ResultSet rst=mcheck.checkUser(username,password);
        return rst;
    }
}
