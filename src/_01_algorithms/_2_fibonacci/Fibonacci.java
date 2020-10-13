package _01_algorithms._2_fibonacci;

public class Fibonacci {
	public static void main(String[] args) {
		int array[] = { 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		String fabonacci = "";
		for (int i = 2; i < array.length; i++) {
			int var = array[i - 1];
			int var2 = array[i - 2];
			array[i] = var + var2;
		}

		for (int i = 0; i < array.length; i++) {
			fabonacci += " ," + array[i];
		}
		System.out.println(fabonacci);
	}

}
