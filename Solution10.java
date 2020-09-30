import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

	/*
	 * Complete the 'findDay' function below.
	 *
	 * The function is expected to return a STRING.
	 * The function accepts following parameters:
	 *  1. INTEGER month
	 *  2. INTEGER day
	 *  3. INTEGER year
	 */

	  public static String findDay(int month, int day, int year) {
	        LocalDate date = LocalDate.of(year, month, day);
	        return date.getDayOfWeek().name();
	        }



}

public class Solution10 {
	public static void main(String[] args)  {

		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt();

		int day = scan.nextInt();

		int year = scan.nextInt();

		String res = Result.findDay(month, day, year);
		System.out.println(res);


	}
}
