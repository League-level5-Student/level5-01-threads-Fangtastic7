package _01_Olympic_Rings;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	public static void main(String[] args) {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	Robot blue = new Robot(200, 400);
	Robot black = new Robot(600, 400);
	Robot red = new Robot(1000, 400);
	Robot yellow = new Robot(400, 600);
	Robot green = new Robot(800, 600);
	
	blue.setSpeed(10);
	black.setSpeed(10);
	red.setSpeed(10);
	yellow.setSpeed(10);
	green.setSpeed(10);
	
	blue.setPenColor(Color.blue);
	black.setPenColor(Color.BLACK);
	red.setPenColor(Color.red);
	yellow.setPenColor(Color.YELLOW);
	green.setPenColor(Color.GREEN);
	
	blue.penDown();
	black.penDown();
	red.penDown();
	yellow.penDown();
	green.penDown();
	
	Thread x = new Thread(()->circle(blue));
	Thread y = new Thread(()->circle(black));
	Thread z = new Thread(()->circle(red));
	Thread a = new Thread(()->circle(yellow));
	Thread b = new Thread(()->circle(green));
	
	x.start();
	y.start();
	z.start();
	a.start();
	b.start();
	
	}	
	public static void circle(Robot bot) {
		for(int i=0;i<360;i++) {
			bot.move(3);
			bot.turn(1);
		}
	}
}

