/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leaseclient;

import com.vehicleleasing.v1.*;
import java.util.Random;

/**
 *
 * @author ss
 */
public class LeaseClient {
    private static String API_KEY = "secret_soap";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (args.length == 1 && args[0].equals("view")) {
            GetAccountListRequest request = new GetAccountListRequest();
            request.setToken(API_KEY);
            GetAccountListResponse accountList = getAccountList(request);
            for (AccountType account : accountList.getAccount()) {
                printAccount(account);
            }
        } else if (args.length == 2 && args[0].equals("add")) {
            Random r = new Random();
            AddAccountRequest request = new AddAccountRequest();
            request.setToken(API_KEY);
            request.setRequestId(Integer.toString(r.nextInt()));
            request.setCustomerName(args[1]);
            printAccount(addAccount(request));
        } else {
            System.out.println("Use 'view' to see the list of accounts. Use 'add [name]' to add an account.");
        }
    }

    private static GetAccountListResponse getAccountList(GetAccountListRequest parameter) {
        LeaseService service = new LeaseService();
        LeasePortType port = service.getLeasePort();
        return port.getAccountList(parameter);
    }

    private static AccountType addAccount(AddAccountRequest parameter) {
        LeaseService service = new LeaseService();
        LeasePortType port = service.getLeasePort();
        return port.addAccount(parameter);
    }
    
    private static void printAccount(AccountType account) {
        System.out.println(account.getCustomerName());
        System.out.println(account.getId());
        System.out.println(account.getCreatedAt());
        System.out.println();
    }
}
