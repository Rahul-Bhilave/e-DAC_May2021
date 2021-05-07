class pattern10
{
	public static void main(String args[])
	{
		int t=70;
		for(int i=1;i<=5;i++)// loop for rows
		{
			for(int j=4;j>=i;j--) // loop for spaces
			{
			System.out.print(" ");
			}
				for(int k=1;k<=i;k++)  //loop for printing numbers
				{
					
					System.out.print((char)(t-k)+" ");
				}
					System.out.println();
		}
	}
}
/*
C:\Users\LENOVO\Desktop\e-DAC\Foundation\Assignment 2>java pattern10
    E
   E D
  E D C
 E D C B
E D C B A
*/