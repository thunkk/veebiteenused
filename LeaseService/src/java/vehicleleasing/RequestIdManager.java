/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicleleasing;

import java.time.LocalDateTime;
import java.util.HashMap;

/**
 *
 * @author ss
 */
public class RequestIdManager {
    private RequestIdManager() {}
    private static HashMap<String, LocalDateTime> requestIds = new HashMap<>();
    
    public static boolean isNew(String requestId) {
        LocalDateTime invalidTill = requestIds.get(requestId);
        LocalDateTime now = LocalDateTime.now();
        if (invalidTill != null) {
            return invalidTill.isBefore(now);
        }
        requestIds.put(requestId, now.plusMinutes(1));
        return true;
    }
}
