class PatternPyramid1
{
	public static void main(String args[])
	{
		for(int r=1;r<=9;r++)
		{
			for(int s=8;s>=r;s--)
			{
				System.out.print(" ");
			}
			for(int n=1;n<=r;n++)
			{
				System.out.print(r+" ");
			}
			System.out.println();
		}
	}
}
/*
C:\Users\LENOVO\Desktop\e-DAC\Module 0-Preparatory\Assignment 2>java PatternPyramid1
        1
       2 2
      3 3 3
     4 4 4 4
    5 5 5 5 5
   6 6 6 6 6 6
  7 7 7 7 7 7 7
 8 8 8 8 8 8 8 8
9 9 9 9 9 9 9 9 9

*/