import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class robot {
	static Robot main = new Robot();

	public static void main(String[] args) {
String shape =JOptionPane.showInputDialog("what shape do whant");
	
	if(shape.equals("square")) {
		drawSquare();
	}
	if(shape.equals("circle")) {
			drawSquare();
	}
if(shape.equals("triangle")) {
    drawTriangle();              
	}
	}
	
	static void drawSquare() {
		main.penDown();
		main.setSpeed(20);
		for (int i = 0; i < 4; i++) {
			main.move(275);
			main.turn(90);
		}
	}
	static void drawTriangle() {
		main.penDown();
		main.setSpeed(20);
		for (int i = 0; i < 3; i++) {
			main.move(275);
			main.turn(120);
		}
	}
	static void drawCircle
	() {
		main.penDown();
		main.setSpeed(20);
		for (int i = 0; i < 360; i++) {
			main.move(1);
			main.turn(1);
		}
	}

}
