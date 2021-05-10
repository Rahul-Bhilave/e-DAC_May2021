class PatternStar10
{
	public static void main(String args[])
	{
		for(int r=1;r<=5;r++)
		{
			for(int sp=4;sp>=r;sp--)
			{
				System.out.print(" ");
				
			}
			System.out.print("*****");
			System.out.println();
		}
	}
}

/*
C:\Users\LENOVO\Desktop\e-DAC\Module 0-Preparatory\Assignment 2>java PatternStar10
    *****
   *****
  *****
 *****
*****

*/