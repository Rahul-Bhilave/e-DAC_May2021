class PatternPyramid2
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
				System.out.print(n+" ");
			}
			System.out.println();
		}
	}
}

/*
C:\Users\LENOVO\Desktop\e-DAC\Module 0-Preparatory\Assignment 2>java PatternPyramid2
        1
       1 2
      1 2 3
     1 2 3 4
    1 2 3 4 5
   1 2 3 4 5 6
  1 2 3 4 5 6 7
 1 2 3 4 5 6 7 8
1 2 3 4 5 6 7 8 9

*/
