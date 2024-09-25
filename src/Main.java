import domain.Book;
import domain.Cart;
import domain.Customer;
import service.CheckoutService;
import service.mailServer.ConsoleNotificationStrategy;
import service.EmailService;


public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "Author A", 29.99, 10);
        Book book2 = new Book("Python Programming", "Author B", 39.99, 5);

        Customer customer = new Customer("John Doe", "123 Main St", "555-1234");

        Cart cart = new Cart();
        cart.addBook(book1);
        cart.addBook(book2);

        EmailService emailService = new EmailService(new ConsoleNotificationStrategy());
        CheckoutService checkoutService = new CheckoutService(emailService);

        checkoutService.checkout(customer , cart );
    }
}