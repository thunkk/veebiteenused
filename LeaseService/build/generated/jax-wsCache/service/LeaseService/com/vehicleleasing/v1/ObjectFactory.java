
package com.vehicleleasing.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.vehicleleasing.v1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetVehicleResponse_QNAME = new QName("http://www.vehicleleasing.com/v1", "getVehicleResponse");
    private final static QName _AddVehicleResponse_QNAME = new QName("http://www.vehicleleasing.com/v1", "addVehicleResponse");
    private final static QName _GetAccountResponse_QNAME = new QName("http://www.vehicleleasing.com/v1", "getAccountResponse");
    private final static QName _AddAccountResponse_QNAME = new QName("http://www.vehicleleasing.com/v1", "addAccountResponse");
    private final static QName _GetAccountVehicleListResponse_QNAME = new QName("http://www.vehicleleasing.com/v1", "getAccountVehicleListResponse");
    private final static QName _AddAccountVehicleResponse_QNAME = new QName("http://www.vehicleleasing.com/v1", "addAccountVehicleResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.vehicleleasing.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetVehicleRequest }
     * 
     */
    public GetVehicleRequest createGetVehicleRequest() {
        return new GetVehicleRequest();
    }

    /**
     * Create an instance of {@link VehicleType }
     * 
     */
    public VehicleType createVehicleType() {
        return new VehicleType();
    }

    /**
     * Create an instance of {@link AddVehicleRequest }
     * 
     */
    public AddVehicleRequest createAddVehicleRequest() {
        return new AddVehicleRequest();
    }

    /**
     * Create an instance of {@link GetVehicleListRequest }
     * 
     */
    public GetVehicleListRequest createGetVehicleListRequest() {
        return new GetVehicleListRequest();
    }

    /**
     * Create an instance of {@link GetVehicleListResponse }
     * 
     */
    public GetVehicleListResponse createGetVehicleListResponse() {
        return new GetVehicleListResponse();
    }

    /**
     * Create an instance of {@link GetAccountRequest }
     * 
     */
    public GetAccountRequest createGetAccountRequest() {
        return new GetAccountRequest();
    }

    /**
     * Create an instance of {@link AccountType }
     * 
     */
    public AccountType createAccountType() {
        return new AccountType();
    }

    /**
     * Create an instance of {@link AddAccountRequest }
     * 
     */
    public AddAccountRequest createAddAccountRequest() {
        return new AddAccountRequest();
    }

    /**
     * Create an instance of {@link GetAccountListRequest }
     * 
     */
    public GetAccountListRequest createGetAccountListRequest() {
        return new GetAccountListRequest();
    }

    /**
     * Create an instance of {@link GetAccountListResponse }
     * 
     */
    public GetAccountListResponse createGetAccountListResponse() {
        return new GetAccountListResponse();
    }

    /**
     * Create an instance of {@link GetAccountVehicleListRequest }
     * 
     */
    public GetAccountVehicleListRequest createGetAccountVehicleListRequest() {
        return new GetAccountVehicleListRequest();
    }

    /**
     * Create an instance of {@link AccountVehicleListType }
     * 
     */
    public AccountVehicleListType createAccountVehicleListType() {
        return new AccountVehicleListType();
    }

    /**
     * Create an instance of {@link AddAccountVehicleRequest }
     * 
     */
    public AddAccountVehicleRequest createAddAccountVehicleRequest() {
        return new AddAccountVehicleRequest();
    }

    /**
     * Create an instance of {@link AccountVehicleType }
     * 
     */
    public AccountVehicleType createAccountVehicleType() {
        return new AccountVehicleType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehicleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vehicleleasing.com/v1", name = "getVehicleResponse")
    public JAXBElement<VehicleType> createGetVehicleResponse(VehicleType value) {
        return new JAXBElement<VehicleType>(_GetVehicleResponse_QNAME, VehicleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehicleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vehicleleasing.com/v1", name = "addVehicleResponse")
    public JAXBElement<VehicleType> createAddVehicleResponse(VehicleType value) {
        return new JAXBElement<VehicleType>(_AddVehicleResponse_QNAME, VehicleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vehicleleasing.com/v1", name = "getAccountResponse")
    public JAXBElement<AccountType> createGetAccountResponse(AccountType value) {
        return new JAXBElement<AccountType>(_GetAccountResponse_QNAME, AccountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vehicleleasing.com/v1", name = "addAccountResponse")
    public JAXBElement<AccountType> createAddAccountResponse(AccountType value) {
        return new JAXBElement<AccountType>(_AddAccountResponse_QNAME, AccountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountVehicleListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vehicleleasing.com/v1", name = "getAccountVehicleListResponse")
    public JAXBElement<AccountVehicleListType> createGetAccountVehicleListResponse(AccountVehicleListType value) {
        return new JAXBElement<AccountVehicleListType>(_GetAccountVehicleListResponse_QNAME, AccountVehicleListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountVehicleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vehicleleasing.com/v1", name = "addAccountVehicleResponse")
    public JAXBElement<AccountVehicleType> createAddAccountVehicleResponse(AccountVehicleType value) {
        return new JAXBElement<AccountVehicleType>(_AddAccountVehicleResponse_QNAME, AccountVehicleType.class, null, value);
    }

}
