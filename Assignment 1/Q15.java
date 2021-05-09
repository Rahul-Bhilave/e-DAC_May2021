import java.util.*;
class Q15
{
	public static void main(String args[])
	{
		System.out.println("Enter two numbers=");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Numbers befor swaping:"+" A="+a+" B="+b);
		
		int temp=a;
		a=b;
		b=temp;
		
		System.out.println("Numbers after swaping:"+"A="+a+" B="+b);
	}
}
/*
C:\Users\LENOVO\Desktop\e-DAC\Foundation\Assignment 1>java Q15
Enter two numbers=
10
20
Numbers befor swaping: A=10 B=20
Numbers after swaping:A=20 B=10
*/