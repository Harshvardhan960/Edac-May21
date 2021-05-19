import java.util.*;
class Armstrong
{
		public static void main(String[]args)
		{
			System.out.println("----------Armstron------------");
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Any Number");
			int num = sc.nextInt();
			
			int temp=num;
			int a,c=0;
			while(num>0)
			{
				a=num%10;
				num=num/10;
				c=c+(a*a*a);	
			}
			if(temp==c)
				System.out.println(temp+" Is Armstrong Number");
			else
				System.out.println(temp+"IS Not Armstrong Number");	
		}

}
