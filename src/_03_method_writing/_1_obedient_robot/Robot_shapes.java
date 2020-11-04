package _03_method_writing._1_obedient_robot;



import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Robot_shapes {
public static void main(String[] args) {
	String options[] = {"square", "triangle", "circle "};
	int shapes = JOptionPane.showOptionDialog(null, "What shape do you want to draw", 
			  "robot shapes", JOptionPane.INFORMATION_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, options, 0 );
	if (shapes == 0) {
		drawSquares();
	}else if(shapes == 1) {
		drawTriangle();
	}else if(shapes == 2) {
		drawCircle();
	}
} public static void drawSquares() {
	Robot rob = new Robot("mini");
	rob.setSpeed(100);
	rob.penDown();
	for (int i = 1; i <= 4; i++) {
	rob.move(20);
	rob.turn(90);
	
} } public static void drawCircle() {
	Robot rob = new Robot("mini");
	rob.setY(600);
	rob.setSpeed(2000);
	rob.penDown();
	for (int i = 1; i <= 360; i++) {
		rob.turn(1);
		rob.move(10);
	}
}public static void drawTriangle( ) {
	
	Robot rob = new Robot("mini");
	rob.setSpeed(100);
	rob.penDown();
	for (int i = 0; i < 3; i++) {
		rob.turn(120);
		rob.move(20);
	}
};
}
