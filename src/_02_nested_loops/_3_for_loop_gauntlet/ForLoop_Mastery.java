package _02_nested_loops._3_for_loop_gauntlet;

public class ForLoop_Mastery {
	public static void main(String[] args) {
		System.out.println("For loop from 1 - 10: ");
		for (int i = 0; i < 101; i++) {
			System.out.println(i);
		}
		System.out.println("For loop from 100 - 0:");
		for (int i = 100; i > 0; i--) {
			System.out.println(i);
		}
		System.out.println("For loop  from 2 - 100");
		for (int i = 2; i < 101; i++) {
			System.out.println(i);
		}
		System.out.println("For loop from 1 - 99");
		for (int i = 1; i < 100; i++) {
			System.out.println(i);
		}
		System.out.println("For loop from 1 -500");
		for (int i = 1; i < 501; i++) {
			String answer = i % 2 == 0 ? "Even" : "Odd";
			System.out.println(i + " " + answer);
		}
		System.out.println("For loop to do all multiples of 7 - 777");
		for (int i = 1; i < 111; i++) {
			System.out.println(7 * i);
		}
		int age = 0;
		System.out.println("Print all the years you were alive and how old you were in each");
		for (int i = 2010; i < 2021; i++) {
		 
			if (i == 2010) {
				age = 0;
			} else {
				age += 1;
			}
			System.out.println("In the year " + i + " I was " + age + " years old.");

		}
		System.out.println("  ");
		
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(i + " " + j);
			}

		}

		for (int i = 1; i <= 7; i += 3) {
			System.out.println("");
			for (int j = i;  j <= i + 2; j++) {
				
				System.out.print(j + " ");
			}
		} 
		System.out.println("  ");
		
		for (int i = 1; i <= 91 ; i +=  10) {
			System.out.println("");
			for (int j = i; j <= i + 9; j++) {
				System.out.print(j + " ");
			}
		}
		System.out.println("");
		for (int i = 1; i <= 6; i++) {
			System.out.println("");
			for (int j = 1; j <= i ; j++) {
				System.out.print("*" + " ");
			}
		}
		System.out.println("");
		for (int i = 0; i <= 100; i++) {
			System.out.println(100 - i);
		}
		}
	}

