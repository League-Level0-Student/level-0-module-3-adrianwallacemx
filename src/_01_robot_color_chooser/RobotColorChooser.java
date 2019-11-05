//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
	for (int i = 0; i < 4; i++) {	//1. Create a new Robot
		Robot adrian=new Robot();
		//3. Ask the user what color they would like the robot to draw
		
		String color= JOptionPane.showInputDialog("what color do you want the robot to draw choose red,blue or green");
		//5. Use an if/else statement to set the pen color that the user requested
if (color.equals("red")) {
	adrian.setPenColor(Color.RED);
}
else if (color.equals("blue")) {
	adrian.setPenColor(Color.BLUE);
	
}
else if (color.equals("green")) {
	adrian.setPenColor(Color.GREEN);
	
}
        //6. If the user doesn’t enter anything, choose a random color
else {
	adrian.setRandomPenColor();
}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
			
		
		//4. Set the pen width to 10
		adrian.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
		adrian.setSpeed(1000);
		adrian.penDown();
		for (int i = 0; i < 4; i++) {
			adrian.move(100);
adrian.turn(90);
		}


	}
}
}