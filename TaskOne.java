package Loops;

public class TaskOne {

	public static void main(String[] args) {
		for(int row = 1; row <= 3; row++) { //1<=3 2<=3 3<=3 4<=3-False
		    for(int col = 1; col <= 3; col++) { //1<=3 2<=3 3<=3 4<=3=f
                								//1<=3 2<=3 3<=3 4<=3=f
                								//1<=3 2<=3 3<=3 4<=3=f
		        System.out.print(col); //123 
		        						//123
		        						//123
		    }
		    System.out.println(); // Move to the next line after each row
		}
	}

}
