package home;

import java.util.HashMap;
public class Hash_map2 {
	public static void main(String[] args) {
	String str = "aabcdecbdefghgfh";
	
	HashMap<Character,Integer>dataMap= new HashMap<>();
	
	for(Character i = 0; i<str.length(); i++) {
		
		char key = str.charAt(i);
		if(dataMap.containsKey(key)){
			Integer value = dataMap.get(key);
			value++;
			dataMap.put(key, value);}
		else {
			dataMap.put(key, 1);
		}
	
	}
	if(dataMap.containsValue(1)) {
		
		System.out.println("there's a non repeating element");
	}else {
		System.out.print("there is no nonrepeting element");
	}
}

}