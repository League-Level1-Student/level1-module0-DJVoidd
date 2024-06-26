package _02_return_types._3_too_many_shapes;



import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class TooManyShapes {
	static Robot rob = new Robot();

	public static void main(String[] args) {
		//1. Ask the user how many sides they want their shape to be
		String askNumSides = JOptionPane.showInputDialog("How many sides do you want your shape to have");
		int numSides = Integer.parseInt(askNumSides);
		//2. Ask the user how many shapes they want
		String askNumShapes = JOptionPane.showInputDialog("How many shapes do you want");
		int numShapes = Integer.parseInt(askNumShapes);
		//3. Call canMakeShape() and save what is returned into a variable
		boolean possible = canMakeShape(numSides); 
		//4. If the shape CAN be drawn
		if (possible == true) {

			//5. Call and save what is returned from calculateTurnAngle()
int degrees = calculateTurnAngle(numSides);
			//6. Use drawPolygons() to draw your shape
drawPolygons(numSides, numShapes, degrees);
		}
		//7. If the shape CANNOT be drawn 
		else if (possible == false) {
			JOptionPane.showMessageDialog(null, notEnoughSides());
		}
		//8. Call notEnoughSides() and print out what is returned 

	}

	static int calculateTurnAngle(int numSides) {
		int angle = 360/numSides;
		return angle;
	}

	static void drawPolygons(int numSides, int numShapes, int degrees) {
		rob.setSpeed(100);
		rob.penDown();
		int dist = 25;
		Random rand = new Random();

		for(int i = 0; i < numShapes; i++) {
			int x = rand.nextInt(600);
			int y = rand.nextInt(600);
			int angle = rand.nextInt(360);

			rob.setX(x);
			rob.setY(y);
			rob.setAngle(angle);
			rob.setRandomPenColor();

			for(int j = 0; j < numSides; j++) {
				rob.move(dist);
				rob.turn(degrees);
			}
		}
		rob.hide();
	}

	static boolean canMakeShape(int numSides) {
		if(numSides >= 3) {
			return true;
		}
		return false;
	}

	static String notEnoughSides() {
		return "I'm sorry we cannot make a shape with that many sides\n"
				+ "Please enter a number greater than 2";
	}
}
