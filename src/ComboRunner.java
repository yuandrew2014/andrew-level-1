
public class ComboRunner {
public static void main(String[] args) {
	Movie m1 = new Movie("Guardians of the Galaxy 2", 8);
	m1.getRating();
	m1.getTicketPrice();
	m1.getTitle();
	Movie m2 = new Movie("The Last Knight", 6);
	m2.getRating();
	m2.getTicketPrice();
	m2.getTitle();

	Movie m3 = new Movie("The Martian", 9);
	m3.getRating();
	m3.getTicketPrice();
	m3.getTitle();

	Movie m4 = new Movie("logan", 8);
	m4.getRating();
	m4.getTicketPrice();
	m4.getTitle();

	Movie m5 = new Movie("King Kong Skull Island", 7);
	m5.getRating();
	m5.getTicketPrice();
	m5.getTitle();

	NetflixQueue netflix = new NetflixQueue();
	netflix.addMovie(m1);
	netflix.addMovie(m2);
	netflix.addMovie(m3);
	netflix.addMovie(m4);
	netflix.addMovie(m5);
	netflix.printMovies();
stars();
tars();
}

private static void stars() {
	// TODO Auto-generated method stub
	System.out.println("martian is the best movie");
}
private static void tars() {
	// TODO Auto-generated method stub
	System.out.println("guardians of the galaxy is the 2nd best movie");
}
}