package basicPgm;

import java.util.Scanner;

public class ladderif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num;
Scanner sc=new Scanner(System.in);
System.out.println("Num");
num=sc.nextInt();
if(num>0)
{
	System.out.println("+ve");
}
else if(num<0)
{
	System.out.println("-ve");
}
else
{
	System.out.println("Zero");
}
	}

}
