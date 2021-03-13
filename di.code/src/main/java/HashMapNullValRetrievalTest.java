import java.util.HashMap;
import java.util.Map;

public class HashMapNullValRetrievalTest {

	public static void main(String[] args) {
		Map<Integer, Integer>map = new HashMap<Integer, Integer>();
		map.put(2, 4);
		map.put(3, 9);
		map.put(4, 16);
		map.put(5, 25);
		map.put(6, null);
		map.put(null, null);
		System.out.println(map);
		Integer val = map.get(2);//4
		System.out.println(val);
		val = map.get(7);
		System.out.println(val);//null
		val = map.get(6);
		System.out.println(val);//null
		val = map.get(null);
		System.out.println(val);//null
		map.put(null, 100);
		System.out.println(map.get(null));
	}

}
