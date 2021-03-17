package Utilities;

import java.io.File;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import org.testng.annotations.AfterSuite;

public class Email {

	@AfterSuite
	public void Emailsend() throws Exception {

		final String username = "testrepustarfb@gmail.com";
		final String password = "data@123";

		Properties props = new Properties();
		props.put("mail.smtp.auth", true);
		props.put("mail.smtp.starttls.enable", true);
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props,
				new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});
		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("testrepustarfb@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse("jakeers@datatemplate.in"));

			message.setSubject("LRES-Test Report");
			message.setText("PFA");

			MimeBodyPart messageBodyPart = new MimeBodyPart();

			Multipart multipart = new MimeMultipart();

			String projectPath = System.getProperty("user.dir");
			
			String file = projectPath+"\\test-output\\emailable-report.html";
			System.out.println(file);
			
			String fileName = "emailable-report.html";

			File att = new File(new File(file), fileName);
			messageBodyPart.attachFile(att);
			DataSource source = new FileDataSource(file);
			messageBodyPart.setDataHandler(new DataHandler(source));
			messageBodyPart.setFileName(fileName);
			multipart.addBodyPart(messageBodyPart);

			message.setContent(multipart);

			System.out.println("Sending report to mail..");

			Transport.send(message);

			System.out.println("Mail has been sent..!");

		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}
}
