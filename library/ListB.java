/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Horikss
 */
public class ListB {
	List list = new ArrayList();

	public void putList(Object t) {
		list.add((Book) t);
	}

	public void showlist() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));

		}

	}

	public void sortbyPrice() {
		Collections.sort(list, new Sorting());
	}

}
