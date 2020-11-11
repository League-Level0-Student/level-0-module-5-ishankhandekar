package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
	public static void main(String[] args) {

		SkillPractice skills = new SkillPractice();
		skills.skill1();
		skills.skill2();
		skills.skill3();
		skills.skill4();
		skills.skill5();
	}

	void skill1() {
// Use pop-ups for the following.
// Ask the user how many dimes they have
		String dimes = JOptionPane.showInputDialog("how many dimes do you have?");

// Tell them how many cents they have (hint multiply by 10)
		int dimes2 = Integer.parseInt(dimes);
		int dimes3 = dimes2 * 10;
		JOptionPane.showMessageDialog(null, "you have " + dimes3 + " cents");

// Ask the user how tall they are (inches)
		String inches = JOptionPane.showInputDialog("How tall are you in inches?");
		int inches2 = Integer.parseInt(inches);
// If they are shorter than 36 inches, tell them to eat their Wheaties
		if (inches2 < 36) {
			JOptionPane.showMessageDialog(null, "EAT YOUR WHEATIES");
		}

	}

	void skill2() {// Write a loop to print every third number between 1 and 30 to the console

		for (int i = 1; i < 11; i++) {

			System.out.println(3 * i);
		}

	}

	void skill3() {// Write a random number less than 20
		Random randy = new Random();
		int difference =(randy.nextInt(20));
		int difference2 = (randy.nextInt(10));
		System.out.println(randy.nextInt(20));
		System.out.println(randy.nextInt(10));
	}

	void skill4() {// Write a loop to print every third number between 1 and 30 to the console
		
	}

	void skill5() {// Write a loop to print every third number between 1 and 30 to the console
		// In a pop-up, ask the user for the name of their school 
String schoolName = JOptionPane.showInputDialog("what is the name of your school?");


		// In another pop-up, tell the user, that their school is a fantastic school.// You must include the name of the school in the message. 
JOptionPane.showMessageDialog(null, schoolName + " is the best school in the world.");
	}
}