import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class TwitterCrashed implements ActionListener{
	String tweet;
	String text;
public static void main(String[] args) {
	TwitterCrashed lol = new TwitterCrashed();
	lol.idk();
}
JTextField t1 = new JTextField(15);
 void idk (){
	 JFrame f1 = new JFrame();
	 JPanel p1 = new JPanel();
	 JButton b1 = new JButton();
	 
	 f1.add(p1);
	 
	 f1.setTitle("The hacked twitter account");
	 p1.add(t1);
		p1.add(b1);
		t1.setVisible(true);
	 f1.setVisible(true);
	 p1.setVisible(true);
	 b1.setText("Hack accounts");
		b1.setVisible(true);
		b1.addActionListener(this);
		f1.pack();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		text = t1.getText();
		tweet = getLatestTweet(text);
		// TODO Auto-generated method stub
		System.out.println(tweet);
	}

	private String getLatestTweet(String searchingFor) {

	Twitter twitter = new TwitterFactory().getInstance();
	AccessToken accessToken = new AccessToken(
			"2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
			"vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");
	twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN",
			"6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");
	twitter.setOAuthAccessToken(accessToken);

	Query query = new Query(searchingFor);
	try {
		QueryResult result = twitter.search(query);
		return result.getTweets().get(0).getText();
	} catch (Exception e) {
		System.err.print(e.getMessage());
		return "What the heck is that?";
		
	}
}

}
