/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autotookoda;

import ee.ttu.idu0075._2017.ws.autotookoda.Auto;
import ee.ttu.idu0075._2017.ws.autotookoda.AutoProductList;
import ee.ttu.idu0075._2017.ws.autotookoda.GetAutoInfoListResponse;
import ee.ttu.idu0075._2017.ws.autotookoda.GetProductListResponse;
import ee.ttu.idu0075._2017.ws.autotookoda.GetProductRequest;
import ee.ttu.idu0075._2017.ws.autotookoda.Product;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;

/**
 *
 * @author Administrator
 */
@WebService(serviceName = "AutoTooKoda", portName = "AutoPort", endpointInterface = "ee.ttu.idu0075._2017.ws.autotookoda.AutoPortType", targetNamespace = "http://www.ttu.ee/idu0075/2017/ws/autotookoda", wsdlLocation = "WEB-INF/wsdl/AutoService/AutoTooKoda.wsdl")
public class AutoService {
    
    static int nextProductId = 1;
    static int nextAutoId = 1;
    static List<Product> productList = new ArrayList<Product>();
    static List<Auto> autoList = new ArrayList<Auto>();
    static String addAuto = "addAutoInfo";
    static String addProduct = "addProduct";
    static String addAutoProduct = "addAutoProduct";
    
    

    public ee.ttu.idu0075._2017.ws.autotookoda.Auto addAutoInfo(ee.ttu.idu0075._2017.ws.autotookoda.AddAutoInfoRequest parameter) {
        Auto auto = new Auto();
               
        if (parameter.getToken().equalsIgnoreCase("salajane") && parameter.getRequestId().equalsIgnoreCase(addAuto)) {
            auto.setId(BigInteger.valueOf(nextAutoId++));
            auto.setMudel(parameter.getMudel());
            auto.setMark(parameter.getMark());
            auto.setAasta(parameter.getAasta());
            auto.setType(parameter.getType());
            auto.setAutoProductList(new AutoProductList());
            autoList.add(auto);
        }       
        return auto;
    }

    public ee.ttu.idu0075._2017.ws.autotookoda.Auto getAutoInfo(ee.ttu.idu0075._2017.ws.autotookoda.GetAutoInfoRequest parameter) {
        Auto auto = null;
        
        if (parameter.getToken().equalsIgnoreCase("salajane")) {
            for (int i = 0; i < autoList.size(); i++) {
                if (autoList.get(i).getId().equals(parameter.getId())) {
                    auto = autoList.get(i);
                }
            }    
        }        
        return auto;
    }

    public ee.ttu.idu0075._2017.ws.autotookoda.Product addProduct(ee.ttu.idu0075._2017.ws.autotookoda.AddProductRequest parameter) {
        Product pt = new Product();
        if (parameter.getToken().equalsIgnoreCase("salajane") && parameter.getRequestId().equalsIgnoreCase(addProduct)) {
            pt.setName(parameter.getName());
            pt.setHind(parameter.getHind());
            pt.setId(BigInteger.valueOf(nextProductId++));
            productList.add(pt);
        }
        return pt;
    }

    public ee.ttu.idu0075._2017.ws.autotookoda.Product getProduct(ee.ttu.idu0075._2017.ws.autotookoda.GetProductRequest parameter) {
        Product pt = null;
        if (parameter.getToken().equalsIgnoreCase("salajane")) {
            for (int i = 0; i < productList.size(); i++) {
                if (productList.get(i).getId().equals(parameter.getId())) {
                    pt = productList.get(i);
                }
            }    
        }
        return pt;
    }

    public ee.ttu.idu0075._2017.ws.autotookoda.GetProductListResponse getProductList(ee.ttu.idu0075._2017.ws.autotookoda.GetProductListRequest parameter) {
        GetProductListResponse response = new GetProductListResponse();
        if (parameter.getToken().equalsIgnoreCase("salajane")) {
            productList.forEach((product) -> {
                response.getProduct().add(product);
            });
        }
        return response;
    }

    public ee.ttu.idu0075._2017.ws.autotookoda.Product addAutoProduct(ee.ttu.idu0075._2017.ws.autotookoda.AddAutoProductRequest parameter) {
        Product product = new Product();
        
        if (parameter.getToken().equalsIgnoreCase("salajane") && parameter.getRequestId().equalsIgnoreCase(addAutoProduct)) {
            GetProductRequest  productRequest = new GetProductRequest();
            productRequest.setId(parameter.getProductId());
            productRequest.setToken(parameter.getToken());
            product = getProduct(productRequest);       
            for (int i = 0; i < autoList.size(); i++) {
                if (autoList.get(i).getId().equals(parameter.getAutoId())) {
                    autoList.get(i).getAutoProductList().getProduct().add(product);                                   
                    return product;
                }
            } 
        }      
        return null;
    }

    public ee.ttu.idu0075._2017.ws.autotookoda.GetAutoInfoListResponse getAutoInfoList(ee.ttu.idu0075._2017.ws.autotookoda.GetAutoInfoListRequest parameter) {
        GetAutoInfoListResponse response = new GetAutoInfoListResponse();
        
        if (parameter.getToken().equalsIgnoreCase("salajane")) {
            if (parameter.getType() != null) {
                if (! parameter.getType().equals("sedaan") &&
                        ! parameter.getType().equals("universaal") &&
                        ! parameter.getType().equals("maastur")) {
                    throw new UnsupportedOperationException("Sisesta õige auto type!");
                }
            }              
            autoList.stream().filter((auto) -> ((auto.getMark().equals(parameter.getMark()) 
                    && auto.getMudel().equals(parameter.getMudel()))
                    && (parameter.getType() != null
                            ? auto.getType().equals(parameter.getType()) : true))).forEachOrdered((auto) -> {
                                response.getAuto().add(auto);
            });
        }      
        return response;
    }

    public ee.ttu.idu0075._2017.ws.autotookoda.AutoProductList getAutoProductList(ee.ttu.idu0075._2017.ws.autotookoda.GetAutoProductListRequest parameter) {
        AutoProductList productList = null;
        
        if (parameter.getToken().equalsIgnoreCase("salajane")) {
            for (int i = 0; i < autoList.size(); i++) {
                if (autoList.get(i).getId().equals(parameter.getAutoId())) {
                    productList = autoList.get(i).getAutoProductList();
                }
            }    
        }
        return productList;
    }    
}
