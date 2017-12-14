/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicleleasing;

import com.vehicleleasing.v1.*;
import java.math.BigInteger;
import java.sql.*;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author ss
 */
public class LeaseDB {
    private static LeaseDB instance = null;
    private static Connection conn = null;
    private static PreparedStatement insertAccount = null;
    private static PreparedStatement insertAccountVehicle = null;
    private static PreparedStatement selectAccount = null;
    private static PreparedStatement selectAccounts = null;
    private static PreparedStatement insertVehicle = null;
    private static PreparedStatement selectVehicle = null;
    private static PreparedStatement selectVehicles = null;
    private static PreparedStatement selectAccountVehicles = null;
    private LeaseDB() {}
    
    public static synchronized LeaseDB get() {
        if (instance == null) {
            try {
                Class.forName("org.postgresql.Driver");
                conn = DriverManager.getConnection("jdbc:postgresql://localhost/lease_service", "lease_service", "veebiteenused");
                insertAccount = conn.prepareStatement("INSERT INTO accounts (name) VALUES (?) RETURNING *;");
                insertAccountVehicle = conn.prepareStatement("INSERT INTO account_vehicles (account_id, vin, lease_start, lease_end, lease_per_month) VALUES (?, ?, ?, ?, ?) RETURNING *;");
                selectAccount = conn.prepareStatement("SELECT * FROM accounts WHERE id = ?;");
                selectAccounts = conn.prepareStatement("SELECT * FROM accounts;");
                insertVehicle = conn.prepareStatement("INSERT INTO vehicles (vin, license_plate, type, brand, model, acquired_at) VALUES (?, ?, ?, ?, ?, ?) RETURNING *;");
                selectVehicle = conn.prepareStatement("SELECT * FROM vehicles WHERE vin = ?;");
                selectVehicles = conn.prepareStatement("SELECT * FROM vehicles;");
                selectAccountVehicles = conn.prepareStatement("SELECT * FROM account_vehicles AS AV INNER JOIN vehicles AS V ON AV.vin = V.vin WHERE account_id = ?;");
            } catch (Exception ex) {
                Logger.getLogger(LeaseDB.class.getName()).log(Level.SEVERE, null, ex);
            }
            instance = new LeaseDB();
        }
        return instance;
    }
    
    private static XMLGregorianCalendar convertDate(Date date) {
        if (date == null) return null;
        try {
            GregorianCalendar c = new GregorianCalendar();
            c.setTime(date);
            return DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
        } catch (DatatypeConfigurationException ex) {
            Logger.getLogger(LeaseDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    private static Date convertDate(XMLGregorianCalendar date) {
        if (date == null) return null;
        return new Date(date.toGregorianCalendar().getTimeInMillis());
    }
        
    private static VehicleType vehicleTypeFromResults(ResultSet results) throws SQLException {
        if (!results.next()) return null;
        VehicleType vehicle = new VehicleType();
        vehicle.setVin(results.getString("vin"));
        vehicle.setLicensePlate(results.getString("license_plate"));
        vehicle.setBrand(results.getString("brand"));
        vehicle.setModel(results.getString("model"));
        vehicle.setSoldAt(convertDate(results.getDate("sold_at")));
        vehicle.setAcquiredAt(convertDate(results.getDate("acquired_at")));
        return vehicle;
    }
    
    private static AccountType accountTypeFromResults(ResultSet results) throws SQLException {
        if (!results.next()) return null;
        AccountType account = new AccountType();
        account.setId(new BigInteger(results.getString("id")));
        account.setCustomerName(results.getString("name"));
        account.setCreatedAt(convertDate(results.getDate("created_at")));
        return account;
    }
    
    public synchronized AccountType addAccount(AddAccountRequest parameter) {
        try {
            insertAccount.clearParameters();
            insertAccount.setString(1, parameter.getCustomerName());
            return accountTypeFromResults(insertAccount.executeQuery());
        } catch (SQLException ex) {
            Logger.getLogger(LeaseDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public synchronized VehicleType addVehicle(AddVehicleRequest parameter) {
        try {
            insertVehicle.clearParameters();
            insertVehicle.setString(1, parameter.getVin());
            insertVehicle.setString(2, parameter.getLicensePlate());
            insertVehicle.setString(3, parameter.getType());
            insertVehicle.setString(4, parameter.getBrand());
            insertVehicle.setString(5, parameter.getModel());
            insertVehicle.setDate(6, convertDate(parameter.getAcquiredAt()));
            return vehicleTypeFromResults(insertVehicle.executeQuery());
        } catch (SQLException ex) {
            Logger.getLogger(LeaseDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public synchronized VehicleType getVehicle(GetVehicleRequest parameter) {
        try {
            selectVehicle.clearParameters();
            selectVehicle.setString(1, parameter.getVin());
            return vehicleTypeFromResults(selectVehicle.executeQuery());
        } catch (SQLException ex) {
            Logger.getLogger(LeaseDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public AccountType getAccount(GetAccountRequest parameter) {
        try {
            selectAccount.clearParameters();
            selectAccount.setLong(1, parameter.getId().longValue());
            return accountTypeFromResults(selectAccount.executeQuery());
        } catch (SQLException ex) {
            Logger.getLogger(LeaseDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public GetAccountListResponse getAccountList(GetAccountListRequest parameter) {
        try {
            GetAccountListResponse response = new GetAccountListResponse();
            List<AccountType> accounts = response.getAccount();
            ResultSet results = selectAccounts.executeQuery();
            AccountType current = accountTypeFromResults(results); 
            while(current != null) {
                accounts.add(current);
                current = accountTypeFromResults(results); 
            }
            return response;
        } catch (SQLException ex) {
            Logger.getLogger(LeaseDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public GetVehicleListResponse getVehicleList(GetVehicleListRequest parameter) {
        try {
            GetVehicleListResponse response = new GetVehicleListResponse();
            List<VehicleType> vehicles = response.getVehicle();
            ResultSet results = selectVehicles.executeQuery();
            VehicleType current = vehicleTypeFromResults(results); 
            while(current != null) {
                vehicles.add(current);
                current = vehicleTypeFromResults(results); 
            }
            return response;
        } catch (SQLException ex) {
            Logger.getLogger(LeaseDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public AccountVehicleListType getAccountVehicleList(GetAccountVehicleListRequest parameter) {
        try {
            selectAccountVehicles.clearParameters();
            selectAccountVehicles.setLong(1, parameter.getAccountId().longValue());
            ResultSet results = selectAccountVehicles.executeQuery();
            AccountVehicleListType result = new AccountVehicleListType();
            List<AccountVehicleType> vehicles = result.getAccountVehicle();
            
            VehicleType vehicle = vehicleTypeFromResults(results);
            while (vehicle != null) {
                AccountVehicleType accountVehicle = new AccountVehicleType();
                accountVehicle.setVehicle(vehicle);
                accountVehicle.setLeasePerMonth(results.getBigDecimal("lease_per_month"));
                accountVehicle.setLeaseEnd(convertDate(results.getDate("lease_end")));
                accountVehicle.setLeaseStart(convertDate(results.getDate("lease_start")));
                vehicles.add(accountVehicle);
                vehicle = vehicleTypeFromResults(results);
            }
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(LeaseDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public AccountVehicleType addAccountVehicle(AddAccountVehicleRequest parameter) {
        try {
            insertAccountVehicle.clearParameters(); //(account_id, vin, lease_start, lease_end, lease_per_moth)
            insertAccountVehicle.setLong(1, parameter.getAccountId().longValue());
            insertAccountVehicle.setString(2, parameter.getVin());
            insertAccountVehicle.setDate(3, convertDate(parameter.getLeaseStart()));
            insertAccountVehicle.setDate(4, convertDate(parameter.getLeaseEnd()));
            insertAccountVehicle.setBigDecimal(5, parameter.getLeasePerMonth());
            ResultSet results = insertAccountVehicle.executeQuery();
            results.next();
            AccountVehicleType result = new AccountVehicleType();
            
            selectVehicle.clearParameters();
            selectVehicle.setString(1, parameter.getVin());
            result.setVehicle(vehicleTypeFromResults(selectVehicle.executeQuery()));
            
            result.setLeasePerMonth(results.getBigDecimal("lease_per_month"));
            result.setLeaseEnd(convertDate(results.getDate("lease_end")));
            result.setLeaseStart(convertDate(results.getDate("lease_start")));
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(LeaseDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
