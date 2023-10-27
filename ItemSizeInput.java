package Loops;

import java.util.Scanner;

public class ItemSizeInput {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        String choice;

	        do {
	            //  the user to enter an item number
	            System.out.print("Enter item number: ");
	            int itemNumber = scanner.nextInt();

	            
	            scanner.nextLine();

	            // the user to enter the item size
	            System.out.print("Enter item size: ");
	            String itemSize = scanner.nextLine();

	            // Display the input
	            System.out.println("Input:");
	            System.out.println("Item Number: " + itemNumber);
	            System.out.println("Item Size: " + itemSize);

	            //  the user to continue
	            System.out.print("Do you want to continue? (yes/no): ");
	            choice = scanner.nextLine();
	        } while (choice.equalsIgnoreCase("yes"));

	     
	        scanner.close();
	}

}
