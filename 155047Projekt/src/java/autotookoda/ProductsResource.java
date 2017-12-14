/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autotookoda;

import ee.ttu.idu0075._2017.ws.autotookoda.AddProductRequest;
import ee.ttu.idu0075._2017.ws.autotookoda.GetProductListRequest;
import ee.ttu.idu0075._2017.ws.autotookoda.GetProductListResponse;
import ee.ttu.idu0075._2017.ws.autotookoda.GetProductRequest;
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
@Path("products")
public class ProductsResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ProductsResource
     */
    public ProductsResource() {
    }

    /**
     *
     * @param token
     * @return
     */
    @GET
    @Produces("application/json")
    public GetProductListResponse getProductList(@QueryParam("token") String token) {
        AutoService autoService = new AutoService();
        GetProductListRequest request = new GetProductListRequest();     
        request.setToken(token); 
        return autoService.getProductList(request);
    }
    
    /**
     *
     * @param id
     * @param token
     * @return
     */
    @GET
    @Path("{id : \\d+}") //supports digits only
    @Produces("application/json")
    public Product getProduct(@PathParam("id") String id,
            @QueryParam("token") String token) {
        AutoService autoService = new AutoService();
        GetProductRequest request = new GetProductRequest();
        
        request.setId(BigInteger.valueOf(Integer.parseInt(id)));
        request.setToken(token);        
        return autoService.getProduct(request);
    }
    
    /**
     *
     * @param product
     * @param token
     * @param requestId
     * @return
     */
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public Product addProduct(Product product, 
                                @QueryParam("token") String token,
                                @QueryParam("request_id") String requestId) {
        AutoService autoService = new AutoService();
        AddProductRequest request = new AddProductRequest();
        
        request.setToken(token);
        request.setName(product.getName());
        request.setHind(product.getHind());
        request.setRequestId(requestId);
       
        return autoService.addProduct(request);
    }
}
