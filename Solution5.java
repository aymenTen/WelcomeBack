import java.util.Scanner;

//https://www.hackerrank.com/challenges/java-loops/problem

/**
 * @author aymen
 *
 */
class Solution5{
	public static void main(String []argh){
		int a =0;
		int b =0;
		int c =0;
		int n =0;
		int s =0;
		Scanner in = new Scanner(System.in);
		int t=in.nextInt();
		for(int i=0;i<t;i++){
			 a = in.nextInt();
			 b = in.nextInt();
			 n = in.nextInt();
			 for (int j=0; j<n; j++) {
				s+= a+Math.pow(2, j)*b; 
				a=0;
				System.out.print(s+" ");
			 }
			 System.out.println();
			 s=0;
		}
		in.close();
	}
}