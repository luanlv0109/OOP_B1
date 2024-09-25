import domain.Book;
import domain.Cart;
import domain.Customer;
import service.CheckoutService;
import service.MessageService;
import service.mailServer.ConsoleNotificationStrategy;
import service.EmailService;
import utils.CartUtil;
import utils.CustomerUtil;

public class Main {
    public static void main(String[] args) {
        Customer customer = CustomerUtil.createSampleCustomer();
        Cart cart = CartUtil.createSampleCart();

        MessageService messageService = new EmailService(new ConsoleNotificationStrategy());
        CheckoutService checkoutService = new CheckoutService(messageService);

        checkoutService.checkout(customer, cart);
    }
}
