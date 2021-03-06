
package com.vehicleleasing.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for vehicleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vehicleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vin" type="{http://www.vehicleleasing.com/v1}vinType"/&gt;
 *         &lt;element name="licensePlate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="type" type="{http://www.vehicleleasing.com/v1}vehicleTypeType"/&gt;
 *         &lt;element name="brand" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="model" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="acquiredAt" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="soldAt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vehicleType", propOrder = {
    "vin",
    "licensePlate",
    "type",
    "brand",
    "model",
    "acquiredAt",
    "soldAt"
})
public class VehicleType {

    @XmlElement(required = true)
    protected String vin;
    @XmlElement(required = true)
    protected String licensePlate;
    @XmlElement(required = true)
    protected String type;
    @XmlElement(required = true)
    protected String brand;
    @XmlElement(required = true)
    protected String model;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar acquiredAt;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar soldAt;

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
     * Gets the value of the licensePlate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicensePlate() {
        return licensePlate;
    }

    /**
     * Sets the value of the licensePlate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicensePlate(String value) {
        this.licensePlate = value;
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
     * Gets the value of the brand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Sets the value of the brand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrand(String value) {
        this.brand = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Gets the value of the acquiredAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcquiredAt() {
        return acquiredAt;
    }

    /**
     * Sets the value of the acquiredAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcquiredAt(XMLGregorianCalendar value) {
        this.acquiredAt = value;
    }

    /**
     * Gets the value of the soldAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSoldAt() {
        return soldAt;
    }

    /**
     * Sets the value of the soldAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSoldAt(XMLGregorianCalendar value) {
        this.soldAt = value;
    }

}
