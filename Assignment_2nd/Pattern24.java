class Pattern24
{
		public static void main(String[]args)
		{
			int n=5;
			for(int i=1;i<=5;i++)
			{
				
				int k=i-1;
				for(int j=n;j>n-i;j--)
				{
					System.out.print(" "+(j-k));
					k = k-2;
				}
				System.out.println();	
			} 
		}	
}
