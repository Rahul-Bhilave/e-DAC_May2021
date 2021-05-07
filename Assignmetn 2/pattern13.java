class pattern13
{
	public static void main(String args[])
	{
		int d=65;
		for(int r=1;r<=5;r++)//loop for creating rows
		{
			for(int s=4;s>=r;s--)
			{
				System.out.print(" ");
			}
				
			for(int t=1;t<=r;t++)//loop for printing *
			{
				System.out.print((char)(d)+" ");
			}
			d++;
				System.out.println();
		}
	}
}
/*
C:\Users\LENOVO\Desktop\e-DAC\Foundation\Assignment 2>java pattern13
    A
   B B
  C C C
 D D D D
E E E E E
*/