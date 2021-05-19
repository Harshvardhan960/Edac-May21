import java.util.*;
class Fact
{
		public static void main(String[]args)
		{
			System.out.println("----------Factorial------------");
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Any Number");
			int num = sc.nextInt();
			
			int fact=1;
			if(num==0||num==1)
			{
				System.out.println("1");
			}
			
			for(int i=1;i<=num;i++)
			{
				fact=fact*i;
				
			}
			System.out.println("Factorial of number is :"+fact);
			
		}

}
