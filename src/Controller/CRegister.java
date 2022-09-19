package Controller;

import Model.MRegister;

public class CRegister 
{
    public void registerUser(String name, String username, String password)
    {
        MRegister muser= new MRegister();
        muser.registerUser(name, username, password);
    }
}
