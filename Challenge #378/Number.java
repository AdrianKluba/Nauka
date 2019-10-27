import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class numberList {
	long firstIndexOfList;
	List<Long> numberList = new ArrayList();

	public void putList(long t) {
		do {
			numberList.add(t % 10);
			t /= 10;
		} while (t != 0);

	}

	public void showList() {
		String listString = numberList.stream().map(Object::toString).collect(Collectors.joining(", "));
		System.out.println(listString);
	}

	public void removeZero() {
		for (int i = 0; i < numberList.size(); i++) {
			if (numberList.get(i) == 0) {
				numberList.remove(i);
				i--;
			}

		}

	}

	public void sortArray() {
		Collections.sort(numberList);
		Collections.reverse(numberList);
	}

	boolean check;

	public boolean checkLengthOfArray() {
		firstIndexOfList = numberList.get(0);
		numberList.remove(0);
		if (numberList.size() <= firstIndexOfList) {
			check = false;

		} else {
			check = true;

		}

		return check;

	}

	public void Result() {

		if (checkLengthOfArray()) {
			System.out.println("test");
			for (int i = 0; i < firstIndexOfList; i++) {
				numberList.set(i, (numberList.get(i) - 1));
			}
			showList();

		} else {
			System.out.println("False mean stop");
		}
	}

}
