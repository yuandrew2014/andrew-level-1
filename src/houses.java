import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class houses {
	static Robot trash = new Robot();

	public static void main(String[] args) {

		start();
		small();
		medium();
		big();
		small();
		medium();
		big();
		small();
		medium();
		big();
		small();

	}

	static void start() {
		trash.setSpeed(100000000);
		trash.setX(0);
		trash.setY(500);
	}

	static void small() {
		trash.setPenColor(Color.BLUE);
		drawHouse(100);

	}

	static void medium() {
		trash.setPenColor(Color.GREEN);
		drawHouse(200);

	}

	static void big() {
		trash.setPenColor(Color.BLACK);
		drawHouse(300);

	}

	// 315
	static void roof() {
		trash.turn(-45);
		trash.move(12);
		trash.turn(-90);
		trash.move(12);
		trash.turn(-45);
	}

	static void drawHouse(int height) {

		trash.penDown();

		trash.move(height);
		// trash.turn(90);
		// trash.move(25);
		// trash.turn(90);
		roof();
		trash.move(height);
		trash.turn(270);
		trash.setPenColor(Color.GREEN);
		trash.move(50);
		trash.turn(270);
	}
}
