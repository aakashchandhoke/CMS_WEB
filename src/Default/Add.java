package Default;

import java.sql.*;
class Add
{
    public int addAddress(int id,String name,String ad,String ct,String st,String country,int pincode)
    {
        try
        {
            /*String sr="Mithu\\Aakash";        
            String db="cms";
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");            
            Connection cn=DriverManager.getConnection("Jdbc:Odbc:Driver={sql server};server="+sr+";database="+db);*/
            Class.forName("com.mysql.jdbc.Driver");
            // Setup the connection with the DB
            Connection cn = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/aakash123" , "aakashchandhoke9","@@@Ashok1");
            PreparedStatement pst;
            String table="adrs";
            pst=cn.prepareStatement("insert into "+table+" values(?,?,?,?,?,?,?)");
            pst.setInt(1, id);
            pst.setString(2,name);
            pst.setString(3,ad);
            pst.setString(4,ct);
            pst.setString(5,st);
            pst.setString(6,country);
            pst.setInt(7, pincode);
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
    public int addPhone(int id,String name,long num)
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
            Connection cn = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/aakash123" , "aakashchandhoke9","@@@Ashok1");PreparedStatement pst;
            pst=cn.prepareStatement("insert into phn values(?,?,?)");
            pst.setInt(1, id);
            pst.setString(2, name);
            pst.setLong(3,num);
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
    public int addEmail(int id,String name,String email)
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
            pst=cn.prepareStatement("insert into email values(?,?,?)");
            pst.setInt(1, id);
            pst.setString(2, name);
            pst.setString(3,email);
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
    public int addBday(int id,String name,String dd,String mm,String yy)
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
            pst=cn.prepareStatement("insert into bday values(?,?,?,?,?)");
            pst.setInt(1, id);
            pst.setString(2, name);
            pst.setString(3,dd);
            pst.setString(4,mm);
            pst.setString(5,yy);
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
    public int addAniv(int id,String name,String dd,String mm,String yy)
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
            pst=cn.prepareStatement("insert into aniv values(?,?,?,?,?)");
            pst.setInt(1, id);
            pst.setString(2, name);
            pst.setString(3,dd);
            pst.setString(4,mm);
            pst.setString(5,yy);
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
    public int addRemind(int id,String name,String text,String dd,String mm,String yy)
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
            pst=cn.prepareStatement("insert into remind values(?,?,?,?,?,?)");
            pst.setInt(1, id);
            pst.setString(2, name);
            pst.setString(3,text);
            pst.setString(4,dd);
            pst.setString(5,mm);
            pst.setString(6,yy);
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
    public int validateIdAdrs(int id)
    {
        int x=1;//returns true for unique id
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
            ResultSet rs;
            pst=cn.prepareStatement("select id from adrs where id=?");
            pst.setInt(1, id);
            rs=pst.executeQuery();
            while(rs.next())
            {
                int n=rs.getInt(1);
                if(n==id)
                {
                    x=0;//returns false for existing id
                    break;
                }
            }
        }
        catch(Exception ee){}
        return x;
    }
    public int validateIdPhone(int id)
    {
        int x=1;//returns true for unique id
        try
        {
            /*String sr="Mithu\\Aakash";        
            String db="cms";
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");            
            Connection cn=DriverManager.getConnection("Jdbc:Odbc:Driver={sql server};server="+sr+";database="+db);*/
            Class.forName("com.mysql.jdbc.Driver");
            // Setup the connection with the DB
            Connection cn = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/aakash123" , "aakashchandhoke9","@@@Ashok1");
            PreparedStatement pst;
            String table="phn";            
            ResultSet rs;
            pst=cn.prepareStatement("select id from "+table+" where id=?");
            pst.setInt(1, id);
            rs=pst.executeQuery();
            while(rs.next())
            {
                int n=rs.getInt(1);
                if(n==id)
                {
                    x=0;//returns false for existing id
                    break;
                }
            }
        }
        catch(Exception ee){}
        return x;
    }
    public int validateIdEmail(int id)
    {
        int x=1;//returns true for unique id
        try
        {
            /*String sr="Mithu\\Aakash";        
            String db="cms";
            String table="email";
            ResultSet rs;
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");            
            Connection cn=DriverManager.getConnection("Jdbc:Odbc:Driver={sql server};server="+sr+";database="+db);*/
            Class.forName("com.mysql.jdbc.Driver");
            // Setup the connection with the DB
            Connection cn = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/aakash123" , "aakashchandhoke9","@@@Ashok1");
            PreparedStatement pst;
            pst=cn.prepareStatement("select id from email where id=?");
            pst.setInt(1, id);
            ResultSet rs=pst.executeQuery();
            while(rs.next())
            {
                int n=rs.getInt(1);
                if(n==id)
                {
                    x=0;//returns false for existing id
                    break;
                }
            }
        }
        catch(Exception ee){}
        return x;
    }
    public int validateIdBday(int id)
    {
        int x=1;//returns true for unique id
        try
        {
            /*String sr="Mithu\\Aakash";        
            String db="cms";
            String table="bday";            
            ResultSet rs;
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");            
            Connection cn=DriverManager.getConnection("Jdbc:Odbc:Driver={sql server};server="+sr+";database="+db);*/
            Class.forName("com.mysql.jdbc.Driver");
            // Setup the connection with the DB
            Connection cn = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/aakash123" , "aakashchandhoke9","@@@Ashok1");
            PreparedStatement pst;
            pst=cn.prepareStatement("select id from bday where id=?");
            pst.setInt(1, id);
            ResultSet rs=pst.executeQuery();
            while(rs.next())
            {
                int n=rs.getInt(1);
                if(n==id)
                {
                    x=0;//returns false for existing id
                    break;
                }
            }
        }
        catch(Exception ee){}
        return x;
    }
    public int validateIdAniv(int id)
    {
        int x=1;//returns true for unique id
        try
        {
            /*String sr="Mithu\\Aakash";        
            String db="cms";
            String table="aniv";            
            ResultSet rs;
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");            
            Connection cn=DriverManager.getConnection("Jdbc:Odbc:Driver={sql server};server="+sr+";database="+db);*/
            Class.forName("com.mysql.jdbc.Driver");
            // Setup the connection with the DB
            Connection cn = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/aakash123" , "aakashchandhoke9","@@@Ashok1");
            PreparedStatement pst;
            pst=cn.prepareStatement("select id from aniv where id=?");
            pst.setInt(1, id);
            ResultSet rs=pst.executeQuery();
            while(rs.next())
            {
                int n=rs.getInt(1);
                if(n==id)
                {
                    x=0;//returns false for existing id
                    break;
                }
            }
        }
        catch(Exception ee){}
        return x;
    }
    public int validateIdRemind(int id)
    {
        int x=1;//returns true for unique id
        try
        {
            /*String sr="Mithu\\Aakash";        
            String db="cms";
            String table="remind";            
            ResultSet rs;
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");            
            Connection cn=DriverManager.getConnection("Jdbc:Odbc:Driver={sql server};server="+sr+";database="+db);*/
            Class.forName("com.mysql.jdbc.Driver");
            // Setup the connection with the DB
            Connection cn = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/aakash123" , "aakashchandhoke9","@@@Ashok1");
            PreparedStatement pst;
            pst=cn.prepareStatement("select id from remind where id=?");
            pst.setInt(1, id);
            ResultSet rs=pst.executeQuery();
            while(rs.next())
            {
                int n=rs.getInt(1);
                if(n==id)
                {
                    x=0;//returns false for existing id
                    break;
                }
            }
        }
        catch(Exception ee){}
        return x;
    }
}
    
