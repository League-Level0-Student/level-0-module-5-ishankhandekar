package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class Prime_or_not {
 public static void main(String[] args) {
	String prime = JOptionPane.showInputDialog("Enter a number. I will tell you if it is prime or not.");
	int prime2 = Integer.parseInt(prime);
	for (int i = 2; i < prime2; i++) {
		prime2 = prime2 / 2;
		if (prime2 % i == 0) {
			JOptionPane.showMessageDialog(null, "This is not prime");
		}else if (prime2 % i != 0 && i == prime2) {
			JOptionPane.showMessageDialog(null, "This is prime");
		}
	}
}
}
