
public class SmurfRunner {
public static void main(String[] args) {
	Smurf handy = new Smurf("handy");
	
	System.out.println(handy.getName());
	handy.eat();
	System.out.println(handy.getHatColor());
	System.out.println(handy.isGirlOrBoy());
	Smurf baba = new Smurf("papa");
	System.out.println(baba.getName());
	System.out.println(baba.getHatColor());
	baba.eat();
	System.out.println(baba.isGirlOrBoy());
	Smurf smurffete = new Smurf("Smurffete");
	System.out.println(smurffete.getName());
	System.out.println(smurffete.getHatColor());
	smurffete.eat();
	System.out.println(smurffete.isGirlOrBoy());
}
}
