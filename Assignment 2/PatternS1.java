public class PatternS1 
{

	public static void main(String[] args) 
	{
		//loop for creating rows
		for(int r=0;r<5;r++)
		{
			//loop for printing actual Strars '*'
			for(int s=0;s<=r;s++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	
	}

}

/*
C:\Users\LENOVO\Desktop\e-DAC\Foundation\Assignment 2>java PatternS1
*
**
***
****
*****
*/