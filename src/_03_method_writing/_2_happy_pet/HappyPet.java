package _03_method_writing._2_happy_pet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	static int happinessLevel= 0;
	// this will be used to store the happiness of your pet
	 static boolean trueFalse = false;
	 Thread thread;
	void code() {String pet = JOptionPane.showInputDialog("What kind of pet do you want to buy?");
	// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
	
	// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
	//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
	//    Make sure to customize the title and question too.
	thread = new Thread(()->{Timer time = new Timer(60000000,(e)-> {HappyPet.setTrueFalse();});
	time.start();
	System.out.println("timer started");
	}); 
	thread.start();
	
	
	while (trueFalse == true) {
		
	int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy?", "Happy Pet", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] {"cuddle", "food", "water", "take a walk", "groom", "clean up poop"}, null);
	if (task == 0) {
		cuddle();
	}if (task == 1) {
		food();
	}if (task == 2) {
		water();
	}if (task == 3) {
		takeWalk();
	}if (task == 4) {
		groom();
	}if (task == 5) {
		cleanPoop();
	} if (happinessLevel == 25) {
		trueFalse = true;
	}}
}
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
	
		HappyPet happyPet = new HappyPet();
		happyPet.code();

	}

	// 4. Create methods to handle each of your user selections.
	public static void cuddle() {
		JOptionPane.showMessageDialog(null, "mrow");
		happinessLevel = happinessLevel + 4;
	}public static void food() {
		JOptionPane.showMessageDialog(null, "mmmmm");
		happinessLevel = happinessLevel + 5;
	}public static void water() {
		JOptionPane.showMessageDialog(null, "shhhhhhhhhhoooooooop");
		happinessLevel = happinessLevel + 4;
	}public static void takeWalk() {
		JOptionPane.showMessageDialog(null, "meow");
		happinessLevel = happinessLevel + 2;
	}public static void groom() {
		JOptionPane.showMessageDialog(null, "ahhh");
		happinessLevel = happinessLevel + 3;
	}public static void cleanPoop() {
		JOptionPane.showMessageDialog(null, "(watches you)");
				happinessLevel = happinessLevel + 1;
	}
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.

	static void setTrueFalse() {
		trueFalse = false;
		System.out.println("timer over");
	}
	
}