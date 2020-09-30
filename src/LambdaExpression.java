import java.util.Scanner;

/**
 * 
 */

/**
 * @author aymen
 *
 */
interface MyInterface {
	int addition (int a, int b);
}
interface SecondInterface {
	int substraction (int a, int b);
}
interface ThirdInterface {
	void message(int a, int b);
}
class Messenger {
	Messenger (int a, int b) {
		System.out.println(a+" "+b);
	}
}
public class LambdaExpression {
	static int dojo = 10;
	/**
	 * @param args
	 */
	public  int doSubstraction (int a, int b) {
		if (a>=b)
			return a-b;
		else
			return 0;
	}
	public static void main(String[] args) {
		int holo = new Scanner(System.in).nextInt();
		MyInterface my = ( int a, int b) -> {
			return holo+b;
		};
		System.out.println(my.addition(0, dojo));
		// static reference (when the method is static)
		//SecondInterface sc = LambdaExpression::doSubstraction;
		
		//non static reference
		LambdaExpression exp = new LambdaExpression();
		SecondInterface sc = exp::doSubstraction;
		System.out.println(sc.substraction(10, 5));
		
		
		// reference to a constructor
		ThirdInterface th =Messenger::new;
		th.message(dojo, 20);
	}

}
