public class PatternStar6 
{

	public static void main(String[] args) 
	{
		//loop for creating rows
		for(int r=1;r<=5;r++)
		{
			//System.out.println("Hello!");
			if(r>1)
			{
				for(int x=1;x<r;x++)
				{
					System.out.print(" ");
				}
			}
			for(int s=5;s>=r;s--)
			{
				System.out.print("*");
			}
			//
			for(int sr=4;sr>=r;sr--)
			{
				System.out.print("*");
			}
			System.out.println ();
		}
	}

}

/*
C:\Users\LENOVO\Desktop\e-DAC\Foundation\Assignment 2>java PatternStar6
*********
 *******
  *****
   ***
    *
*/