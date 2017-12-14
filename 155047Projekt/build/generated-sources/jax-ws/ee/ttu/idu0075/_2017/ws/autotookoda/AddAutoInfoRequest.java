
package ee.ttu.idu0075._2017.ws.autotookoda;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="requestId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mark" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mudel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aasta" type="{http://www.ttu.ee/idu0075/2017/ws/autotookoda}aasta"/&gt;
 *         &lt;element name="type" type="{http://www.ttu.ee/idu0075/2017/ws/autotookoda}keretuup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "token",
    "requestId",
    "mark",
    "mudel",
    "aasta",
    "type"
})
@XmlRootElement(name = "addAutoInfoRequest")
public class AddAutoInfoRequest {

    @XmlElement(required = true)
    protected String token;
    @XmlElement(required = true)
    protected String requestId;
    @XmlElement(required = true)
    protected String mark;
    protected String mudel;
    @XmlSchemaType(name = "integer")
    protected int aasta;
    @XmlElement(required = true)
    protected String type;

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Gets the value of the requestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

    /**
     * Gets the value of the mark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMark() {
        return mark;
    }

    /**
     * Sets the value of the mark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMark(String value) {
        this.mark = value;
    }

    /**
     * Gets the value of the mudel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMudel() {
        return mudel;
    }

    /**
     * Sets the value of the mudel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMudel(String value) {
        this.mudel = value;
    }

    /**
     * Gets the value of the aasta property.
     * 
     */
    public int getAasta() {
        return aasta;
    }

    /**
     * Sets the value of the aasta property.
     * 
     */
    public void setAasta(int value) {
        this.aasta = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
