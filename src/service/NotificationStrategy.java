package service;

public interface NotificationStrategy {
    void send(String to, String customerName, String orderDetails);
}
