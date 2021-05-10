public class PatternStar5 
{

	public static void main(String[] args) 
	{
		//loop for creating rows
		for(int r=1;r<=5;r++)
		{		
			//loop for creating spaces
			for(int s=4;s>=r;s--)
			{
				System.out.print(" ");
			}
			//loop for printing Star
			for(int sl=1;sl<=r;sl++)
			{
				System.out.print("*");
			}
			for(int sr=1;sr<r;sr++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

/*
C:\Users\LENOVO\Desktop\e-DAC\Foundation\Assignment 2>java PatternStar5
    *
   ***
  *****
 *******
*********
*/