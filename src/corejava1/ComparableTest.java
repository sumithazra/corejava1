package corejava1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import java.util.*;

public class ComparableTest {
	
	public static void main(String[] args) {
		ArrayList<String> al1 =new ArrayList<String>();
		
		/*Comparator compare = new Comparator<Object>() {
			public int compare(Object o1, Object o2) {};
		};*/
		
		al1.add("Dog");
		al1.add("lion");
		al1.add("Cat");
		al1.add("Apple");
		
		ArrayList<String> al2 = new ArrayList<String>();
		
		ArrayList al = new ArrayList();
		
		al.add(al1);
		al.add(al2);
		
		
		/*Iterator it = al.iterator();
		
		while(it.hasNext())
		{
			System.out.println("element"+it.next());
			
		}	*/
		
		Stack st = new Stack();
	      System.out.println("stack: " + st);
	      /*showpush(st, 42);
	      showpush(st, 66);
	      showpush(st, 99);
	      showpop(st);
	      showpop(st);
	      showpop(st);
	      try {
	         showpop(st);
	      } catch (EmptyStackException e) {
	         System.out.println("empty stack");
	      }*/
		
		//Collections.sort(al);
		
		//for(String st:al)
		{
			//System.out.println("element" +st);
			
		}
		
		
	}

}
