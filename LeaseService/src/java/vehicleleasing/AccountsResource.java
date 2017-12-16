/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicleleasing;

import com.vehicleleasing.v1.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.math.BigInteger;

/**
 * REST Web Service
 *
 * @author ss
 */
@Path("accounts")
public class AccountsResource {

    @Context
    private UriInfo context;
    private static LeasingService soap = new LeasingService();
    
    /**
     * Creates a new instance of AccountResource
     */
    public AccountsResource() {}

    /**
     * Retrieves representation of an instance of vehicleleasing.AccountResource
     * @return an instance of com.vehicleleasing.v1.AccountType
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public GetAccountListResponse getAccountsList(@QueryParam("token") String token, @QueryParam("customer-name") String customerName, @QueryParam("leases-vehicle") String leasesVehicle, @QueryParam("has-leases") Boolean hasLeases) {
        GetAccountListRequest request = new GetAccountListRequest();
        request.setToken(token);
        request.setCustomerName(customerName);
        request.setLeasesVehicle(leasesVehicle);
        request.setHasLeases(hasLeases);
        return soap.getAccountList(request);
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public AccountType addAccount(@QueryParam("token") String token, @QueryParam("request-id") String requestId, AccountType account) {
        AddAccountRequest request = new AddAccountRequest();
        request.setToken(token);
        request.setRequestId(requestId);
        request.setCustomerName(account.getCustomerName());
        return soap.addAccount(request);
    }
    
    @GET
    @Path("{id : \\d+}")
    @Produces(MediaType.APPLICATION_JSON)
    public AccountType getAccount(@QueryParam("token") String token, @PathParam("id") String id) {
        GetAccountRequest request = new GetAccountRequest();
        request.setToken(token);
        request.setId(new BigInteger(id));
        return soap.getAccount(request);
    }
    
    @POST
    @Path("{id : \\d+}/vehicles")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public AccountVehicleType addAccountVehicle(@QueryParam("token") String token, @QueryParam("request-id") String requestId, @PathParam("id") String id, RESTAccountVehicle accountVehicle) {
        AddAccountVehicleRequest request = new AddAccountVehicleRequest();
        request.setToken(token);
        request.setRequestId(requestId);
        request.setAccountId(new BigInteger(id));
        request.setVin(accountVehicle.getVin());
        request.setLeaseStart(DateHelper.toXMLGregorianCalendar(accountVehicle.getLeaseStart()));
        request.setLeaseEnd(DateHelper.toXMLGregorianCalendar(accountVehicle.getLeaseEnd()));
        request.setLeasePerMonth(accountVehicle.getLeasePerMonth());
        return soap.addAccountVehicle(request);
    }
    
    @GET
    @Path("{id : \\d+}/vehicles")
    @Produces(MediaType.APPLICATION_JSON)
    public AccountVehicleListType getAccountVehicleList(@QueryParam("token") String token, @PathParam("id") String id) {
        GetAccountVehicleListRequest request = new GetAccountVehicleListRequest();
        request.setToken(token);
        request.setAccountId(new BigInteger(id));
        return soap.getAccountVehicleList(request);
    }
}
