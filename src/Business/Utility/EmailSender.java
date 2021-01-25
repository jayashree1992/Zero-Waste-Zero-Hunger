/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Utility;

import java.util.Map;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


/**
 *
 * @author jayashree
 */
public class EmailSender {

    public static void sendEmail(final String toEmail, String toName, final String emailBody) {

        Thread emailThread = new Thread() {
            public void run() {
                // Recipient's email ID needs to be mentioned.
                String to = toEmail;

                // Sender's email ID needs to be mentioned
                final String from = "jayashreedpatel@gmail.com";

               //  password for from email
                 final String password = "Aed@1234";
//                    final String password = System.getenv("AED_EMAIL_PASS");
//                    System.out.println(password + "hi");
                    
                  
                    

                // Assuming you are sending  email from gmail
                String host = "smtp.gmail.com";

                // Get system properties
                Properties properties = new Properties();

                // Setup mail server
                properties.setProperty("mail.smtp.auth", "true");
                properties.setProperty("mail.smtp.starttls.enable", "true");
                properties.setProperty("mail.smtp.host", host);
                properties.put("mail.smtp.port", "587");

                // Get the default Session object.
                Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(from, password);
                    }
                });

                try {
                    // Create a default MimeMessage object.
                    MimeMessage message = new MimeMessage(session);

                    // Set From: header field of the header.
                    message.setFrom(new InternetAddress(from));

                    // Set To: header field of the header.
                    message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

                    // Set Subject: header field
                    message.setSubject("Delivery Status");

                    // Now set the actual message
                    message.setText(emailBody);

                    // Send message
                    Transport.send(message);
                    System.out.println("Sent message successfully....");
                } catch (MessagingException mex) {
                    System.out.println(mex);
                }
            }
        };
                
        emailThread.start();
    }
}
