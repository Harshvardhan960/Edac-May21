import java.util.*;
class OctalConversion
{
		public static void main(String[]args)
		{
			System.out.println("----------Binary Conversion------------");
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Any Number");
			int num = sc.nextInt();
			
			int oct[]=new int[100];
			while(num>0)
			{
				oct[1]=num%8;
				num=num/8;
			}
			for(int i=oct[1];i>=0;i--)
			{
				System.out.print(oct[i]);
				
			}
			
			
		}
			
			
		
}
