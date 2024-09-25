package service;

import domain.Cart;
import domain.Customer;

public class CheckoutService {

    private EmailService emailService;

    public CheckoutService(EmailService emailService) {
        this.emailService = emailService;
    }
    public void checkout(Customer customer, Cart cart) {
        System.out.println("Checkout successful for " + customer.getName());

        String orderDetails = generateOrderDetails(cart);

        emailService.sendOrderConfirmation(customer.getEmail(), customer.getName(), orderDetails);
    }

    private String generateOrderDetails(Cart cart) {
        StringBuilder details = new StringBuilder();
        details.append("Order contains: ");
        cart.getBooks().forEach(book -> details.append(book.getName()).append(", "));
        details.append("Total Price: ").append(cart.getTotalPrice());
        return details.toString();
    }

}
