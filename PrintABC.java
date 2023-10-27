package Loops;

public class PrintABC {

	public static void main(String[] args) {
		for (char row = 'A'; row <= 'C'; row++) {
            for (char col = 'A'; col <= 'C'; col++) {
                System.out.print(col);
            }
            System.out.println();
		}

	}

}
