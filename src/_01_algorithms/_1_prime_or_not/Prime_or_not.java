package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class Prime_or_not {
	public static void main(String[] args) {
		String prime = JOptionPane.showInputDialog("Enter a number. I will tell you if it is prime or not.");
		long prime2 = Integer.parseInt(prime);}

//	prime2 = prime2 / 2;
	static int[] factors(long prime2) {
		for (int j = 0; j < prime2; j++) {
			for (int i = 2; i < prime2; i++) {

				if (prime2 % i == 0) {
					//not prime
					continue;
				} else {
					//is prime
					
				}
			}}
		return null;
		}

	}

