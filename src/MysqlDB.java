
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmed
 */
public class MysqlDB {
    private Connection connection;
    private Statement statement;
    private ResultSet result;
    
   public MysqlDB(){
       try{
           Class.forName("com.mysql.jdbc.Driver");
           connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/simple_quiz","root","");
           statement = connection.createStatement();
       }catch(ClassNotFoundException | SQLException e){
           System.out.println("Error: "+e);
       }
   }
   
   public void getData(){
       
   }
}
