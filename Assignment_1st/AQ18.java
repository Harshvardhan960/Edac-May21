import java.util.*;
class AQ18
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Decimal Number");
		int num = sc.nextInt();
		
		int rem;
		String oct ="";
		
		char octalchars[]={'0','1','2','3','4','5','6','7'};
		
		while(num>0)
		{
			 rem=num%8;   
			oct=octalchars[rem]+oct;   
			num=num/8; 
			
			
		}
		System.out.println("Dcimal to Octal is :"+ oct);
	}
}