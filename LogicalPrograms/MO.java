import java.util.Scanner;
class MO
{
	int a;
	float b;
	public float M1()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Integer value first : ");
		int num1 = sc.nextInt();
		System.out.println("Enter Float Value for M1 :");
		float num2=sc.nextFloat();
		
		
		float sum1 = (float)num1 + num2;
		
		return sum1;
	
	}
	public float  M2()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Float value first : ");
		float num3 = sc.nextFloat();
		System.out.println("Enter Integer Value for M1 :");
		int num4=sc.nextInt();	
		
		
		float sum2 = num3 + (float)num4;
		
		return sum2;
	}
	
	public static void main(String[]args)
	{
		
		MO obj = new MO();
		
		float v =obj.M1();
		
		System.out.println("ADDITION IS \n"+v);
		
		float o =obj.M2();
		System.out.println("ADDITION IS \n"+o);
		
	}
}