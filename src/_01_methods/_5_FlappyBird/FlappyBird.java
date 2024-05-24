package _01_methods._5_FlappyBird;

import processing.core.PApplet;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int y = 50;
    int x = 100;
    int birdYVelocity = -15;
    int gravity = 1;
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
    }
    public void mousePressed() {
    		birdYVelocity = -15;
    }
    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
