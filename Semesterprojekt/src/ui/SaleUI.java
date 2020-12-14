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
		new SaleUI();
		boolean running = true;
		while(running) {
			int choice = writeSaleUI();
			switch(choice) {
			case 1:
				createOrder();
				break;
			case 2:
				addProduct();
				break;
			case 3:
				findCustomer();
				break;
			case 4:
				endOrder();
				break;
			case 0:
				System.out.println("Tilbage til hovedmenu");
				running = false;
				break;
			default:
				System.out.println("Der er sket en uforklarlig fejl, choice = " + choice);
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
		System.out.print("\n Vælg: ");
		while(!keyboard.hasNextInt()) {
			System.out.println("Input skal være et tal - prøv igen");
			keyboard.nextLine();
		}
		int choice = keyboard.nextInt();
		
		return choice;
	}
	
	private static void createOrder() {
		try{
			orderController.createOrder();
		}
		catch(IllegalStateException e) {
			System.out.println(e.toString());
		}
	}
	
	private static void addProduct() {
		try{
			int barcode = TextInput.inputNumber("Stregkode på produkt: ");
			int quantity = TextInput.inputNumber("Intast mængde på produkt: ");
			orderController.addProduct(barcode, quantity);
		}
		catch(IllegalStateException | NullPointerException e) {
			System.out.println(e.toString());
		}
	}
	
	private static void findCustomer() {
		try{
			int id = TextInput.inputNumber("ID på kunde: ");
			orderController.findCustomerByID(id);
		} 
		catch(IllegalStateException | NullPointerException e) {
			System.out.println(e.toString());
		}
	}
	
	private static void endOrder() {
		try{
			orderController.endOrder();
		}
		catch(IllegalStateException e) {
			System.out.println(e.toString());
		}
	}

}
