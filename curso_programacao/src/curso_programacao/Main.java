package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

import entities.Products;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Products product = new Products();
				
		System.out.println("Enter Product Data ");
		System.out.print("Name : ");
		product.name = sc.nextLine();
		System.out.print("Price : "); 
		product.price = sc.nextDouble();
		System.out.print("Quantity in stock : ");
		product.quantity = sc.nextInt();
		
		System.out.println("Product data: " + product);	
		
		System.out.println();
		
		System.out.println("Do you want to ADD itens on stock?");
		char answer = sc.next().charAt(0);
		
		int quantity;
		
		if(answer == 's' || answer == 'S') {
			System.out.println();
			System.out.println("Enter the number of products to be added on stock");
			quantity = sc.nextInt();
			product.addProducts(quantity);
			System.out.println("Updated data: " + product);
		}
		else {
			System.out.println("No itens added to stock");
		}
		
		System.out.println("Do you want to REMOVE itens from stock?");
		char answer2 = sc.next().charAt(0);
		if(answer2 == 's' || answer2 == 'S') {
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println("Updated data: " + product);
		}
		else {
			System.out.println("No itens removed from stock");
		}
		System.out.println();
		
		System.out.println("End of the programm");
		
		sc.close();	
	}

}
