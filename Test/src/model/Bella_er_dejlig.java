package model;

import java.util.Scanner;

public class Bella_er_dejlig {

	public static void main(String[] args) {

		
		char ch = ' ';
		ch = 'm';
		
		int sum = 0;
		
		Scanner in = new Scanner(System.in);
		
		String derp = in.nextLine();
		for (int i = 0; i < derp.length(); i++){
			if (derp.charAt(i) == ch){
				sum++;
			}
			
		}
		
		System.out.println(ch + " was used "+ sum + " time(s)");
		
		
				in.close();
			
	}
}