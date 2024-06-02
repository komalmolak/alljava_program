package basicPgm;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age,weight;
Scanner sc=new Scanner(System.in);
System.out.println("Age");
age=sc.nextInt();
System.out.println("weight");
weight=sc.nextInt();

if(age>18)
{
	if(weight>55)
	{
		System.out.println("eligible for blood donation");
	}
	else
	{
		System.out.println("not eligible");
	}
}
else
{
	System.out.println("plz enter valid eligible");
}
	}
}
