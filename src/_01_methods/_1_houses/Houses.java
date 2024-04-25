package _01_methods._1_houses;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
	Robot rob = new Robot();
	public void run() {

		rob.hide();
		rob.setRandomPenColor();
		rob.setX(10);
		rob.setY(590);
		rob.penDown();
		rob.setSpeed(1000);
		rob.setAngle(0);
		drawHouse("small", Color.black);
		drawHouse("medium", Color.red);
		drawHouse("large", Color.GREEN);
		drawHouse("small", Color.black);
		drawHouse("medium", Color.red);
		drawHouse("large", Color.GREEN);
		drawHouse("small", Color.black);
		drawHouse("medium", Color.red);
		drawHouse("large", Color.GREEN);
		drawHouse("small", Color.black);
	}

	public void drawHouse(int height, Color color) {
		rob.setPenColor(color);
		rob.move(height);
		if (height==250) {
			drawFlatRoof();
		}
		else {
		drawPointyRoof();
		}
		rob.move(height);
		rob.turn(-90);
		rob.setPenColor(100,200,100);
		rob.move(25);
		rob.setAngle(0);
	}

	private void drawPointyRoof() {
		rob.turn(45);
		rob.move(25);
		rob.turn(90);
		rob.move(25);
		rob.turn(45);
	}	
	private void drawFlatRoof() {
		rob.turn(90);
		rob.move(25);
		rob.turn(90);
	}	
	public void drawHouse(String height, Color color) {
		if (height.equals("small")) {
			drawHouse(60, color);
		}
		if (height.equals("medium")) {
			drawHouse(120, color);
		}
		if (height.equals("large")) {
			drawHouse(250, color);
		}
	}
}