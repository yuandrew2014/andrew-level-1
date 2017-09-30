import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class WeLuvSpamBCItIsMEat implements ActionListener {
	static final String FAKE_USERNAME = "asainchickenproductions2@gmail.com";
	static final String FAKE_PASSWORD = "abcdefghijklmnop";
public static void main(String[] args) {
	WeLuvSpamBCItIsMEat s1 = new WeLuvSpamBCItIsMEat();
	s1.v1();
	}
JButton b1= new JButton();
JButton b2 = new JButton();
void v1() {
	JFrame f1 = new JFrame();
	JPanel p1 = new JPanel();
	JTextField t1 = new JTextField(20);
	t1.setBackground(Color.ORANGE);
	b1.setText("good");
	
	b2.setText("bad");
	f1.setVisible(true);
	p1.setVisible(true);
	t1.setVisible(true);
	b1.setVisible(true);
	b2.setVisible(true);
f1.add(p1);
p1.add(t1);
p1.add(b1);
p1.add(b2);
f1.pack();
}
private boolean sendSpam(String recipient, String subject, String content) {

	Properties props = new Properties();
	props.put("mail.smtp.auth", "true");
	props.put("mail.smtp.starttls.enable", "true");
	props.put("mail.smtp.host", "smtp.gmail.com");
	props.put("mail.smtp.port", "587");

	Session session = Session.getInstance(props, new javax.mail.Authenticator() {
		protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
			return new javax.mail.PasswordAuthentication(FAKE_USERNAME, FAKE_PASSWORD);
		}
	});

	try {

		Message message = new MimeMessage(session);
		message.setFrom(new InternetAddress(FAKE_USERNAME));
		message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
		message.setSubject(subject);
		message.setText(content);
		Transport.send(message);
		return true;

	} catch (MessagingException e) {
e.printStackTrace();
return false;
	}
}
@Override
public void actionPerformed(ActionEvent e ) {
	// TODO Auto-generated method stub
	if (e.getSource()==b2) {
		
	
	sendSpam(FAKE_USERNAME,"garbage","ur ugly as a butt");
}
	if (e.getSource()==b1) {
		sendSpam(FAKE_USERNAME,"garbage","ur look fabulous like a rotten corpse that has been sitting hor 656 years and is super stinky, ect.");
		
	}
}
}
