import java.util.*;
import java.io.*;


//https://www.hackerrank.com/challenges/java-datatypes/problem?h_r=next-challenge&h_v=zen

/**
 * @author aymen
 *
 */
class Solution6{
	public static void main(String []argh)
	{



		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();

		for(int i=0;i<t;i++)
		{

			try
			{
				long x=sc.nextLong();
				if (x>Long.MAX_VALUE)
					System.out.println("can't be fitted anywhere.");
				else {
					System.out.println(x+" can be fitted in:");
					if(x>=-128 && x<=127)System.out.println("* byte");
					if(x>=-32768 && x<=32767)System.out.println("* short");
					if(x>=-2147483648  && x<=2147483647)System.out.println("* int");
					if(x>=-9223372036854775808L && x<=9223372036854775807L)System.out.println("* long");
				}

			}
			catch(Exception e)
			{
				System.out.println(sc.next()+" can't be fitted anywhere.");
			}

		}
	}
}


