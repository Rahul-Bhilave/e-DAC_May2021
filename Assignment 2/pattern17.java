class pattern17

{
	public static final int k=1;
	public static void main(String args[])
	{
			
			for(int r=1;r<=5;r++)//loop for creating rows
			{
				
				for(int s=1;s<=r;s++)//loop for printing actual numbers
				{
					System.out.print(k+" ");
				}
				k++;
				System.out.println();
			}
		
	}
}