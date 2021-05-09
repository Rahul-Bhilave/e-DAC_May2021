package q4;

import java.util.Scanner;

public class Q4b 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three number=");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int res=(a+b)%c;
		
		System.out.println("Result="+res);

	}

}

//Enter three number=
//55
//9
//9
//Result=1
