 // Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
String url = "https://thestuffinthemargin.files.wordpress.com/2015/02/pic385.jpg";
		// 2. create a variable of type "Component" that will hold your image
Component ha;
		// 3. use the "createImage()" method below to initialize your Component
ha = createImage(url);
		// 4. add the image to the quiz window
quizWindow.add(ha);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String a = JOptionPane.showInputDialog("Wut type of duck is this?");
		// 7. print "CORRECT" if the user gave the right answer
if(a.equals("a fat duck")) {
	JOptionPane.showMessageDialog(null, "CORRECT");
}
		// 8. print "INCORRECT" if the answer is wrong
else {
	JOptionPane.showMessageDialog(null, "WRONG");
}
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
quizWindow.remove(ha);
		// 10. find another image and create it (might take more than one line of code)
String url2 = "https://coleytangerina.files.wordpress.com/2016/06/enhanced-buzz-21710-1338844529-13.jpg";
		// 11. add the second image to the quiz window
Component i;
i = createImage (url2);
quizWindow.add(i);
		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question
String bird = JOptionPane.showInputDialog("wut type of bird is this?");
		// 14+ check answer, say if correct or incorrect, etc.
if(bird.equals("a mega fat bird")) {
	JOptionPane.showMessageDialog(null, "CORRECT");
}
else {
	JOptionPane.showMessageDialog(null, "WRONG");
}
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}




