class PatternStar8
{
	public static void main(String args[])
	{
		for(int r=0;r<5;r++) //loop for creating first five rows
		{
			for(int s=0;s<=r;s++)//loop for printing stars
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		//creating lower star patter
		for(int r1=0;r1<4;r1++)//loop for creating lower four rows
		{
			for(int s1=4;s1>r1;s1--)//loop for printing stars
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

/*
C:\Users\LENOVO\Desktop\e-DAC\Foundation\Assignment 2>java PatternStar8
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