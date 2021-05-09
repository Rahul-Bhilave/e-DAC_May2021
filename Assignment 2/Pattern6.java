
class Pattern6 
{

	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++) //for loop --for forming rows
		{
			for (int j=4;j>=i;j--) //for loop --for printing spaces
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++) //for loop-- for printing (*)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
