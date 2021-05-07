import java.util.Scanner;
class Q12

{
	
	public static void main(String args[])
	{
			System.out.println("Enter three numbers=");
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			
			int avg=(a+b+c)/3;
			System.out.println("Average of given three number="+avg);
	}
}


/*
C:\Users\LENOVO\Desktop\e-DAC\Foundation\Assignment 1>java Q12
Enter three numbers=
20
10
30
Average of given three number=20
*/