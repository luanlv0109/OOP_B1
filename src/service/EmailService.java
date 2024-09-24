package service;

import java.util.Properties;

public class EmailService {
    public static void sendOrderConfirmation(String to, String customerName, String orderDetails) {
        System.out.println("Người Gửi" + customerName + to + "Nội dung" + orderDetails);
//        String from = "your-email@example.com";
//        String host = "smtp.example.com";
//        Properties properties = System.getProperties();
//        properties.setProperty("mail.smtp.host", host);
//
//        Session session = Session.getDefaultInstance(properties);
//
//        try {
//            MimeMessage message = new MimeMessage(session);
//            message.setFrom(new InternetAddress(from));
//            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
//            message.setSubject("Order Confirmation");
//            message.setText("Dear " + customerName + ",\n\nThank you for your order.\n" + orderDetails);
//
//            Transport.send(message);
//            System.out.println("Order confirmation sent successfully.");
//        } catch (MessagingException mex) {
//            mex.printStackTrace();
//        }
    }
}
