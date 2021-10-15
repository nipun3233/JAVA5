package home;

import java.util.HashMap;
public class Hash_Map {
	

	String str = "aaaaa bbbbbb c";
    str = str.toLowerCase();
    HashMap<Character,Integer>dataMap= new HashMap<>();
    for(int i=0;i<str.length();i++) {
        Character ch = str.charAt(i);
        if(ch>='a' && ch<='z') {
            if(dataMap.containsKey(ch)) {
                Integer value = dataMap.get(ch);
                value++;
                dataMap.put(ch, value);

            }else {
                dataMap.put(ch, 1);
            }
        }
    }
    int max =0;
    char maxChar = 0;
    for(Character Key : dataMap.keySet()) {
   if(max<dataMap.get(Key)) {
       max=dataMap.get(Key);
       maxChar = Key;
   }
    }
    System.out.println(dataMap);
    System.out.println("the maximum frequency is of : "+maxChar);
    
    //System.out.println(dataMap);
    int min = Integer.MAX_VALUE;
    char minChar=0;

    for(Character key: dataMap.keySet()) {
    int value = dataMap.get(key);

    if(min > value) {
    min = value;
    minChar = key;
    }
    }

    System.out.println("the least frequency is of : "+minChar);    
    
    
    
    }


}
