/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicleleasing;

import com.vehicleleasing.v1.*;
import javax.jws.WebService;

/**
 *
 * @author ss
 */
@WebService(serviceName = "LeaseService", portName = "LeasePort", endpointInterface = "com.vehicleleasing.v1.LeasePortType", targetNamespace = "http://www.vehicleleasing.com/v1", wsdlLocation = "WEB-INF/wsdl/LeasingService/LeaseService.wsdl")
public class LeasingService {
    private static String token = "secret_soap";

    public VehicleType getVehicle(GetVehicleRequest parameter) {
        if (!parameter.getToken().equals(token)) throw new IllegalArgumentException("Invalid API token");
        return LeaseDB.get().getVehicle(parameter);
    }

    public VehicleType addVehicle(AddVehicleRequest parameter) {
        if (!parameter.getToken().equals(token)) throw new IllegalArgumentException("Invalid API token");
        if (RequestIdManager.isNew(parameter.getRequestId())) {
            return LeaseDB.get().addVehicle(parameter);
        } else {
            throw new IllegalArgumentException("Request ID already used");
        }
    }

    public GetVehicleListResponse getVehicleList(GetVehicleListRequest parameter) {
        if (!parameter.getToken().equals(token)) throw new IllegalArgumentException("Invalid API token");
        return LeaseDB.get().getVehicleList(parameter);
    }

    public AccountType getAccount(GetAccountRequest parameter) {
        if (!parameter.getToken().equals(token)) throw new IllegalArgumentException("Invalid API token");
        return LeaseDB.get().getAccount(parameter);
    }

    public AccountType addAccount(AddAccountRequest parameter) {
        if (!parameter.getToken().equals(token)) throw new IllegalArgumentException("Invalid API token");
        if (RequestIdManager.isNew(parameter.getRequestId())) {
            return LeaseDB.get().addAccount(parameter);
        } else {
            throw new IllegalArgumentException("Request ID already used");
        }
    }

    public GetAccountListResponse getAccountList(GetAccountListRequest parameter) {
        if (!parameter.getToken().equals(token)) throw new IllegalArgumentException("Invalid API token");
        return LeaseDB.get().getAccountList(parameter);
    }

    public AccountVehicleListType getAccountVehicleList(GetAccountVehicleListRequest parameter) {
        if (!parameter.getToken().equals(token)) throw new IllegalArgumentException("Invalid API token");
        return LeaseDB.get().getAccountVehicleList(parameter);
    }

    public AccountVehicleType addAccountVehicle(AddAccountVehicleRequest parameter) {
        if (!parameter.getToken().equals(token)) throw new IllegalArgumentException("Invalid API token");
        if (RequestIdManager.isNew(parameter.getRequestId())) {
            return LeaseDB.get().addAccountVehicle(parameter);
        } else {
            throw new IllegalArgumentException("Request ID already used");
        }
    }
    
}
