package basicPgm;

import java.util.Scanner;

public class ifeleseJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age;
Scanner sc=new Scanner(System.in);
System.out.println("Eneter age");
age = sc.nextInt();
if(age >=18)
{
	System.out.println("Valid age");
}
else
{
	System.out.println("Not Valid age");
}
	}

}
