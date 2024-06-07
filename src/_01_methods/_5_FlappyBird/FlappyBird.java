package _01_methods._5_FlappyBird;

import processing.core.PApplet;
import processing.core.PImage;

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
	int score = 0;
	PImage back;
    PImage pipeBottom;
    PImage pipeTop;
    PImage bird;
	@Override
	public void settings() {
		size(WIDTH, HEIGHT);
	}

	@Override
	public void setup() {
		size(WIDTH, HEIGHT);  
		back = loadImage("flappyBackground.jpg");
		back.resize(WIDTH, HEIGHT);
        pipeBottom = loadImage("bottomPipe.png");
        pipeBottom.resize(50, lowerPipeHeight);
        pipeTop = loadImage("topPipe.png");
        pipeTop.resize(50, upperPipeHeight);
        bird = loadImage("bird.png");
        bird.resize(50,50);
	}

	@Override
	public void draw() {
		background(back);
		pipeX-=1;
		y += birdYVelocity;
		birdYVelocity += gravity;
		image (pipeBottom,pipeX, lowerY);
        image (pipeTop,pipeX, 0);
        image (bird, x, y);
		fill(255, 255, 255);
		stroke(0, 0, 0);
		//ellipse(x, y, 50, 50)
		fill(255, 255, 255);
		//rect(pipeX, 0, 50, upperPipeHeight);
		//rect(pipeX, lowerY, 50, lowerPipeHeight);
		teleportPipes();
		if (intersectsPipes()==true) {
			System.exit(0);
		}
		if (hitGround()==true) {
			System.exit(0);
		}
		if (pipeX == 23) {
			score +=1;
		}
		text("Score: " + score, 0, 0, 255,255);
	}
	boolean intersectsPipes() { 
		if (y < upperPipeHeight && x + 50 > pipeX && x < (pipeX+50)){
			return true; }
		else if (y +30 >lowerY && x + 50 > pipeX && x < (pipeX+50)) {
			return true; }
		else { return false; }
	}
	boolean hitGround() {
		if (y > HEIGHT) {
			return true;}
		else {
			return false;}
		}
	public void teleportPipes() {
		if (pipeX < -50) {
			pipeX = 800;
			upperPipeHeight = (int) random(100, 400);
			lowerPipeHeight = (int) random(650, 700);
			lowerY = upperPipeHeight + pipeGap;
			 pipeBottom.resize(50, lowerPipeHeight);
			 pipeTop.resize(50, upperPipeHeight);
		}
	}
	public void mousePressed() {
		birdYVelocity = -15;
	}
	static public void main(String[] args) {
		PApplet.main(FlappyBird.class.getName());
	}
}