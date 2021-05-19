import java.util.*;
class AQ12
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number");
		int n1 = sc.nextInt();
		System.out.println("Enter Second Number");
		int n2 = sc.nextInt();
		System.out.println("Enter Third Number");
		int n3 = sc.nextInt();
		
		int sum = n1+n2+n3;
		int average = sum/3;
		System.out.println("Average of "+n1+" "+n2+" "+n3+"="+average);
		
		
	}
}