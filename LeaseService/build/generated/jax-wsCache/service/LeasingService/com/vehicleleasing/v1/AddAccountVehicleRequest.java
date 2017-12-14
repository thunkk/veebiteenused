
package com.vehicleleasing.v1;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="accountId" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="vin" type="{http://www.vehicleleasing.com/v1}vinType"/&gt;
 *         &lt;element name="leasePerMonth" type="{http://www.vehicleleasing.com/v1}moneyType"/&gt;
 *         &lt;element name="leaseStart" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="leaseEnd" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
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
    "accountId",
    "vin",
    "leasePerMonth",
    "leaseStart",
    "leaseEnd"
})
@XmlRootElement(name = "addAccountVehicleRequest")
public class AddAccountVehicleRequest {

    @XmlElement(required = true)
    protected String token;
    @XmlElement(required = true)
    protected String requestId;
    @XmlElement(required = true)
    protected BigInteger accountId;
    @XmlElement(required = true)
    protected String vin;
    @XmlElement(required = true)
    protected BigDecimal leasePerMonth;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar leaseStart;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar leaseEnd;

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
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAccountId(BigInteger value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the vin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVin() {
        return vin;
    }

    /**
     * Sets the value of the vin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVin(String value) {
        this.vin = value;
    }

    /**
     * Gets the value of the leasePerMonth property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLeasePerMonth() {
        return leasePerMonth;
    }

    /**
     * Sets the value of the leasePerMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLeasePerMonth(BigDecimal value) {
        this.leasePerMonth = value;
    }

    /**
     * Gets the value of the leaseStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLeaseStart() {
        return leaseStart;
    }

    /**
     * Sets the value of the leaseStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLeaseStart(XMLGregorianCalendar value) {
        this.leaseStart = value;
    }

    /**
     * Gets the value of the leaseEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLeaseEnd() {
        return leaseEnd;
    }

    /**
     * Sets the value of the leaseEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLeaseEnd(XMLGregorianCalendar value) {
        this.leaseEnd = value;
    }

}
