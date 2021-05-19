import java.util.*;
class BinaryConversion
{
		public static void main(String[]args)
		{
			System.out.println("----------Binary Conversion------------");
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Any Number");
			int num = sc.nextInt();
			
			int binary[]=new int[20];
			int index=0;
			while(num>0)
			{
				binary[index]=num%2;
				num=num/2;
					
			}
			for(int i=index;i>=0;i--)
			{
				System.out.print(binary[i]);
			}
		}

}
