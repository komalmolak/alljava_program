package basicPgm;
import java.util.Scanner;
public class matrix {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int n;
	Scanner s=new Scanner(System.in);
	
	System.out.println("give value for n");
	n=s.nextInt();
				for (int i=1;i<=n;i++)//Column
				{
					for(int j=1;j<=n;j++)//row
					{
						System.out.print("*");
							}
						System.out.println();
					}
				}
			}