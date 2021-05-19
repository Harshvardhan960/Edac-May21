class Pattern28
{
		public static void main(String[]args)
		{
			int c=10;
			for(int i=1;i<10;i++)
			{
				for(int j=10; j>i;j--)
				{
					System.out.print("  ");
					
				}
				for(int k=1;k<i; k++)
				{
					System.out.print(" "+ (c-k));
				}
			 	for(int l=1;l<=i;l++){
					System.out.print(" "+(c-l));
				}
					
				System.out.println();	
			} 
		}	

}
