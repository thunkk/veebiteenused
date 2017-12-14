
package com.vehicleleasing.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="customerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="leasesVehicle" type="{http://www.vehicleleasing.com/v1}vinType" minOccurs="0"/&gt;
 *         &lt;element name="hasLeases" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
    "customerName",
    "leasesVehicle",
    "hasLeases"
})
@XmlRootElement(name = "getAccountListRequest")
public class GetAccountListRequest {

    @XmlElement(required = true)
    protected String token;
    protected String customerName;
    protected String leasesVehicle;
    protected Boolean hasLeases;

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
     * Gets the value of the customerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Sets the value of the customerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * Gets the value of the leasesVehicle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeasesVehicle() {
        return leasesVehicle;
    }

    /**
     * Sets the value of the leasesVehicle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeasesVehicle(String value) {
        this.leasesVehicle = value;
    }

    /**
     * Gets the value of the hasLeases property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasLeases() {
        return hasLeases;
    }

    /**
     * Sets the value of the hasLeases property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasLeases(Boolean value) {
        this.hasLeases = value;
    }

}
