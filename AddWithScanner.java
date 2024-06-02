package basicPgm;

import java.util.Scanner;

public class AddWithScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a,b,c;
 Scanner s=new Scanner(System.in);
 System.out.println("Enter value of a");
 a=s.nextInt();
 System.out.println("Enter value of b");
 b=s.nextInt();
 
 c=a+b;
 System.out.println("Addition C="+c);
	}

}
 