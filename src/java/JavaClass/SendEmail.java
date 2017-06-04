package JavaClass;

import java.util.Properties;
import javax.mail.*;
import javax.activation.*;
import javax.mail.internet.*;
import javax.mail.internet.InternetAddress;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class SendEmail {

    public static void main(String[] args) {
        //from,password,to,subject,message

        //change from, password and to  
    }

    public static void email(String from, String password, String to, String sub, String msg) {
        /* String from = "sirdewong@gmail.com";
        String password = "055452631";
        String to = "";
        String subject = "Tyrus K9 Inquiry";
        String msg = ""; */
        Mailer.send(from, password, to, sub, msg);
    }
}

class Mailer {

    public static void send(String from, String password, String to, String sub, String msg) {
        //Get properties object    
        Properties props = new Properties();
        props.put("mail.smtp.user", from);
        props.put("mail.smtp.host", "smtp-mail.outlook.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.socketFactory.port", "587");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.socketFactory.fallback", "true");
        //get Session   
        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, password);
            }
        });
        //compose message 
        
        try
          {
          Authenticator auth = new javax.mail.Authenticator() {
              protected PasswordAuthentication getPasswordAuthentication() {
                  return new PasswordAuthentication(from, password);
              }
            };
          
          
          
          MimeMessage msg1 = new MimeMessage(session);
          
          msg1.setText(msg);
          msg1.setSubject(sub);
          msg1.setFrom(new InternetAddress(from));
          msg1.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
          Transport.send(msg1);

          }catch (Exception mex) {
             mex.printStackTrace();
          }

    }
    
}
