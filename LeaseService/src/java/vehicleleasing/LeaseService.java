/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicleleasing;

import javax.jws.WebService;

/**
 *
 * @author ss
 */
@WebService(serviceName = "LeaseService", portName = "LeasePort", endpointInterface = "com.vehicleleasing.v1.LeasePortType", targetNamespace = "http://www.vehicleleasing.com/v1", wsdlLocation = "WEB-INF/wsdl/LeaseService/LeaseService.wsdl")
public class LeaseService {

    public com.vehicleleasing.v1.VehicleType getVehicle(com.vehicleleasing.v1.GetVehicleRequest parameter) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public com.vehicleleasing.v1.VehicleType addVehicle(com.vehicleleasing.v1.AddVehicleRequest parameter) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public com.vehicleleasing.v1.GetVehicleListResponse getVehicleList(com.vehicleleasing.v1.GetVehicleListRequest parameter) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public com.vehicleleasing.v1.AccountType getAccount(com.vehicleleasing.v1.GetAccountRequest parameter) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public com.vehicleleasing.v1.AccountType addAccount(com.vehicleleasing.v1.AddAccountRequest parameter) {
        return LeaseDB.get().addAccount(parameter);
    }

    public com.vehicleleasing.v1.GetAccountListResponse getAccountList(com.vehicleleasing.v1.GetAccountListRequest parameter) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public com.vehicleleasing.v1.AccountVehicleListType getAccountVehicleList(com.vehicleleasing.v1.GetAccountVehicleListRequest parameter) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public com.vehicleleasing.v1.AccountVehicleType addAccountVehicle(com.vehicleleasing.v1.AddAccountVehicleRequest parameter) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }
    
}
