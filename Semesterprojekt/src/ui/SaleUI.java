package ui;
import java.util.Scanner;
import controller.*;
import model.*; //READ ONLY!!

public class SaleUI {
	private static OrderController orderController;
	
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
		System.out.println(" (1) Opret odre");
		System.out.println(" (2) Tilføj produkt til ordre");
		System.out.println(" (3) Tilføj kunde til ordre");
		System.out.println(" (4) Afslut ordre");
		System.out.println(" (0) Til Hovedmenu");
		System.out.print("\n Vælg");
		while(!keyboard.hasNextInt()) {
			System.out.println("Input skal være et tal - prøv igen");
			keyboard.nextLine();
		}
		int choice = keyboard.nextInt();
		
		return choice;
	}
	
	private static void createSale() {
		orderController.createOrder();
	}
	
	private static void addPoduct() {
		int barcode = TextInput.inputNumber("Stregkode på produkt: ");
		int quantity = TextInput.inputNumber("Intast mængde på produkt");
		
		orderController.addProduct(barcode, quantity);
	}
	
	

}
