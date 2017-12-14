
package com.vehicleleasing.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for accountVehicleListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="accountVehicleListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountVehicle" type="{http://www.vehicleleasing.com/v1}accountVehicleType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accountVehicleListType", propOrder = {
    "accountVehicle"
})
public class AccountVehicleListType {

    protected List<AccountVehicleType> accountVehicle;

    /**
     * Gets the value of the accountVehicle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountVehicle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountVehicle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountVehicleType }
     * 
     * 
     */
    public List<AccountVehicleType> getAccountVehicle() {
        if (accountVehicle == null) {
            accountVehicle = new ArrayList<AccountVehicleType>();
        }
        return this.accountVehicle;
    }

}
