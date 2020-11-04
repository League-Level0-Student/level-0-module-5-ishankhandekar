package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class Prime_or_not {
	public static void main(String[] args) {
		

		int yes = 0;
		while (yes == 0) {
			primeOrNot();
			yes = JOptionPane.showConfirmDialog(null, "do you want to put in another number?");
		}

	}
//	prime2 = prime2 / 2;
	public static void primeOrNot() {
		String prime = JOptionPane.showInputDialog("Enter a number. I will tell you if it is prime or not.");
		long prime2 = Integer.parseInt(prime);
			for (int i = 2; i < prime2; i++) {

				if (prime2 % i == 0) {
					//not prime
					JOptionPane.showMessageDialog(null, prime2 + " is not prime. " + prime2 + " = " + i + " x " + prime2/i + ".");
					return;
				} 
			}JOptionPane.showMessageDialog(null, prime2 + " is prime.");
		
	}

	}

