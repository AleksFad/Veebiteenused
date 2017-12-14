
package ee.ttu.idu0075._2017.ws.autotookoda;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for auto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="auto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="mark" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mudel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aasta" type="{http://www.ttu.ee/idu0075/2017/ws/autotookoda}aasta"/&gt;
 *         &lt;element name="type" type="{http://www.ttu.ee/idu0075/2017/ws/autotookoda}keretuup"/&gt;
 *         &lt;element name="autoProductList" type="{http://www.ttu.ee/idu0075/2017/ws/autotookoda}autoProductList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "auto", propOrder = {
    "id",
    "mark",
    "mudel",
    "aasta",
    "type",
    "autoProductList"
})
public class Auto {

    @XmlElement(required = true)
    protected BigInteger id;
    @XmlElement(required = true)
    protected String mark;
    protected String mudel;
    @XmlSchemaType(name = "integer")
    protected int aasta;
    @XmlElement(required = true)
    protected String type;
    @XmlElement(required = true)
    protected AutoProductList autoProductList;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
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

    /**
     * Gets the value of the autoProductList property.
     * 
     * @return
     *     possible object is
     *     {@link AutoProductList }
     *     
     */
    public AutoProductList getAutoProductList() {
        return autoProductList;
    }

    /**
     * Sets the value of the autoProductList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoProductList }
     *     
     */
    public void setAutoProductList(AutoProductList value) {
        this.autoProductList = value;
    }

}
