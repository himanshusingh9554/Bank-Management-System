package bank.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;

public class conn {
    Connection connection;
    Statement statement;

    public conn(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanage","root","955424");
       statement = connection.createStatement();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
