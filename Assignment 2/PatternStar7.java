class PatternStar7
{
	public static void main(String args[])
	{
		//upper pyramid
		for(int i=0;i<5;i++)//loop for creating rows
		{
			for(int s=4;s>i;s--)//loop for creating spaces
			{
				System.out.print(" ");
			}
			for(int sl=0;sl<=i;sl++)
			{
				System.out.print("*");
			}
			for(int sr=0;sr<i;sr++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		//lower pyramid
		for(int q=0;q<4;q++)//loop for creating rows
		{
			
			for(int w=0;w<=q;w++)
			{
				System.out.print(" ");
			}
			for(int e=4;e>q;e--)
			{
				System.out.print("*");
			}
			for(int lr=3;lr>q;lr--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

/*
C:\Users\LENOVO\Desktop\e-DAC\Foundation\Assignment 2>java PatternStar7
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
*/