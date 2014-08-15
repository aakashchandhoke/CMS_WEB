package project.engine;
import gui.project.*;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

/**
*
* @author cgg
*/
public class DBEngineAniv
{
/**
* Connect to database
* @return Connection to database
* @throws java.lang.Exception
*/
public Connection dbConnection()throws Exception
{
Class.forName("com.mysql.jdbc.Driver");
return DriverManager.getConnection("jdbc:mysql://db4free.net:3306/aakash123" , "aakashchandhoke9","@@@Ashok1");
}

/**
* This method will load vector of vector of string and load all the data in
* the vector
* @return vector of vector of string
* @throws java.lang.Exception
*/
public Vector getEmployee(String name)throws Exception
{
Vector<Vector<String>> employeeVector = new Vector<Vector<String>>();
Connection conn = dbConnection();
PreparedStatement pre = conn.prepareStatement("select id,name,dd,mm,yy from aniv where mm=?");
pre.setString(1,name);
ResultSet rs = pre.executeQuery();

while(rs.next())
{
Vector<String> employee = new Vector<String>();
employee.add(String.valueOf(rs.getInt(1)));//id
employee.add(rs.getString(2)); //name
employee.add(rs.getString(3));//day
employee.add(rs.getString(4));//month
employee.add(rs.getString(5));//year
employeeVector.add(employee);
}

/*Close the connection after use (MUST)*/
if(conn!=null)
conn.close();

return employeeVector;
}
}