package basicPgm;

import java.util.Scanner;

public class SimpleIntrestScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Simple=(p*r*t)/100
		
		int p,r,t;
		float S;
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter value of p");
		p=in.nextInt();
		System.out.println("Enter value of r");
		r=in.nextInt();
		System.out.println("Enter value of t");
		t=in.nextInt();
		
		S=(p*r*t)/100;
		
		System.out.println("SimpleInterst S="+S);
	}

}
