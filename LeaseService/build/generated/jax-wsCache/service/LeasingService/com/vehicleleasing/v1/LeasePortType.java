
package com.vehicleleasing.v1;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "LeasePortType", targetNamespace = "http://www.vehicleleasing.com/v1")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface LeasePortType {


    /**
     * 
     * @param parameter
     * @return
     *     returns com.vehicleleasing.v1.VehicleType
     */
    @WebMethod
    @WebResult(name = "getVehicleResponse", targetNamespace = "http://www.vehicleleasing.com/v1", partName = "parameter")
    public VehicleType getVehicle(
        @WebParam(name = "getVehicleRequest", targetNamespace = "http://www.vehicleleasing.com/v1", partName = "parameter")
        GetVehicleRequest parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.vehicleleasing.v1.VehicleType
     */
    @WebMethod
    @WebResult(name = "addVehicleResponse", targetNamespace = "http://www.vehicleleasing.com/v1", partName = "parameter")
    public VehicleType addVehicle(
        @WebParam(name = "addVehicleRequest", targetNamespace = "http://www.vehicleleasing.com/v1", partName = "parameter")
        AddVehicleRequest parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.vehicleleasing.v1.GetVehicleListResponse
     */
    @WebMethod
    @WebResult(name = "getVehicleListResponse", targetNamespace = "http://www.vehicleleasing.com/v1", partName = "parameter")
    public GetVehicleListResponse getVehicleList(
        @WebParam(name = "getVehicleListRequest", targetNamespace = "http://www.vehicleleasing.com/v1", partName = "parameter")
        GetVehicleListRequest parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.vehicleleasing.v1.AccountType
     */
    @WebMethod
    @WebResult(name = "getAccountResponse", targetNamespace = "http://www.vehicleleasing.com/v1", partName = "parameter")
    public AccountType getAccount(
        @WebParam(name = "getAccountRequest", targetNamespace = "http://www.vehicleleasing.com/v1", partName = "parameter")
        GetAccountRequest parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.vehicleleasing.v1.AccountType
     */
    @WebMethod
    @WebResult(name = "addAccountResponse", targetNamespace = "http://www.vehicleleasing.com/v1", partName = "parameter")
    public AccountType addAccount(
        @WebParam(name = "addAccountRequest", targetNamespace = "http://www.vehicleleasing.com/v1", partName = "parameter")
        AddAccountRequest parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.vehicleleasing.v1.GetAccountListResponse
     */
    @WebMethod
    @WebResult(name = "getAccountListResponse", targetNamespace = "http://www.vehicleleasing.com/v1", partName = "parameter")
    public GetAccountListResponse getAccountList(
        @WebParam(name = "getAccountListRequest", targetNamespace = "http://www.vehicleleasing.com/v1", partName = "parameter")
        GetAccountListRequest parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.vehicleleasing.v1.AccountVehicleListType
     */
    @WebMethod
    @WebResult(name = "getAccountVehicleListResponse", targetNamespace = "http://www.vehicleleasing.com/v1", partName = "parameter")
    public AccountVehicleListType getAccountVehicleList(
        @WebParam(name = "getAccountVehicleListRequest", targetNamespace = "http://www.vehicleleasing.com/v1", partName = "parameter")
        GetAccountVehicleListRequest parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.vehicleleasing.v1.AccountVehicleType
     */
    @WebMethod
    @WebResult(name = "addAccountVehicleResponse", targetNamespace = "http://www.vehicleleasing.com/v1", partName = "parameter")
    public AccountVehicleType addAccountVehicle(
        @WebParam(name = "addAccountVehicleRequest", targetNamespace = "http://www.vehicleleasing.com/v1", partName = "parameter")
        AddAccountVehicleRequest parameter);

}