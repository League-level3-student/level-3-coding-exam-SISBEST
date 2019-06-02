import java.util.HashMap;

public class HashMapCalculator {
	int common = 0;
	public Object commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
		if(hashmap2.get("Mary") == hashmap1.get("Mary")) {
			common++;
		}
		if(hashmap2.get("Bob") == hashmap1.get("Bob")) {
			common++;
		}
		return common;
	}

}
