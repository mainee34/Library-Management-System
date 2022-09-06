
package lib;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class ConnectionClass {
    
   Connection c;
   Statement s;
    
    ConnectionClass()
    {
       try
       {
          Class.forName("com.mysql.cj.jdbc.Driver");
          c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Library","root","pass123@");
          s = c.createStatement();
          
          if(c.isClosed())
          {
              System.out.println("Disconnected");
          }
          
          else
          {
           System.out.println("connected");
           

          }
       }
       catch(Exception e)
       {
           e.printStackTrace();
       }
    }
    
    public static void main(String[] args)
    {
        new ConnectionClass();
    }
    
}
