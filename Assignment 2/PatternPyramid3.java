class PatternPyramid3
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
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}
/*
C:\Users\LENOVO\Desktop\e-DAC\Module 0-Preparatory\Assignment 2>java PatternPyramid3
        *
       * *
      * * *
     * * * *
    * * * * *
   * * * * * *
  * * * * * * *
 * * * * * * * *
* * * * * * * * *

*/