package _01_methods._5_FlappyBird;

import processing.core.PApplet;

public class FlappyBird extends PApplet {
	static final int WIDTH = 800;
	static final int HEIGHT = 600;
	int y = 50;
	int x = 100;
	int pipeX = 500;
	int birdYVelocity = -10;
	int gravity = 1;
	int upperPipeHeight = (int) random(100, 400);
	int lowerPipeHeight = (int) random(650, 700);
	int pipeGap = 250;
	int lowerY = upperPipeHeight + pipeGap;
	@Override
	public void settings() {
		size(WIDTH, HEIGHT);
	}

	@Override
	public void setup() {
		size(WIDTH, HEIGHT);  
	}

	@Override
	public void draw() {
		background(0, 0, 0);
		fill(255, 255, 255);
		stroke(0, 0, 0);
		ellipse(x, y, 50, 50);
		y += birdYVelocity;
		birdYVelocity += gravity;
		fill(255, 255, 255);
		rect(pipeX, 0, 50, upperPipeHeight);
		rect(pipeX, lowerY, 50, lowerPipeHeight);
		pipeX-=2;
		teleportPipes();
		
	}
	boolean intersectsPipes() { 
        if (y < upperPipeHeight && x > pipeX && x < (pipeX+50)){
           return true; }
       else if (y>lowerPipeHeight && x > pipeX && x < (pipeX+50)) {
           return true; }
       else { return false; }
}
	public void teleportPipes() {
		if (pipeX == -50) {
			pipeX = 800;
		}
	}
	public void mousePressed() {
		birdYVelocity = -15;
	}
	static public void main(String[] args) {
		PApplet.main(FlappyBird.class.getName());
	}
}