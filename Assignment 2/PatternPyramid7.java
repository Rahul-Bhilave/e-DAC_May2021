class PatternPyramid7
{
	public static void main(String args[])
	{ 
		int d=9;
		for(int r=1;r<=9;r++)
		{
			
				for(int ss=1;ss<=r;ss++)
			{
				System.out.print(" ");
			}
			
			
			for(int s=9;s>=r;s--)
			{
				
				System.out.print(d+" ");
			}
			d--;
			
			System.out.println();
		}
	}
}

/*
C:\Users\LENOVO\Desktop\e-DAC\Module 0-Preparatory\Assignment 2>java PatternPyramid7
 9 9 9 9 9 9 9 9 9
  8 8 8 8 8 8 8 8
   7 7 7 7 7 7 7
    6 6 6 6 6 6
     5 5 5 5 5
      4 4 4 4
       3 3 3
        2 2
         1
		 
*/		 