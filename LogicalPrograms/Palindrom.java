import java.util.*;
class Palindrom
{
		public static void main(String[]args)
		{
			System.out.println("----------Palindrom------------");
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Any Number");
			int num = sc.nextInt();
			
			int temp=num;
			int a,c=0;
			while(num>0)
			{
				a=num%10;
				c=c*10+a;
				num=num/10;
					
			}
			if(temp==c)
				System.out.println(temp+" Is Palindrom Number");
			else
				System.out.println(temp+" IS Not Palindrom Number");	
		}

}
