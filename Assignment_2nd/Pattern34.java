import java.util.Scanner;
class Pattern34
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Any number");
		int num=sc.nextInt();
		
		for(int i=0;i<=num;i++)
		{
			for(int j=num-1;j>=i;j--)
			{
				System.out.print(" "+" ");
			}
			for(int k=1;k<=i;k++)
			{
				
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		
	}
}
