class PatternStar9
{
	public static void main(String args[])
	{
			for(int r=0;r<5;r++)
		{
			for(int s=4;s>r;s--)
			{
				System.out.print(" ");
			}
			for(int st=0;st<=r;st++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int l=0;l<4;l++)
		{
			for(int sl=0;sl<=l;sl++)
			{
				System.out.print(" ");
			}
			for(int ls=4;ls>l;ls--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

/*
C:\Users\LENOVO\Desktop\e-DAC\Foundation\Assignment 2>java PatternStar9
    *
   **
  ***
 ****
*****
 ****
  ***
   **
    *
	
*/	