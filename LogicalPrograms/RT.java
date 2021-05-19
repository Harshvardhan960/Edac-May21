import java.util.Scanner;
class RT
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many row you want");
		int row = sc.nextInt();
		System.out.println("Enter how many col you want");
		int col = sc.nextInt();
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=row;k>=i;k--)
			{
				System.out.print(k);
			}
			for(int j=row;j>i;j--)
			{
				System.out.print(j);
			}
			System.out.println();	
		}
		
	}
}

//*