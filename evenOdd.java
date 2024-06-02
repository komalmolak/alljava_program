package basicPgm;

import java.util.Scanner;

public class evenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter value of num");
		num = sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println("Even number");	
	}
		else
		{
			System.out.println("odd number");
		}
}
}