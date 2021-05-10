class PatternStar13
{
	public static void main(String args[])
	{
		//uppper five rows
		for(int r=1;r<=5;r++)//loop for creating rows
		{
			if(r>1)
			{
				for(int us=1;us<r;us++)
				{
					System.out.print(" ");
				}
			}
			for(int s=5;s>=r;s--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		//printting lower four lines of stars
		for(int lr=1;lr<=5;lr++)
		{
			if(lr>1)
			{
				for(int ls=4;ls>=lr;ls--)
			{
				System.out.print(" ");
			}
			for(int sl=1;sl<=lr;sl++)
			{
				System.out.print("*");
			}
			System.out.println();
			}
			
		}
	}
}

/*
C:\Users\LENOVO\Desktop\e-DAC\Module 0-Preparatory\Assignment 2>java PatternStar13
*****
 ****
  ***
   **
    *
   **
  ***
 ****
*****

*/