package ui;
import java.util.Scanner;
import controller.*;

public class MainUI {
	
	public static void start() {
		mainMenu();		
	}
	
	private static void mainMenu() {
		boolean running = true;	
		while(running) {
			int choice = writeMainMenu();
			switch(choice) {
			case 1:
				break;
			case 2:
				break;
			case 0:
				System.out.println("Tak for denne gang.");
				running = false;
				break;
			default:
				System.out.println("Der er sket en uforklarlig fejl, choice = " + choice);
				break;
			}
		}
	}
	
	private static int writeMainMenu() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("****** Hovedmenu ******");
		System.out.println(" (1) Salgsmenu");
		System.out.println(" (2) en anden menu");
		System.out.println(" (0) Afslut programmet");
		System.out.print("\n Vælg:");
		while(!keyboard.hasNextLine()) {
			System.out.println("Input");
			keyboard.nextLine();
		}
		int choice = keyboard.nextInt();
		return choice;
	}

}
