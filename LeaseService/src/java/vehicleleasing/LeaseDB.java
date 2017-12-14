/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicleleasing;

import com.vehicleleasing.v1.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ss
 */
public class LeaseDB {
    private static LeaseDB instance = null;
    private static Connection conn = null;
    private static PreparedStatement insertAccount = null;
    private LeaseDB() {}
    
    public static LeaseDB get() {
        if (instance == null) {
            try {
                Class.forName("org.postgresql.Driver");
                conn = DriverManager.getConnection("jdbc:postgresql://localhost/lease_service", "lease_service", "veebiteenused");
                //Statement stmt = c.createStatement();
                /*ResultSet results = stmt.executeQuery("SELECT * FROM isik;");
                //c.close();
                while(results.next()) {
                    System.out.println(results.getString("email"));
                }
                results.close();
                stmt.close();
                c.close();*/
                insertAccount = conn.prepareStatement("INSERT INTO accounts (name) VALUES (?);");
            } catch (Exception ex) {
                Logger.getLogger(LeaseDB.class.getName()).log(Level.SEVERE, null, ex);
            }
            instance = new LeaseDB();
        }
        return instance;
    }
    
    public AccountType addAccount(AddAccountRequest parameter) {
        try {
            insertAccount.clearParameters();
            insertAccount.setString(1, parameter.getCustomerName());
            insertAccount.execute();
        } catch (SQLException ex) {
            Logger.getLogger(LeaseDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new AccountType();
    }
}
