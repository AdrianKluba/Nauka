/*
Remove all 0's from the sequence (i.e. warmup1).

If the sequence is now empty (no elements left), stop and return true.

Sort the sequence in descending order (i.e. warmup2).

Remove the first answer (which is also the largest answer, or tied for the largest) from the sequence and call it N. The sequence is now 1 shorter than it was after the previous step.

If N is greater than the length of this new sequence (i.e. warmup3), stop and return false.

Subtract 1 from each of the first N elements of the new sequence (i.e. warmup4).

*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Challenge378 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		long userNumber = 0;

		do {
			try {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Type number");
				userNumber = scanner.nextInt();
			} catch (InputMismatchException n) {
				System.out.println("Type only numbers");
			}
		} while (userNumber == 0);
		// Havel-Hakimi algorithm
		Number hakimi = new Number();

		hakimi.putList(userNumber);

		hakimi.removeZero();
		System.out.println("Remove all 0's from the sequence, ");
		hakimi.showList();
		System.out.println("Option2");
		hakimi.sortArray();
		hakimi.showList();
		System.out.println("Option 3");
		hakimi.checkLengthOfArray();
		System.out.println("Option 4");
		hakimi.Result();

	}
}
