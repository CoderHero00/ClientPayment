/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientpayment;

import service.PaymentService;
import service.PaymentService_Service;

/**
 *
 * @author Lenovo
 */
public class ClientPayment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PaymentService_Service payabs = new PaymentService_Service();
        PaymentService payservice = payabs.getPaymentServicePort();

        String status = payservice.servicePayment(1,10000);
        System.out.println(status);
    }
    
}
