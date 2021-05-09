class pattern5
{
	public static void main(String args[])
	{
		int X=65;
		for(int i=1;i<=5;i++) //for loop for row
	{
			for(int j=1;j<=i;j++) //for loop for making coloumns
			{
				System.out.print((char)(X));
			}
			X++ ;
			System.out.println();
	}
		
	}
	
}
//pattern5
/*C:\Users\LENOVO\Desktop\e-DAC\Foundation\Assignment 2>java pattern5
A
BB
CCC
DDDD
EEEEE
*/