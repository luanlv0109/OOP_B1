package service;

import java.util.Properties;

public class EmailService implements MessageService {
    private NotificationStrategy notificationStrategy;

    public EmailService(NotificationStrategy notificationStrategy) {
        this.notificationStrategy = notificationStrategy;
    }

    public void sendOrderConfirmation(String to, String customerName, String orderDetails) {
        notificationStrategy.send(to, customerName, orderDetails);
    }

}
