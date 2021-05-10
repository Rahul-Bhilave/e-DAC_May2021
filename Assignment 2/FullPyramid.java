class FullPyramid
{
	public static void main(String args[])
	{
		for(int r=1;r<=6;r++)
		{
			for(int s=6;s>=r;s--)
			{
				System.out.print("  ");
			}
			for(int st=1;st<=r;st++)
			{
				System.out.print(" *  ");
			}
			System.out.println();
		}
	}
}
/*
C:\Users\LENOVO\Desktop\e-DAC\Module 0-Preparatory\Assignment 2>java FullPyramid
             *
           *   *
         *   *   *
       *   *   *   *
     *   *   *   *   *
   *   *   *   *   *   *
   
   
 */ 