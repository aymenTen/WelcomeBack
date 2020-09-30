import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution17 {

	public static void main(String[] args) {

		try {
			Scanner scan = new Scanner(System.in);
			String x = scan.nextLine();
			String y = scan.nextLine();
			Integer.parseInt(x);
			if (Integer.parseInt(y)==0)
				System.out.println("java.lang.ArithmeticException: / by zero");
			else
				if (Integer.parseInt(x)<-2147483648  && Integer.parseInt(x)>2147483647)
					System.out.println("java.util.InputMismatchException");
				else
					System.out.println(Integer.parseInt(x)/Integer.parseInt(y));
			
		}catch (Exception ex) {
			System.out.println("java.util.InputMismatchException");
		}
	}
}