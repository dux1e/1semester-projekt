package ui;
import java.util.Scanner;
import controller.*;
import model.*; //READ ONLY!!

public class SaleUI {
	private OrderController orderController;
	
	public SaleUI(){
		orderController = new OrderController();
	}
	
	public static void start() {
		boolean running = true;
		while(running) {
			int choice = writeSaleUI();
			switch(choice) {
			case 1:
				break;
			}
		}
	}
	
	private static int writeSaleUI() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println(" (1) Opret salg");
		System.out.println(" (0) Til Hovedmenu");
		System.out.print("\n Vælg");
		while(!keyboard.hasNextInt()) {
			System.out.println("Input skal være et tal - prøv igen");
			keyboard.nextLine();
		}
		int choice = keyboard.nextInt();
		
		return choice;
	}

}
