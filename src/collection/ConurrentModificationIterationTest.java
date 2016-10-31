package collection;

import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class ConurrentModificationIterationTest {

	public static void main(String[] args) {
	//Map<Integer, String> hs=new ConcurrentHashMap<Integer, String>();
	Map<Integer, String> hs=new HashMap<Integer, String>();
		hs.put(11, "Spring Aop");
		hs.put(22,"Spring Ioc");
		String sd=hs.put(33, "Spring MVC");
		hs.put(null, "sears holding");
		
		System.out.println(sd);
		String v=hs.get(null);
		System.out.println(v);
		
		Iterator<Integer> keySetIterator = hs.keySet().iterator();
		while(keySetIterator.hasNext()){ 
			Integer key = keySetIterator.next(); 
			System.out.println("key: " + key + " value: " + hs.get(key));
			hs.put(33, "Spring DAO");
			//hs.remove(key);
		}
       
		System.out.println(hs);
		List<String> list=new ArrayList<String>();
		list.add("ram");
		list.add("lakshman");
		
		Iterator it=list.iterator();
		
		list.remove(0);
		
		//Iterator it=list.iterator();
		while(it.hasNext())
         System.out.println(it.next());




	}

}
