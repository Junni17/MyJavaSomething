package model;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner derp = new Scanner(System.in);
		System.out.println("Input integer: ");
		int c = derp.nextInt();
		String adjacent_dublicates = "Adjacent dublicates: ";
		int previous_number = c;


		while (c != 0) {
			System.out.println("Input integer: ");
			c = derp.nextInt();
	
			if (c == previous_number && !adjacent_dublicates.contains(Integer.toString(previous_number))) {
				adjacent_dublicates += String.valueOf(previous_number);
			}
			previous_number = c;

		}

		System.out.println(adjacent_dublicates);
		derp.close();
	}

}
