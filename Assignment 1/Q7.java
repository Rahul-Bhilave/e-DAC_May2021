package q7;
import java.util.*;
public class Q7 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number=");
		int a=sc.nextInt();
		System.out.println("Your entered number="+a);
		
		for(int b=1;b<=10;b++)
		{
			int res=a*b;
			System.out.println(a+" x "+b+" = "+res);
			
		}
			
	}

}

//Enter any number=
//8
//Your entered number=8
//8 x 1 = 8
//8 x 2 = 16
//8 x 3 = 24
//8 x 4 = 32
//8 x 5 = 40
//8 x 6 = 48
//8 x 7 = 56
//8 x 8 = 64
//8 x 9 = 72
//8 x 10 = 80
