package basicPgm;

public class oneToTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		for (int i=1;i<=4;i++)//Column
		{
			
			for(int j=1;j<=i;j++)//row
			{
			
				System.out.print(a+" ");
				a=a+1;
					}
				System.out.println();
			}
	}

}
