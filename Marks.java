package basicPgm;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mark;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter marks : ");
		mark = sc.nextInt();
		if (mark<35)
		{
			System.out.print("Fail");	
		}
		else if(mark<=35 && mark<50)
		{
			System.out.print("C Grade");	
		}
		else if (mark>=50 && mark<60 )
		{
			System.out.print("B grade ");	
		}
		else if (mark>=60 && mark<75 )
		{
			System.out.print("A grade ");	
		}
		else if (mark>=75 && mark<100 )
		{
			System.out.print("Disctinction");	
		}
		else
			{
				System.out.print("Plz enter valid mark");	
			}
	}

}
