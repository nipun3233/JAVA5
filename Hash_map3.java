package home;

import java.util.concurrent.ConcurrentHashMap;
public class Hash_map3 {
	public static void main(String[] args) {
		ConcurrentHashMap<Integer,String> datamap = new ConcurrentHashMap<>();
        datamap.put( 1, "sanjay");
        datamap.put( 2, "ashutosh");
        datamap.put( 3, "nipun");
        datamap.put( 4, "D");
        datamap.put( 5, "akanksha");
        datamap.put( 6, "abhi");
        

        for (Integer key: datamap.keySet()) {
            if(datamap.get(key).equals("D"))
            	datamap.remove(key);
        		}
        
        for (Integer key: datamap.keySet()) {
            System.out.println(key + datamap.get(key));
        }
}
}
