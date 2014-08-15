package Default;

import java.sql.*;
public class Update_Delete 
{
    public boolean checkVar(int id,String name,String addr,String ct,String st,String country,int pincode)
    {
        if(id==0||name.equals("")||addr.equals("")||ct.equals("")||st.equals("")||country.equals("")||pincode==0)
            return false;
        else
            return true;
    }
    public boolean checkVar(int id,String name,long phn)
    {
        if(id==0||name.equals("")||phn==0)
            return false;
        else
            return true;
    }
    public boolean checkVar(int id,String name,String email)
    {
        if(id==0||name.equals("")||email.equals(""))
            return false;
        else
            return true;
    }
    public boolean checkVar(int id,String name,String dd,String mm,String yy)
    {
        if(id==0||name.equals("")||dd.equals("")||mm.equals("")||yy.equals(""))
            return false;
        else
            return true;
    }
    public boolean checkVar(int id,String name,String dd,String mm,String yy,String remind)
    {
        if(id==0||name.equals("")||dd.equals("")||mm.equals("")||yy.equals("")||remind.equals(""))
            return false;
        else
            return true;
    }
    public int updateAddress(int id,String name,String addr,String ct,String st,String country,int pincode)
    {
        try
        {
            /*String sr="Mithu\\Aakash";        
            String db="cms";
            String table="adrs";
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");            
            Connection cn=DriverManager.getConnection("Jdbc:Odbc:Driver={sql server};server="+sr+";database="+db);*/
            Class.forName("com.mysql.jdbc.Driver");
            // Setup the connection with the DB
            Connection cn = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/aakash123" , "aakashchandhoke9","@@@Ashok1");
            PreparedStatement pst;
            pst=cn.prepareStatement("update adrs set name=?,ad=?,ct=?,st=?,country=?,pincode=? where id=?");
            pst.setString(1, name);
            pst.setString(2,addr);
            pst.setString(3,ct);
            pst.setString(4,st);
            pst.setString(5,country);
            pst.setInt(6,pincode);
            pst.setInt(7, id);
            int x=pst.executeUpdate();
            if(x==1)
                return 1;//updated
            else
                return 0;//Not updated

        }
        catch(Exception ee)
        {
            return 0;//Error and not updated
        }
    }
    public int updatePhone(int id,String name,long phn)
    {
        try
        {
            /*String sr="Mithu\\Aakash";        
            String db="cms";
            String table="phn";
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");            
            Connection cn=DriverManager.getConnection("Jdbc:Odbc:Driver={sql server};server="+sr+";database="+db);*/
            Class.forName("com.mysql.jdbc.Driver");
            // Setup the connection with the DB
            Connection cn = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/aakash123" , "aakashchandhoke9","@@@Ashok1");
            PreparedStatement pst;
            pst=cn.prepareStatement("update phn set name=?,phone=? where id=?");
            pst.setString(1, name);
            pst.setLong(2,phn);
            pst.setInt(3, id);
            int x=pst.executeUpdate();
            if(x==1)
                return 1;//updated
            else
                return 0;//Not updated

        }
        catch(Exception ee)
        {
            return 0;//Error and not updated
        }
    }
    public int updateEmail(int id,String name,String email)
    {
        try
        {
            /*String sr="Mithu\\Aakash";        
            String db="cms";
            String table="email";
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");            
            Connection cn=DriverManager.getConnection("Jdbc:Odbc:Driver={sql server};server="+sr+";database="+db);*/
            Class.forName("com.mysql.jdbc.Driver");
            // Setup the connection with the DB
            Connection cn = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/aakash123" , "aakashchandhoke9","@@@Ashok1");
            PreparedStatement pst;
            pst=cn.prepareStatement("update email set name=?,mail=? where id=?");
            pst.setString(1, name);
            pst.setString(2,email);
            pst.setInt(3, id);
            int x=pst.executeUpdate();
            if(x==1)
                return 1;//updated
            else
                return 0;//Not updated

        }
        catch(Exception ee)
        {
            return 0;//Error and not updated
        }
    }
    public int updateBday(int id,String name,String dd,String mm,String yy)
    {
        try
        {
            /*String sr="Mithu\\Aakash";        
            String db="cms";
            String table="bday";
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");            
            Connection cn=DriverManager.getConnection("Jdbc:Odbc:Driver={sql server};server="+sr+";database="+db);*/
            Class.forName("com.mysql.jdbc.Driver");
            // Setup the connection with the DB
            Connection cn = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/aakash123" , "aakashchandhoke9","@@@Ashok1");
            PreparedStatement pst;
            pst=cn.prepareStatement("update bday set name=?,dd=?,mm=?,yy=? where id=?");
            pst.setString(1, name);
            pst.setString(2,dd);
            pst.setString(3,mm);
            pst.setString(4,yy);
            pst.setInt(5, id);
            int x=pst.executeUpdate();
            if(x==1)
                return 1;//updated
            else
                return 0;//Not updated

        }
        catch(Exception ee)
        {
            return 0;//Error and not updated
        }
    }
    public int updateAniv(int id,String name,String dd,String mm,String yy)
    {
        try
        {
            /*String sr="Mithu\\Aakash";        
            String db="cms";
            String table="aniv";
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");            
            Connection cn=DriverManager.getConnection("Jdbc:Odbc:Driver={sql server};server="+sr+";database="+db);*/
            Class.forName("com.mysql.jdbc.Driver");
            // Setup the connection with the DB
            Connection cn = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/aakash123" , "aakashchandhoke9","@@@Ashok1");
            PreparedStatement pst;
            pst=cn.prepareStatement("update aniv set name=?,dd=?,mm=?,yy=? where id=?");
            pst.setString(1, name);
            pst.setString(2,dd);
            pst.setString(3,mm);
            pst.setString(4,yy);
            pst.setInt(5, id);
            int x=pst.executeUpdate();
            if(x==1)
                return 1;//updated
            else
                return 0;//Not updated

        }
        catch(Exception ee)
        {
            return 0;//Error and not updated
        }
    }
    public int updateRemind(int id,String name,String dd,String mm,String yy,String remind)
    {
        try
        {
            /*String sr="Mithu\\Aakash";        
            String db="cms";
            String table="remind";
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");            
            Connection cn=DriverManager.getConnection("Jdbc:Odbc:Driver={sql server};server="+sr+";database="+db);*/
            Class.forName("com.mysql.jdbc.Driver");
            // Setup the connection with the DB
            Connection cn = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/aakash123" , "aakashchandhoke9","@@@Ashok1");
            PreparedStatement pst;
            pst=cn.prepareStatement("update remind set name=?,rem=?,dd=?,mm=?,yy=? where id=?");
            pst.setString(1, name);
            pst.setString(2, remind);
            pst.setString(3,dd);
            pst.setString(4,mm);
            pst.setString(5,yy);
            pst.setInt(6, id);
            int x=pst.executeUpdate();
            if(x==1)
                return 1;//updated
            else
                return 0;//Not updated

        }
        catch(Exception ee)
        {
            return 0;//Error and not updated
        }
    }
    public int deleteIdAdrs(int id)
    {
        try
        {
            /*String sr="Mithu\\Aakash";        
            String db="cms";
            String table="adrs";
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");            
            Connection cn=DriverManager.getConnection("Jdbc:Odbc:Driver={sql server};server="+sr+";database="+db);*/
            Class.forName("com.mysql.jdbc.Driver");
            // Setup the connection with the DB
            Connection cn = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/aakash123" , "aakashchandhoke9","@@@Ashok1");
            PreparedStatement pst;
            pst=cn.prepareStatement("delete from adrs where id=?");
            pst.setInt(1, id);
            int x=pst.executeUpdate();
            if(x==1)
                return 1;
            else
                return 0;
        }
        catch(Exception ee)
        {
            return 0;
        }
    }
    public int deleteIdPhone(int id)
    {
        try
        {
            /*String sr="Mithu\\Aakash";        
            String db="cms";
            String table="phn";
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");            
            Connection cn=DriverManager.getConnection("Jdbc:Odbc:Driver={sql server};server="+sr+";database="+db);*/
            Class.forName("com.mysql.jdbc.Driver");
            // Setup the connection with the DB
            Connection cn = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/aakash123" , "aakashchandhoke9","@@@Ashok1");
            PreparedStatement pst;
            pst=cn.prepareStatement("delete from phn where id=?");
            pst.setInt(1, id);
            int x=pst.executeUpdate();
            if(x==1)
                return 1;
            else
                return 0;
        }
        catch(Exception ee)
        {
            return 0;
        }
    }
    public int deleteIdEmail(int id)
    {
        try
        {
            /*String sr="Mithu\\Aakash";        
            String db="cms";
            String table="email";
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");            
            Connection cn=DriverManager.getConnection("Jdbc:Odbc:Driver={sql server};server="+sr+";database="+db);*/
            Class.forName("com.mysql.jdbc.Driver");
            // Setup the connection with the DB
            Connection cn = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/aakash123" , "aakashchandhoke9","@@@Ashok1");
            PreparedStatement pst;
            pst=cn.prepareStatement("delete from email where id=?");
            pst.setInt(1, id);
            int x=pst.executeUpdate();
            if(x==1)
                return 1;
            else
                return 0;
        }
        catch(Exception ee)
        {
            return 0;
        }
    }
    public int deleteIdAniv(int id)
    {
        try
        {
            /*String sr="Mithu\\Aakash";        
            String db="cms";
            String table="aniv";
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");            
            Connection cn=DriverManager.getConnection("Jdbc:Odbc:Driver={sql server};server="+sr+";database="+db);*/
            Class.forName("com.mysql.jdbc.Driver");
            // Setup the connection with the DB
            Connection cn = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/aakash123" , "aakashchandhoke9","@@@Ashok1");
            PreparedStatement pst;
            pst=cn.prepareStatement("delete from aniv where id=?");
            pst.setInt(1, id);
            int x=pst.executeUpdate();
            if(x==1)
                return 1;
            else
                return 0;
        }
        catch(Exception ee)
        {
            return 0;
        }
    }
    public int deleteIdBday(int id)
    {
        try
        {
            /*String sr="Mithu\\Aakash";        
            String db="cms";
            String table="bday";
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");            
            Connection cn=DriverManager.getConnection("Jdbc:Odbc:Driver={sql server};server="+sr+";database="+db);*/
            Class.forName("com.mysql.jdbc.Driver");
            // Setup the connection with the DB
            Connection cn = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/aakash123" , "aakashchandhoke9","@@@Ashok1");
            PreparedStatement pst;
            pst=cn.prepareStatement("delete from bday where id=?");
            pst.setInt(1, id);
            int x=pst.executeUpdate();
            if(x==1)
                return 1;
            else
                return 0;
        }
        catch(Exception ee)
        {
            return 0;
        }
    }
    public int deleteIdRemind(int id)
    {
        try
        {
            /*String sr="Mithu\\Aakash";        
            String db="cms";
            String table="remind";
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");            
            Connection cn=DriverManager.getConnection("Jdbc:Odbc:Driver={sql server};server="+sr+";database="+db);*/
            Class.forName("com.mysql.jdbc.Driver");
            // Setup the connection with the DB
            Connection cn = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/aakash123" , "aakashchandhoke9","@@@Ashok1");
            PreparedStatement pst;
            pst=cn.prepareStatement("delete from remind where id=?");
            pst.setInt(1, id);
            int x=pst.executeUpdate();
            if(x==1)
                return 1;
            else
                return 0;
        }
        catch(Exception ee)
        {
            return 0;
        }
    }
}

