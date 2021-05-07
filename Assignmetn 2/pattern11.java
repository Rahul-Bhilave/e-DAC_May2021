class pattern11
{
	public static void main(String args[])
	{
		for(int r=0;r<5;r++)//loop for creating rows
		{
			
			for(int s=4;s>r;s--)//loop for creating spaces
			{
				System.out.print(" ");
			}
			
			for(int ls=0;ls<=r;ls++)//loop for printing *
			{
				System.out.print("*");
			}
			if(r>=1)
			{
				for(int rs=1;rs<=r;rs++)//loop for printing * on rigth side
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
/*
C:\Users\LENOVO\Desktop\e-DAC\Foundation\Assignment 2>java pattern11
    *
   ***
  *****
 *******
*********
*/