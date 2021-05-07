package q6;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers=");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int add=a+b;
		int sub=a-b;
		int mul=a*b;
		int div=a/b;
		int mod=a%b;

		System.out.println("Addition of given number="+add);	
		System.out.println("Subtration of given number="+sub);
		System.out.println("Multiplication of given number="+mul);
		System.out.println("Division of given number="+div);
		System.out.println("Modulus of given number="+mod);
	}

}

//Enter two numbers=
//125 24
//Addition of given number=149
//Subtration of given number=101
//Multiplication of given number=3000
//Division of given number=5
//Modulus of given number=5