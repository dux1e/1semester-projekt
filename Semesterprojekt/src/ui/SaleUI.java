package ui;
import java.util.Scanner;
import controller.*;
import model.*; //READ ONLY!!
import java.util.*;

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
		printOrder();
		Scanner keyboard = new Scanner(System.in);
		Order currentOrder = orderController.getCurrentOrder();
		if(currentOrder == null) {
			System.out.println(" (1) Opret ordre");
		}
		if(currentOrder != null) {
			System.out.println(" (2) Tilføj produkt til ordre");
			System.out.println(" (3) Find kunde til ordre");
			if(currentOrder.getCustomer() != null && currentOrder.getOrderLines().size() > 0) {
				System.out.println(" (4) Afslut ordre");
			}
		}
		System.out.println(" (0) Til Hovedmenu");
		System.out.print("\n Vælg: ");
		while(!keyboard.hasNextInt()) {
			System.out.println("Input skal være et tal - prøv igen");
			keyboard.nextLine();
		}
		int choice = keyboard.nextInt();
		
		return choice;
	}
	
	private static void printOrder() {
		Order currentOrder = orderController.getCurrentOrder();
		if(currentOrder != null) {
			List<OrderLine> orderLines = currentOrder.getOrderLines();
			Customer c = currentOrder.getCustomer();
			String cID = "";
			if(c != null) {
				cID += c.getID();
			}
			
			System.out.println("##############################");
			System.out.println("       Ordre oplysninger");
			System.out.println("##############################");
			System.out.println("Kunde ID: " + cID);
			System.out.println("Ordre linjer: " );
			for(OrderLine ol : orderLines) {
				Product p = ol.getProduct();
				System.out.println("   " + ol.getQuantity() + " x " + p.getDescription() + "(" + p.getPrice() + ")" + "\t" + ol.getSubTotal());
			}
			System.out.println("Subtotal (ekskl. Moms): " + currentOrder.getNetTotal());
			System.out.println("                  Moms: " + currentOrder.getVatTotal());
			System.out.println("                 I alt: " + (currentOrder.getNetTotal() + currentOrder.getVatTotal()));
			System.out.println("##############################");
		}
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
