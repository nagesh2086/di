package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddUponSortedListTest {

	public static void main(String[] args) {
		// List<Integer> list = Arrays.asList(80, 60, 70, 20, 41);
		List<Integer> list = new ArrayList<Integer>();
		list.add(80);
		list.add(60);
		list.add(70);
		list.add(20);
		list.add(41);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		System.out.format("%s %s %s %s %s %s %s", Collections.binarySearch(list, 20), Collections.binarySearch(list, 41),
				Collections.binarySearch(list, 60), Collections.binarySearch(list, 70),
				Collections.binarySearch(list, 80), Collections.binarySearch(list, 90), "/n");
		int pos = Collections.binarySearch(list, 90);
		System.out.println(pos);
		if (pos < 0) {
			list.add(-pos - 1, 90);
		}
		pos = Collections.binarySearch(list, 0);
		System.out.println(pos);
		if (pos < 0) {
			list.add(-pos - 1, 0);
		}
		// list.add(Collections.binarySearch(list, 90) - 1, 90);
		System.out.println(list);
	}

}
