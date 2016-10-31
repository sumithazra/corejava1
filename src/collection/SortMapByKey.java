package collection;

import java.util.*;
import java.util.Map.Entry;

class SortByKeyAscendingOrder implements Comparator<Map.Entry<Integer, String>> {

	@Override
	public int compare(Map.Entry<Integer, String> entry1,
			Map.Entry<Integer, String> entry2) {

		if (entry1.getKey() > entry2.getKey()) {
			return 1;
		} else if (entry1.getKey() < entry2.getKey()) {
			return -1;
		} else {
			return 0;
		}
		// return entry1.getKey().compareTo(entry2.getKey());

	}

}
class SortByKeyDescendingOrder implements Comparator<Map.Entry<Integer, String>> {

	@Override
	public int compare(Map.Entry<Integer, String> entry1,
			Map.Entry<Integer, String> entry2) {

		if (entry1.getKey() > entry2.getKey()) {
			return -1;
		} else if (entry1.getKey() < entry2.getKey()) {
			return 1;
		} else {
			return 0;
		}
		

	}
}

public class SortMapByKey {

	public static void main(String[] args) {
		Map<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(4, "Four");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(5, "Five");
		map.put(1, "One");
		System.out.println("Before Sorting.........");
		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();

		List<Entry<Integer, String>> entrylist = new ArrayList<Entry<Integer, String>>(
				entrySet);

		/*
		 * for(Entry<Integer, String> entry: entrylist)
		 * System.out.print(entry.getKey()+"="+entry.getValue()+"  ");
		 */

		Iterator it = entrySet.iterator();
		while (it.hasNext()) {
			Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>) it
					.next();
			System.out.println("key:" + entry.getKey() + "  value:"
					+ entry.getValue());
		}

		Collections.sort(entrylist, new SortByKeyAscendingOrder());

		System.out.println("\n" + "After Sorted by key  in Ascending order..........");
		for (Entry<Integer, String> entry : entrylist)
			System.out.println("key:" + entry.getKey() + "  value:"
					+ entry.getValue());

		Collections.sort(entrylist, new SortByKeyDescendingOrder());
		System.out.println("\n" + "After Sorted by key in descending order ..........");
		for (Entry<Integer, String> entry : entrylist)
			System.out.println("key:" + entry.getKey() + "  value:"
					+ entry.getValue());
		
	}

}
