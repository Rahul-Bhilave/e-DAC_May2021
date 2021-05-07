class pattern15
{
	public static void main(String args[])
	{
	 for(int r=1;r<=5;r++)//loop for creating rows
	 {
		 for(int n=5;n>=r;n--)
		 {
			 System.out.print(n+" ");
		 }
			System.out.println();
	 }
	}
}
/*
C:\Users\LENOVO\Desktop\e-DAC\Foundation\Assignment 2>java pattern14
5 4 3 2 1
5 4 3 2
5 4 3
5 4
5
*/