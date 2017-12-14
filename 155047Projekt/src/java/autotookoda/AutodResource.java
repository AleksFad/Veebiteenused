/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autotookoda;

import ee.ttu.idu0075._2017.ws.autotookoda.AddAutoInfoRequest;
import ee.ttu.idu0075._2017.ws.autotookoda.AddAutoProductRequest;
import ee.ttu.idu0075._2017.ws.autotookoda.Auto;
import ee.ttu.idu0075._2017.ws.autotookoda.AutoProductList;
import ee.ttu.idu0075._2017.ws.autotookoda.GetAutoInfoListRequest;
import ee.ttu.idu0075._2017.ws.autotookoda.GetAutoInfoListResponse;
import ee.ttu.idu0075._2017.ws.autotookoda.GetAutoInfoRequest;
import ee.ttu.idu0075._2017.ws.autotookoda.GetAutoProductListRequest;
import ee.ttu.idu0075._2017.ws.autotookoda.Product;
import java.math.BigInteger;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

/**
 * REST Web Service
 *
 * @author Administrator
 */
@Path("autod")
public class AutodResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of AutodResource
     */
    public AutodResource() {
    }

    @GET
    @Path("{id : \\d+}")
    @Produces("application/json")
    public Auto getAutoInfo(@PathParam("id") String id,
            @QueryParam("token") String token) {
        AutoService autoService = new AutoService();
        GetAutoInfoRequest request = new GetAutoInfoRequest();
        request.setId(BigInteger.valueOf(Integer.parseInt(id)));
        request.setToken(token);      
        return autoService.getAutoInfo(request);
    }
    
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public Auto addAutoInfo(Auto content, 
                                @QueryParam("token") String token,
                                @QueryParam("request_id") String requestId) {
        AutoService autoService = new AutoService();
        AddAutoInfoRequest request = new AddAutoInfoRequest();
        request.setToken(token);
        request.setRequestId(requestId);
        request.setMark(content.getMark());
        request.setMudel(content.getMudel());
        request.setAasta(content.getAasta());
        request.setType(content.getType());
        
        return autoService.addAutoInfo(request);    
    }
    
    @GET
    @Path("{id : \\d+}/products") //support digit only
    @Produces("application/json")
    public AutoProductList getAutoProductList(@PathParam("id") String id,
            @QueryParam("token") String token) {
        AutoService autoService = new AutoService();
        GetAutoProductListRequest request = new GetAutoProductListRequest();
        request.setAutoId(BigInteger.valueOf(Integer.parseInt(id)));
        request.setToken(token);
        
        return autoService.getAutoProductList(request);
    }
    
    /**
     *
     * @param content
     * @param token
     * @param requestId
     * @param id
     * @return 
     */
    @POST
    @Path("{id : \\d+}/products/") //support digit only
    @Consumes("application/json")
    @Produces("application/json")
    public Product addAutoProduct(AddAutoProductRequest content, 
                                @QueryParam("token") String token,
                                @QueryParam("request_id") String requestId,
                                @PathParam("id") String id) {
        AutoService autoService = new AutoService();
        AddAutoProductRequest request = new AddAutoProductRequest();
        request.setToken(token);
        request.setRequestId(requestId);
        request.setAutoId(BigInteger.valueOf(Integer.parseInt(id)));
        request.setProductId(content.getProductId());   
        
        return autoService.addAutoProduct(request);    
    }
    
    /**
     *
     * @param token
     * @param type
     * @param mark
     * @param mudel
     * @return
     */
    @GET
    @Produces("application/json")
    public GetAutoInfoListResponse getAutoInfoList(@QueryParam("token") String token,
            @QueryParam("type") String type,
            @QueryParam("mark") String mark,
            @QueryParam("mudel") String mudel) {
        
        AutoService autoService = new AutoService();
        GetAutoInfoListRequest request = new GetAutoInfoListRequest();
        request.setToken(token);
        request.setType(type);
        request.setMark(mark);
        request.setMudel(mudel);
        
        return autoService.getAutoInfoList(request);
    }
}
