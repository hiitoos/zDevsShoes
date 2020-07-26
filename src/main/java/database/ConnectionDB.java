package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    //Attributes
    Connection conn;

    //Connection method
    public ConnectionDB(){
        try{
            this.conn = DriverManager.getConnection(
                    "jdbc:mysql://34.105.161.110:3306/zdevsshoes",
                    "seatcode",
                    "JavaMola@2020");

            System.out.println(conn.isValid(50000) ? "": "CONNECTION FAIL");

        } catch(SQLException exception){
            System.out.println("Error: "+ exception);
        }
    }

    public Connection getConnection(){
        return this.conn;
    }
}
