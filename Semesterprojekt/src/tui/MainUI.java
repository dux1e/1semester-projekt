package tui;
import java.util.Scanner;

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
				SaleUI.start();
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
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		System.out.println("****** Hovedmenu ******");
		System.out.println(" (1) Salgsmenu");
		System.out.println(" (0) Afslut programmet");
		System.out.print("\n Vælg: ");
		while(!keyboard.hasNextLine()) {
			System.out.println("Input");
			keyboard.nextLine();
		}
		int choice = keyboard.nextInt();
		return choice;
	}

}
