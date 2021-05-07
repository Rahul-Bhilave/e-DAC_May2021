class pattern2
{
	public static void main(String[] args)
	{
		int X=64;
		for(int i=1;i<=5;i++)//row
		{
			for(int j=1; j<=i;j++) //column
			{
				System.out.print((char)(X+j)+" ");
			}
			System.out.println();
		}
	}
}

//pattern
/*C:\Users\LENOVO\Desktop\e-DAC\Foundation\Assignment 2>java pattern2
A
A B
A B C
A B C D
A B C D E*/
