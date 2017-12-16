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
import javax.ws.rs.Path;
import javax.ws.rs.POST;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author ss
 */
@Path("vehicles")
public class VehiclesResource {

    @Context
    private UriInfo context;
    private static LeasingService soap = new LeasingService();

    /**
     * Creates a new instance of VehiclesResource
     */
    public VehiclesResource() {
    }

    /**
     * Retrieves representation of an instance of vehicleleasing.VehiclesResource
     * @return an instance of com.vehicleleasing.v1.VehicleType
     */
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public GetVehicleListResponse getVehicleList(@QueryParam("token") String token) {
        GetVehicleListRequest request = new GetVehicleListRequest();
        request.setToken(token);
        return soap.getVehicleList(request);
    }
    
    @GET
    @Path("{vin : [A-Z0-9]{17}}")
    @Produces(MediaType.APPLICATION_JSON)
    public VehicleType getVehicle(@QueryParam("token") String token, @PathParam("vin") String vin) {
        GetVehicleRequest request = new GetVehicleRequest();
        request.setToken(token);
        request.setVin(vin);
        return soap.getVehicle(request);
    }

    /**
     * PUT method for updating or creating an instance of VehiclesResource
     * @param content representation for the resource
     */
    @POST
    @Consumes(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_XML)
    public VehicleType addVehicle(@QueryParam("token") String token, @QueryParam("token") String requestId, RESTVehicleType vehicle) {
        AddVehicleRequest request = new AddVehicleRequest();
        request.setToken(token);
        request.setRequestId(requestId);
        request.setAcquiredAt(DateHelper.toXMLGregorianCalendar(vehicle.getAcquiredAt()));
        request.setBrand(vehicle.getBrand());
        request.setLicensePlate(vehicle.getLicensePlate());
        request.setModel(vehicle.getModel());
        request.setType(vehicle.getType());
        request.setVin(vehicle.getVin());
        return soap.addVehicle(request);
    }
}
