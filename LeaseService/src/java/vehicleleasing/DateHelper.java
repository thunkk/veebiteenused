/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicleleasing;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author ss
 */
public class DateHelper {
    public static XMLGregorianCalendar toXMLGregorianCalendar(String date) {
        if (!date.matches("\\d{4}-\\d{2}-\\d{2}(+\\d{4})?")) {
            return null;
        }
        try {
            XMLGregorianCalendar calendar = DatatypeFactory.newInstance().newXMLGregorianCalendar();
            String[] parts = date.split("+");
            String[] dateParts = parts[0].split("-");
            calendar.setYear(Integer.parseInt(dateParts[0]));
            calendar.setMonth(Integer.parseInt(dateParts[1]));
            calendar.setDay(Integer.parseInt(dateParts[2]));
            return calendar;
        } catch (DatatypeConfigurationException ex) {
            Logger.getLogger(DateHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
