package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Practise {
	public static void main(String[] args) {

		Map<String, Long> values = new HashMap<>();

		values.put("sonu", 123456789L);
		values.put("prashu", 123456788L);
		values.put("latha", 123456787L);
		values.put("ratna", 123456786L);

		for (Entry<String, Long> s : values.entrySet())
			System.out.println(s.getKey() + " " + s.getValue());

	}
}
