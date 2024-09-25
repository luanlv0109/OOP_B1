package service;
public interface MessageService {
    public void sendOrderConfirmation(String to, String customerName, String orderDetails);
}
