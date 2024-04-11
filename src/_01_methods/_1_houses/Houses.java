package _01_methods._1_houses;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
	public void run() {
		Robot rob = new Robot();
		rob.hide();
		rob.setRandomPenColor();
		rob.setX(10);
		rob.setY(590);
		rob.penDown();
		rob.setSpeed(1000);
		rob.setAngle(0);
		rob.move(100);
		rob.turn(90);
		rob.move(25);
		rob.turn(90);
		rob.move(100);
		rob.turn(-90);
		rob.setPenColor(0,200,0);
		rob.move(25);
	}
}
