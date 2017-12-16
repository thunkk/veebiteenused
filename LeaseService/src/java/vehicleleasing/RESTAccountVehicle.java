/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicleleasing;

import java.math.BigDecimal;

/**
 *
 * @author ss
 */
public class RESTAccountVehicle {
    private String vin, leaseStart, leaseEnd;
    private BigDecimal leasePerMonth = null;

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getLeaseStart() {
        return leaseStart;
    }

    public void setLeaseStart(String leaseStart) {
        this.leaseStart = leaseStart;
    }

    public String getLeaseEnd() {
        return leaseEnd;
    }

    public void setLeaseEnd(String leaseEnd) {
        this.leaseEnd = leaseEnd;
    }

    public BigDecimal getLeasePerMonth() {
        return leasePerMonth;
    }

    public void setLeasePerMonth(BigDecimal leasePerMonth) {
        this.leasePerMonth = leasePerMonth;
    }
    
}
