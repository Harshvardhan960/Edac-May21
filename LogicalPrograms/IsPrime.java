import java.util.*;
class IsPrime
{
		public static void main(String[]args)
		{
			System.out.println("----------Prime Or Not Prime------------");
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Any Number");
			int num = sc.nextInt();
			int flag=0;
			if(num==0||num==1)
			{
				System.out.println("Not Prime");
			}
			else
			{
				for(int i=num;i<=num/2;i++)
				{
					if(i==0)
					{
						System.out.println(num+" IS NOT PRIME");
						 flag=1;
						break;
					}
					
				}
				if(flag==0)
					{
						System.out.println(num+" IS PRIME");
					}
					
			}
		}

}
