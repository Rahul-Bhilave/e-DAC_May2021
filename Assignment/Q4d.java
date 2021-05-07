package q4;

import java.util.Scanner;

public class Q4d 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three number=");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		int f=sc.nextInt();
		int res=a+b/c*d-e%f;
		
		System.out.println("Result="+res);
	}
}
//Enter three number=
//5
//15
//3
//2
//8
//3
//Result=13
