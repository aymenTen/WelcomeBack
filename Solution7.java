import java.util.ArrayList;
import java.util.Scanner;

public class Solution7 {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner scan = new Scanner(System.in);
		ArrayList<String> myArray = new ArrayList<String>();
		int n= 5;
		while(scan.hasNext()) {
			String input = scan.nextLine();
			myArray.add(input);
		}
		for(int i=0; i<myArray.size();i++) {
			System.out.println(i+1+" "+myArray.get(i));
		}
	}
}