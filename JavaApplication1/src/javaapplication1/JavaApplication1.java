/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import ee.ttu.idu0075._2017.ws.autotookoda.AddProductRequest;
import ee.ttu.idu0075._2017.ws.autotookoda.GetProductRequest;
import ee.ttu.idu0075._2017.ws.autotookoda.Product;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        boolean stop = true;
        String regex = "^[0-9]*$";
        while(stop){
            Scanner obj = new Scanner(System.in);
            String token = "salajane";
            System.out.println("Welcome To Autotookoda service\n"
                    + "Please choose operation: ");
            System.out.println(" '1' - addProduct");
            System.out.println(" '2' - getProduct");
            System.out.println("You choice: ");
            String choice = obj.next();
            if(choice.equalsIgnoreCase("1")){
                System.out.println("You selected addProduct operation ");
                AddProductRequest request = new AddProductRequest();
                request.setToken(token);
                request.setRequestId("addProduct");            
                System.out.println("Please type name of product: ");
                String productName = obj.next();
                System.out.println("Please type price of " + productName);
                String productPrice = obj.next();
                if(productPrice.matches(regex)){
                    Integer test = Integer.parseInt(productPrice);
                    BigDecimal test1 = BigDecimal.valueOf(test);
                    request.setName(productName);
                    request.setHind(test1);
                    Product pt = new Product();
                    pt = addProduct(request);
                    System.out.println("Success: Product " + pt.getName() + " is added!");
                    System.out.println("------------------");
                } else {
                    throw new Exception ("Product price needs to be Integer!");
                }
                
            }
            if(choice.equalsIgnoreCase("2")){
                System.out.println("You selected getProduct operation ");
                GetProductRequest request = new GetProductRequest();
                request.setToken(token);
                System.out.println("Please type a productID: ");
                String productId = obj.next();
                request.setId(new BigInteger(productId));
                Product pt = new Product();
                pt = getProduct(request);
                System.out.println("ProductID: " + pt.getId());
                System.out.println("Product name: " + pt.getName());
                System.out.println("Product price: " + pt.getHind());
                System.out.println("------------------");
            }
            
        }
    }

    private static Product getProduct(ee.ttu.idu0075._2017.ws.autotookoda.GetProductRequest parameter) {
        ee.ttu.idu0075._2017.ws.autotookoda.AutoTooKoda service = new ee.ttu.idu0075._2017.ws.autotookoda.AutoTooKoda();
        ee.ttu.idu0075._2017.ws.autotookoda.AutoPortType port = service.getAutoPort();
        return port.getProduct(parameter);
    }

    private static Product addProduct(ee.ttu.idu0075._2017.ws.autotookoda.AddProductRequest parameter) {
        ee.ttu.idu0075._2017.ws.autotookoda.AutoTooKoda service = new ee.ttu.idu0075._2017.ws.autotookoda.AutoTooKoda();
        ee.ttu.idu0075._2017.ws.autotookoda.AutoPortType port = service.getAutoPort();
        return port.addProduct(parameter);
    }
    
}
