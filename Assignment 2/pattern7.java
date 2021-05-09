class pattern7
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)// loop for rows
		{
			for(int j=4;j>=i;j--) // loop for spaces
			{
			System.out.print(" ");
			}
				for(int k=1;k<=i;k++)  //loop for printing numbers
				{
					System.out.print(k+" ");
				}
					System.out.println();
		}
	}
}

/*C:\Users\LENOVO\Desktop\e-DAC\Foundation\Assignment 2>java pattern7
    1
   1 2
  1 2 3
 1 2 3 4
1 2 3 4 5
*/