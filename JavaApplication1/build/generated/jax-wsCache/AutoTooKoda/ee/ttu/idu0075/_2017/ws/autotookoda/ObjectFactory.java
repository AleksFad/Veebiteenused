
package ee.ttu.idu0075._2017.ws.autotookoda;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ee.ttu.idu0075._2017.ws.autotookoda package. 
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

    private final static QName _GetProductResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2017/ws/autotookoda", "getProductResponse");
    private final static QName _AddAutoProductResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2017/ws/autotookoda", "addAutoProductResponse");
    private final static QName _GetAutoInfoResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2017/ws/autotookoda", "getAutoInfoResponse");
    private final static QName _AddProductResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2017/ws/autotookoda", "addProductResponse");
    private final static QName _GetAutoProductListResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2017/ws/autotookoda", "getAutoProductListResponse");
    private final static QName _AddAutoInfoResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2017/ws/autotookoda", "addAutoInfoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ee.ttu.idu0075._2017.ws.autotookoda
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link GetProductListResponse }
     * 
     */
    public GetProductListResponse createGetProductListResponse() {
        return new GetProductListResponse();
    }

    /**
     * Create an instance of {@link GetAutoProductListRequest }
     * 
     */
    public GetAutoProductListRequest createGetAutoProductListRequest() {
        return new GetAutoProductListRequest();
    }

    /**
     * Create an instance of {@link GetAutoInfoRequest }
     * 
     */
    public GetAutoInfoRequest createGetAutoInfoRequest() {
        return new GetAutoInfoRequest();
    }

    /**
     * Create an instance of {@link AddProductRequest }
     * 
     */
    public AddProductRequest createAddProductRequest() {
        return new AddProductRequest();
    }

    /**
     * Create an instance of {@link AutoProductList }
     * 
     */
    public AutoProductList createAutoProductList() {
        return new AutoProductList();
    }

    /**
     * Create an instance of {@link Auto }
     * 
     */
    public Auto createAuto() {
        return new Auto();
    }

    /**
     * Create an instance of {@link AddAutoProductRequest }
     * 
     */
    public AddAutoProductRequest createAddAutoProductRequest() {
        return new AddAutoProductRequest();
    }

    /**
     * Create an instance of {@link GetAutoInfoListRequest }
     * 
     */
    public GetAutoInfoListRequest createGetAutoInfoListRequest() {
        return new GetAutoInfoListRequest();
    }

    /**
     * Create an instance of {@link AddAutoInfoRequest }
     * 
     */
    public AddAutoInfoRequest createAddAutoInfoRequest() {
        return new AddAutoInfoRequest();
    }

    /**
     * Create an instance of {@link GetAutoInfoListResponse }
     * 
     */
    public GetAutoInfoListResponse createGetAutoInfoListResponse() {
        return new GetAutoInfoListResponse();
    }

    /**
     * Create an instance of {@link GetProductRequest }
     * 
     */
    public GetProductRequest createGetProductRequest() {
        return new GetProductRequest();
    }

    /**
     * Create an instance of {@link GetProductListRequest }
     * 
     */
    public GetProductListRequest createGetProductListRequest() {
        return new GetProductListRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2017/ws/autotookoda", name = "getProductResponse")
    public JAXBElement<Product> createGetProductResponse(Product value) {
        return new JAXBElement<Product>(_GetProductResponse_QNAME, Product.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2017/ws/autotookoda", name = "addAutoProductResponse")
    public JAXBElement<Product> createAddAutoProductResponse(Product value) {
        return new JAXBElement<Product>(_AddAutoProductResponse_QNAME, Product.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Auto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2017/ws/autotookoda", name = "getAutoInfoResponse")
    public JAXBElement<Auto> createGetAutoInfoResponse(Auto value) {
        return new JAXBElement<Auto>(_GetAutoInfoResponse_QNAME, Auto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2017/ws/autotookoda", name = "addProductResponse")
    public JAXBElement<Product> createAddProductResponse(Product value) {
        return new JAXBElement<Product>(_AddProductResponse_QNAME, Product.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutoProductList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2017/ws/autotookoda", name = "getAutoProductListResponse")
    public JAXBElement<AutoProductList> createGetAutoProductListResponse(AutoProductList value) {
        return new JAXBElement<AutoProductList>(_GetAutoProductListResponse_QNAME, AutoProductList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Auto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2017/ws/autotookoda", name = "addAutoInfoResponse")
    public JAXBElement<Auto> createAddAutoInfoResponse(Auto value) {
        return new JAXBElement<Auto>(_AddAutoInfoResponse_QNAME, Auto.class, null, value);
    }

}
