import java.util.*;
class OctaltoDecimal
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any octal number");
		String num1 = sc.nextLine();
		
		int rem;
		
		String Dec = "";
		
		int decimal = Integer.parseInt(num1,8);
		
		System.out.println("Octal to Decimal is :"+num1);
	}
}