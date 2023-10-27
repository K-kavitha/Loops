package Loops;

import java.util.Scanner;

public class DigitSplitNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();//123
		int digit=0;
		while(n!=0)//123 12!=0 1!=0
		{
			digit=n%10;//digit=123%10=3  12%10=2 1%10=1
			System.out.println(digit);//3 2 1
			n=n/10;//123/10=12 12/10=1 1/10=
			
		}
		///////////////////DoWhile//////////////////
	;
		System.out.println("enter the number");
		int n1=sc.nextInt();//123
		int digit1=0;
		do
		{
			digit1=n1%10;//digit=123%10=3  12%10=2 1%10=1
			System.out.println(digit);//3 2 1
			n1=n1/10;//123/10=12 12/10=1 1/10=
			
		}
		while(n1!=0);//123 12!=0 1!=0
		/////////////////////////ForLoop/////////////////
		System.out.println("enter the number");
		int n2=sc.nextInt();//123
		int digit2=0;
		for(;n2!=0;)
		{
			digit2=n2%10;//digit=123%10=3  12%10=2 1%10=1
			System.out.println(digit2);//3 2 1
			n2=n2/10;//123/10=12 12/10=1 1/10=
			
		}
	}

}
