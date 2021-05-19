import java.util.*;
class AddBinary
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.out);
		
		System.out.println("Enter First Binary number");
		String n1=sc.nextLine();
		System.out.println("Enter First Binary number");
		String n1=sc.nextLine();
		
		int num1=Integer.parseInt(n1,2);
		int num2=Integer.parseInt(n2,2);
		
		int res = num1+num2;
		
		System.out.println(Integer.toBinaryString(res));
	}
}