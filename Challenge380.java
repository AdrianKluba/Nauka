/*
Challenge #380
From Alphabet to morse code
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Horikss = Adrian Kluba
 */
public class Challenge380 {

	/**
	 * @param args the command line arguments
	 */
	private static final String MORSE = ".- -... -.-. -.. . ..-. --. .... .. .--- -.- .-.. -- -. --- .--. --.- .-. ... - ..- ...- .-- -..- -.-- --..";
	private static final String ALPHABET = "a b c d e f g h i j k l m n o p q r s t u v w x y z";

	public static void main(String[] args) {
		Challenge380 objectMain = new Challenge380();
		String[] morseList = MORSE.split(" ");
		String[] alphabetList = ALPHABET.split(" ");
		List<String> allList = new ArrayList(); // list with alphabet and morse code
		List<String> UserList = new ArrayList();
		String fromUser = "Adrian";

		objectMain.connection(alphabetList, morseList, allList);
		System.out.println("Show list of alphabet and mors");
		objectMain.Show(allList);
		objectMain.MorsChange(fromUser, allList, UserList);
		System.out.println("User type: " + fromUser);
		System.out.println("from alphabet to morse code change:");
		objectMain.Show(UserList);

	}

	List<String> connection(String[] alphabetList, String[] morseList, List<String> allList) {
		for (int i = 0; i < morseList.length; i++) {
			allList.add(alphabetList[i]);
			allList.add(morseList[i]);
		}
		return allList;
	}

	void show(List<String> List) {
		String show = List.stream().map(Object::toString).collect(Collectors.joining(" "));
		System.out.println(show);
	}

	List<String> morsChange(String fromUser, List<String> allList, List<String> UserList) {
		String[] User = fromUser.split("");
		for (String User1 : User) {
			for (int x = 0; x < allList.size(); x++) {
				if (allList.get(x).equals(User1)) {
					UserList.add(allList.get(x + 1));
				}
			}
		}
		return UserList;
	}
}
