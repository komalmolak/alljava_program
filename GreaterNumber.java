package basicPgm;

import java.util.Scanner;

public class GreaterNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter value of a");
		a = sc.nextInt();
		System.out.println("Eneter value of b");
		b = sc.nextInt();
		if(a>b)
		{
			System.out.println("Greater number");
		}
		else
		{
			System.out.println("Less number");
		}
	}

}
