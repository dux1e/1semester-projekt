package ui;

import java.util.Scanner;

/**
 * This class is designed for text input in the main UI
 * 
 * @auther Joakim Christensen
 * @version 1.0
 */
public class TextInput {
	public TextInput() {
		
	}
	
	public static int inputNumber(String question) {
		Scanner keyboard = new Scanner(System.in);
		int number = 0;
		printQuestion(question);
		while(!keyboard.hasNextInt()) {
			System.out.println("Input skal være et tal - prøv igen");
			keyboard.nextLine();
		}
		number = keyboard.nextInt();
		return number;
	}
	
	public static double inputDouble(String question) {
		Scanner keyboard = new Scanner(System.in);
		double number = 0;
		printQuestion(question);
		while(!keyboard.hasNextDouble()) {
			System.out.println("Input skal være et tal - prøv igen");
			keyboard.nextLine();
		}
		number = keyboard.nextDouble();
		return number;
	}
	
	public static String inoutString(String question) {
		Scanner keyboard = new Scanner(System.in);
		printQuestion(question);
		return keyboard.nextLine();
	}
	
	public static void printQuestion(String question) {
		System.out.println(" " + question + ": ");
	}
	
}
