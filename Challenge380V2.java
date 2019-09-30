/*
Change alphabet to morse code, 
v2 less code
 */

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Horikss
 */
public class Challenge380V2 {
	private static final String MORSE = ".- -... -.-. -.. . ..-. --. .... .. .--- -.- .-.. -- -. --- .--. --.- .-. ... - ..- ...- .-- -..- -.-- --..";
	private static final String ALPHABET = "a b c d e f g h i j k l m n o p q r s t u v w x y z";

	public static void main(String[] args) {
		Challenge380V2 objectMain = new Challenge380V2();
		String wordChange = "AdrianKluba";
		String[] alpha = ALPHABET.split(" ");
		String[] morsecode = MORSE.split(" ");
		String[] User = wordChange.split("");
		List<String> result = new ArrayList();
		objectMain.result(alpha, morsecode, User, result);
		System.out.println(result);
	}

	List<String> result(String[] alpha, String[] morsecode, String[] User, List<String> result) {

		for (String User1 : User) {
			for (int i = 0; i < alpha.length; i++) {
				if (alpha[i].equals(User1)) {
					result.add(morsecode[i]);
				}
			}
		}
		return result;
	}
}
