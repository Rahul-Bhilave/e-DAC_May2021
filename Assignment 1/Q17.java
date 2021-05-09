
import java.util.Scanner;

public class BinaryAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int[] ar = new int[2];
		int[] br = new int[2];
		int[] cr = new int[2];
		int carry=0;
		for (int i = 0; i < ar.length; i++) {

			ar[i] = sc.nextInt();

		}
		for (int i = 0; i < ar.length; i++) {

			br[i] = sc.nextInt();

		}
		
		for(int i=ar.length-1;i>=0;i--)
		{
			if(ar[i]==0&&br[i]==1 || ar[i]==1&&br[i]==0)
			{
				cr[i]=1;
			}
			if(ar[i]==1&&br[i]==1)
			{
				cr[i]=0+carry;
				carry=1;
			}
			if(ar[i]==0&&br[i]==0)
			{
				cr[i]=0;
			}
			
		}
		
		System.out.println(carry+""+cr[0]+""+cr[1]);

	}

}
/*
Output:
1 0 
1 1 
101
*/