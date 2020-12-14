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
		orderController.createOrder();
	}
	
	private static void addProduct() {
		int barcode = TextInput.inputNumber("Stregkode på produkt: ");
		int quantity = TextInput.inputNumber("Intast mængde på produkt: ");
		orderController.addProduct(barcode, quantity);
	}
	
	private static void findCustomer() {
		int id = TextInput.inputNumber("ID på kunde: ");
		orderController.findCustomerByID(id);
	}
	
	private static void endOrder() {
		orderController.endOrder();
	}

}
