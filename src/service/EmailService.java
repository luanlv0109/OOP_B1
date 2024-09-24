package service;

import java.util.Properties;

public class EmailService {
    public static void sendOrderConfirmation(String to, String customerName, String orderDetails) {
        System.out.println("Người Gửi" + customerName + to + "Nội dung" + orderDetails);
    }
}
