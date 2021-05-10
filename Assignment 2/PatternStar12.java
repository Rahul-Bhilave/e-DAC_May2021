class PatternStar12
{
	public static void main(String args[])
	{
		for(int r=1;r<=5;r++)
		{
			
			for(int sp=5;sp>=r;sp--)
			{
				System.out.print("*");				
			}
			if(r<5)
			System.out.println();	
			
		}		
		for(int l=1;l<=6;l++)
		{			
			for(int sl=2;sl<=l;sl++)
			{
			System.out.print("*");
			}
			System.out.println();			
			
		}
	}
}
C:\Users\LENOVO\Desktop\e-DAC\Module 0-Preparatory\Assignment 2>java PatternStar12
*****
****
***
**
*
**
***
****
*****