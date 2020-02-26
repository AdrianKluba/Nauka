/*  
Challenge #370 [Easy] UPC check digits
For example, given the first 11 digits of a UPC 03600029145, you can compute the check digit like this:
Sum the odd-numbered digits (0 + 6 + 0 + 2 + 1 + 5 = 14).
Multiply the result by 3 (14 × 3 = 42).
Add the even-numbered digits (42 + (3 + 0 + 0 + 9 + 4) = 58).
Find the result modulo 10 (58 divided by 10 is 5 remainder 8, so M = 8).
If M is not 0, subtract M from 10 to get the check digit (10 - M = 10 - 8 = 2).
So the check digit is 2, and the complete UPC is 036000291452. 
*/


import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Challenge370 {

	public static void main(String[] args) {
		long zero = 0;
		long odd = 0;
		long even = 0;
		long result = 0;
		long finalResult = 0;
		long userNumber = 0;
		do {
			try {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Type number");
				userNumber = scanner.nextLong();
			} catch (InputMismatchException n) {
				System.out.println("Type only numbers");
			}
		} while (userNumber == 0);

		long number = userNumber;
		// upc = Universal Product Code
		List<Long> upc = new ArrayList();
		do {
			upc.add(number % 10);
			number /= 10;
		} while (number != 0);
		while (upc.size() < 11) {
			upc.add(zero);
		}
		Collections.reverse(upc);
		for (int i = 0; i < upc.size(); i += 2)
			odd += upc.get(i);

		odd *= 3;
		for (int i = 1; i < upc.size(); i += 2)
			even += upc.get(i);

		result = odd + even;
		finalResult = result % 10;
		if (finalResult != 0)
			finalResult -= 10;

		upc.add(finalResult);
		System.out.println("Final Result:" + finalResult);
		System.out.println(userNumber + "" + finalResult);
	}

}
