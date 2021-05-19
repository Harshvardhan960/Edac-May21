import java.util.*;
class EvenOdd
{
		public static void main(String[]args)
		{
			System.out.println("----------Even Odd------------");
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Any Number");
			int num = sc.nextInt();
			
			if(num%2==0)
			{
				System.out.println(num+" Number is Even");
			}
			else
				System.out.println(num+" Number is Odd");
		}

}
