import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Nasty implements ActionListener {
public static void main(String[] args) {
	Nasty n = new Nasty();
	n.v();
}
JButton b1 = new JButton();
JButton b2 = new JButton();
void v() {
	JFrame f1 = new JFrame();
	JPanel p1 = new JPanel();

	f1.add(p1);
	p1.add(b1);
	p1.add(b2);
	f1.setVisible(true);
	p1.setVisible(true);
	b1.setVisible(true);
	b1.setText("trick");
	b2.setVisible(true);
	b2.setText("TREAT");
	b1.addActionListener(this);
	b2.addActionListener(this);
	f1.pack();
}
private void trash(String imageUrl) {
	try {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		JFrame frame = new JFrame();
		frame.add(imageLabel);
		frame.setVisible(true);
		frame.pack();
	} catch (MalformedURLException e) {
		e.printStackTrace();
	}
}


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource()==b1) {
		trash("https://i.pinimg.com/736x/e2/4e/2c/e24e2c573c106098c31a995dbea8bc6d--chow-chow-puppies-hair-cut.jpg");
	}
	else {
		trash("http://www.qygjxz.com/data/out/202/4773721-scary-images.png");
	}
}
}
