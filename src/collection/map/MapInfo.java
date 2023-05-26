package collection.map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapInfo {
	public static void main(String[] args) {

		Map<String, Integer> values = new TreeMap<>();

		values.put("india", 100);
		values.put("Nepal", 99);
		values.put("USA", 98);
		values.put("England", 97);

//		Set<String> keys = values.keySet();
//
//		for (Object key : keys)
//			System.out.println(key + " " + values.get(key));

		for (Entry<String, Integer> e : values.entrySet())
			System.out.println(e.getKey() + " " + e.getValue());

	}
}
