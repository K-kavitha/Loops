package Loops;

import java.util.Scanner;

public class NaturalNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int start=1;
		while(start<=n)
		{
			System.out.println(start);
			start++;
		}
		start++;
	}

}
