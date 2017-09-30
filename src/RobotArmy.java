public class RobotArmy {
	public static void main(String[] asd) {
		// 1. create a new human
		Human hi = new Human("trash");
		Human j = new Human("trah");
		Human f = new Human("trsh");
		Human h = new Human("tash");
		Human i = new Human("rash");
		Human a = new Human("trah");
		// 2. create a new Robot army of good and evil robots.
		Robot evilrobot = new Robot("clark", true);
		Robot goodrobot = new Robot("kralc", false);
		Robot evilrobot1 = new Robot("cark", true);
		Robot goodrobot1 = new Robot("krlc", false);
		Robot evilrobot2 = new Robot("clar", true);
		Robot goodrobot2 = new Robot("krlc", false);
		Robot evilrobot3 = new Robot("lark", true);
		Robot goodrobot3 = new Robot("kalc", false);
		Robot evilrobot4 = new Robot("clark", true);
		Robot goodrobot4 = new Robot("kralc", false);
		Robot evilrobot5 = new Robot("clark", true);
		Robot goodrobot5 = new Robot("krac", false);

		// 3. command your robot army to destroy a human
		evilrobot1.destroy(j);
		j.die();
		goodrobot1.destroy(j);
		evilrobot.destroy(hi);
		hi.die();
		goodrobot.destroy(hi);
		evilrobot2.destroy(f);
		f.die();
		goodrobot2.destroy(f);
		evilrobot3.destroy(a);
		a.die();
		goodrobot3.destroy(a);
		evilrobot4.destroy(i);
		i.die();
		goodrobot4.destroy(i);

	}
}

/**
 * Human Class
 */
class Human {
	String name;
	boolean isAlive;

	public Human(String name) {
		this.name = name;
		this.isAlive = true;
	}

	public String getName() {
		return name;
	}

	public void die() {
		isAlive = false;
	}
}

/**
 * Robot Class
 */
class Robot {
	boolean isEvil;
	String name;

	public Robot(String name, boolean isEvil) {
		this.name = name;
		this.isEvil = isEvil;
	}

	public void destroy(Human man) {
		if (isEvil) {
			System.out
					.println("Beep Boop Pew! Oh no! the robot " + name + " blasted " + man.getName() + "'s head off!");
			man.die();
		} else {
			System.out.println("No!! The robot " + name + " loves " + man.getName());
		}
	}
}
