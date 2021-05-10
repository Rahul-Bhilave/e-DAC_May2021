class PatternPyramid6
{
	public static void main(String args[])
	{
		for(int r=1;r<=9;r++)
		{
			
				for(int ss=1;ss<=r;ss++)
			{
				System.out.print(" ");
			}
			
			
			for(int s=9;s>=r;s--)
			{
				System.out.print(s+" ");
			}
			
			System.out.println();
		}
	}
}

/*
C:\Users\LENOVO\Desktop\e-DAC\Module 0-Preparatory\Assignment 2>java PatternPyramid6
 * * * * * * * * *
  * * * * * * * *
   * * * * * * *
    * * * * * *
     * * * * *
      * * * *
       * * *
        * *
         *
		 
*/		 