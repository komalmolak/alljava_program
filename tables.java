package basicPgm;

import java.util.Scanner;

public class tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,t;
		System.out.println("Enter number for table");
		Scanner sc=new Scanner(System.in);
		i= sc.nextInt();
		//t=sc.nextInt();
		for(int j=1;i<=10;j++)
		{
			i=i*j;
			System.out.println(i);
		}
	}

}
