package basicPgm;

import java.util.Scanner;

public class AreCircleScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		int r;
		float A,pi;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value of r");
		r=s.nextInt();
		System.out.println("Enter value of pi");
		pi=s.nextFloat();
		 
		 
			A=pi*r*r;
		 System.out.println("Area of Circle="+A);
	}

}

//Simple=(p*r*t)/100
