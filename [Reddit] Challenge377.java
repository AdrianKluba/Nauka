/*Challenge #377 [Easy] Axis-aligned crate packing
for instance, if the crate is size X = 25 by Y = 18, and the boxes are size x = 6 by y = 5, then the answer is 12. 
You can fit 4 boxes along the x-axis (because 6*4 <= 25), and 3 boxes along the y-axis (because 5*3 <= 18), so in total you can fit 4*3 = 12 boxes in a rectangle.
BONUS ou now have the option of rotating all boxes by 90 degrees, so that you can treat a set of 6-by-5 boxes as a set of 5-by-6 boxes. 
You do not have the option of rotating some of the boxes but not others. 
*/ 


import java.util.InputMismatchException;
import java.util.Scanner;

public class Challenge377 {
	public static void main(String[] args) {
		int mainA = 0; // first size of the main box
		int mainB = 0; // second size of the main box
		int smallA = 0; // first size of the small box from user
		int smallB = 0; // second size of the small box from user
		while (mainA == 0 || mainB == 0 || smallA == 0 || smallB == 0) {
			try {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Type first size of the main box (bigger than 0)");
				mainA = scanner.nextInt();
				System.out.println("Type second size of the main box (bigger than 0)");
				mainB = scanner.nextInt();
				System.out.println("Type first size of small box  (bigger than 0)");
				smallA = scanner.nextInt();
				System.out.println("Type second size of small box  (bigger than 0)");
				smallB = scanner.nextInt();

			} catch (InputMismatchException n) {
				System.out.println("Type only numbers!");
			}
		}
		System.out.println(wRotated(mainA, mainB, smallA, smallB));
	}
	// not Rotated
	public static int nRotated(int mainA, int mainB, int smallA, int smallB) {

		if (mainA > smallA && mainB > smallB) {
			int rA = mainA / smallA;
			int rB = mainB / smallB;
			return rA * rB;
		} else
			System.out.println("You can't fit boxes");
		return 0;
	}
	// with Rotated
	public static int wRotated(int mainA, int mainB, int smallA, int smallB) {

		int normal = nRotated(mainA, mainB, smallA, smallB);
		int rotated = nRotated(mainA, mainB, smallB, smallA);
		return Math.max(normal, rotated);
	}
}
