
package com.vehicleleasing.v1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for accountVehicleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="accountVehicleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vehicle" type="{http://www.vehicleleasing.com/v1}vehicleType"/&gt;
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
@XmlType(name = "accountVehicleType", propOrder = {
    "vehicle",
    "leasePerMonth",
    "leaseStart",
    "leaseEnd"
})
public class AccountVehicleType {

    @XmlElement(required = true)
    protected VehicleType vehicle;
    @XmlElement(required = true)
    protected BigDecimal leasePerMonth;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar leaseStart;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar leaseEnd;

    /**
     * Gets the value of the vehicle property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleType }
     *     
     */
    public VehicleType getVehicle() {
        return vehicle;
    }

    /**
     * Sets the value of the vehicle property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleType }
     *     
     */
    public void setVehicle(VehicleType value) {
        this.vehicle = value;
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
