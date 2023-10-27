package Loops;

import java.util.Scanner;

public class CountEvenOdd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int number = s.nextInt();//5
		int start =1;
		int EVENCOUNT = 0;
		int oddcount = 0;
		while(start<=number)
		{
			if(start%2==0)//3%2==0 
			{
				EVENCOUNT++;//2
				
			}
			else
			{
				oddcount++;//3
			}
			start++;//2,3,4,5
		}
		System.out.println("Even count: " + EVENCOUNT);
		System.out.println("Odd Count : " + oddcount);

	}

}
