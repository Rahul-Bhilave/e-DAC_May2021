class PatternStar14
{
	public static void main(String args[])
	{
		//creating upper pyraming
		for(int r=1;r<=5;r++)
		{
			for(int us=1;us<=r;us++)
			{
				System.out.print(" ");
			}
			for(int s=5;s>=r;s--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int lr=1;lr<=6;lr++)
		{
			if(lr>2)
			{
				for(int ls=6;ls>=lr;ls--)
			{
				System.out.print(" ");
			}
			for(int ss=2;ss<=lr;ss++)
			{
				System.out.print("* ");
			}
			System.out.println();
			}
			
		}
	}
}

/*
C:\Users\LENOVO\Desktop\e-DAC\Module 0-Preparatory\Assignment 2>java PatternStar14
 * * * * *
  * * * *
   * * *
    * *
     *
    * *
   * * *
  * * * *
 * * * * *
 
 */