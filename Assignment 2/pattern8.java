class pattern8
{
	public static void main(String args[])
	{
		int t=6;
		for(int i=1;i<=5;i++)// loop for rows
		{
			for(int j=4;j>=i;j--) // loop for spaces
			{
			System.out.print(" ");
			}
				for(int k=1;k<=i;k++)  //loop for printing numbers
				{
					
					System.out.print(6-k+" ");
				}
					System.out.println();
		}
	}
}

/*C:\Users\LENOVO\Desktop\e-DAC\Foundation\Assignment 2>java pattern8
    5
   5 4
  5 4 3
 5 4 3 2
5 4 3 2 1
*/