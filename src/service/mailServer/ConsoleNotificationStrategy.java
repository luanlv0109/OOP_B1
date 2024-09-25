package service.mailServer;

import service.NotificationStrategy;

public class ConsoleNotificationStrategy implements NotificationStrategy {
    @Override
    public void send(String to, String customerName, String orderDetails) {
        System.out.println("Order Confirmation:");
        System.out.println("To: " + to);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Order Details: " + orderDetails);
    }
}
