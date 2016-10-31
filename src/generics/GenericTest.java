package generics;

import java.util.*;

public class GenericTest {
	
   
	/*class Box {
	    private Object object;

	    public void set(Object object) { this.object = object; }
	    public Object get() { return object; }
	}*/
	
	/**
	 * Generic version of the Box class.
	 * @param <T> the type of the value being boxed
	 */
	public class Box<T> {
	    // T stands for "Type"
	    private T t;

	    public void set(T t) { this.t = t; }
	    public T get() { return t; }
	}
	
	public class OrderedPair<K, V> implements Pair<K, V> {

	    private K key;
	    private V value;

	    public OrderedPair(K key, V value) {
		this.key = key;
		this.value = value;
	    }

	    public K getKey()	{ return key; }
	    public V getValue() { return value; }
	}
	public interface Pair<K, V> {
	    public K getKey();
	    public V getValue();
	}
	
	public static void main(String[] args) {
		
		List<Integer> li = Arrays.asList(1, 2, 3);
		List<String> ls = Arrays.asList("one", "two", "three");
		
		Box<Integer> box=new GenericTest().new Box();
		//box.set("Generics Test");
		box.set(10);		
		Integer obj=box.get();
		System.out.println(obj);
		
		
		Pair<String, Integer> p1 =new GenericTest().new OrderedPair<String, Integer>("Even", 8);
		Pair<String, String>  p2 = new GenericTest().new OrderedPair<String, String>("hello", "world");
		
		
		printList(li);
		printList(ls);

		System.out.println("sum = " + sumOfList(li));
		/**
		 * A list of Double values can use the same sumOfList method. The
		 * following code prints sum = 7.0:
		 **/
		List<Double> ld = Arrays.asList(1.2, 2.3, 3.5);
		System.out.println("sum = " + sumOfList(ld));
		
		

	}

	public static void printList(List<?> list) {
		for (Object elem : list)
			System.out.println(elem + " ");
		System.out.println();
	}

	public static double sumOfList(List<? extends Number> list) {
		double s = 0.0;
		for (Number n : list)
			s += n.doubleValue();
		return s;
	}
	
	

}
