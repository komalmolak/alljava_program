package basicPgm;

import java.util.Scanner;

public class OlderAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age;
Scanner sc=new Scanner(System.in);
System.out.println("Age");
age=sc.nextInt();
if((age<=7)&&(age!=0))
{
	System.out.println("You are child");
}
else if ((age>7)&&(age<=17))
{
	System.out.println("You are Yonger");
}
else if ((age>17)&&(age<=50))
{
	System.out.println("You are Yelder");
}
else if((age>50)&&(age<=100))
{
	System.out.println("You are Senior");
}
else
{
	System.out.println("please enter valid age");
}
	}

}
