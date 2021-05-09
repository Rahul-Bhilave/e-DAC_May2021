
public class Pattern18 
{

	public static void main(String[] args) 
	{
		int d=64;
		//loop for creating rows
		for(int r=5;r>=1;r--)
		{
			//loop for creating spaces
			for(int s=1;s<=r;s++)
			{
				System.out.print((char)(d+s)+" ");
				
			}
			System.out.println();
		}
	}

}

/*
C:\Users\LENOVO\Desktop\e-DAC\Foundation\Assignment 2>java Pattern18
A B C D E
A B C D
A B C
A B
A
*/