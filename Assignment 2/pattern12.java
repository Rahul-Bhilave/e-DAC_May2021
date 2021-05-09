class pattern12
{
	public static void main(String args[])
	{
		
		for(int r=1;r<=5;r++) //loop for creating rows
		{
			for(int s=5;s>r;s--)//loop for printing spaces
			{
				System.out.print(" ");
			}
			for(int s=1;s<=r;s++)
			{
				System.out.print(r+" ");
			}
			System.out.println();
		}
	}
}
/*
C:\Users\LENOVO\Desktop\e-DAC\Foundation\Assignment 2>java pattern12
    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5
*/