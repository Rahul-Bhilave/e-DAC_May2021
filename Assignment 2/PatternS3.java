public class PatternS3 
{

	public static void main(String[] args) 
	{
		//loop for creating rows
		for(int r=0;r<5;r++)
		{
			
			//loop for printing actual Strars '*'
			for(int s=4;s>=r;s--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	
	}

}
/*OUTPUT
C:\Users\LENOVO\Desktop\e-DAC\Foundation\Assignment 2>java PatternS3
*****
****
***
**
*
*/