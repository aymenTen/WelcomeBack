import java.util.Scanner;
import java.lang.Exception;
public class Solution8 {

	static Scanner scan = new Scanner(System.in);
	static int B= scan.nextInt();
	static int H= scan.nextInt();
	static boolean flag = B>0 && H>0;

	static {
		try {
			if(!flag){
				throw new Exception("Breadth and height must be positive");
			}
		}catch (Exception ex) {
			System.out.println(ex);
		}
	}
	public static void main(String[] args){	
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
	}//end of main

}//end of class

