import java.util.*;
class AQ6
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Value");
		int num1 = sc.nextInt();
		System.out.println("Enter Second Value");
		int num2 = sc.nextInt();
		
		int res1 = num1+num2;
		System.out.println(num1 + "+" +num2 + "="+ res1);
		
		int res2 = num1-num2;
		System.out.println(num1 + "-" +num2 + "="+ res2);
		
		int res3 = num1*num2;
		System.out.println(num1 + "*" +num2 + "="+ res3);
		
		int res4 = num1/num2;
		System.out.println(num1 + "/" +num2 + "="+ res4);
		
		int res5 = num1%num2;
		System.out.println(num1 + "%" +num2 + "="+ res5);

		
	}
}