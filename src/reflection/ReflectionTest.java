package reflection;

public class ReflectionTest {
	public static void main(String[] args) throws ClassNotFoundException,
			InstantiationException, IllegalAccessException {

		Class c = Class.forName("reflection.DummyType");
		
		
 
		DummyType dummy = (DummyType) c.newInstance();
		 Class c1=dummy.getClass();
		 Class c2=DummyType.class;
		 System.out.println(c.hashCode()==c1.hashCode());
		 System.out.println(c2.hashCode()==c1.hashCode());
		System.out.println(dummy);

		/*
		 * DummyType dummy=new DummyType("X-Men", 22);
		 * System.out.println(dummy);
		 */
	}
}

class DummyType {

	String name;
	int value;

	DummyType() {
	}

	DummyType(String name, int val) {
		this.name = name;
		this.value = val;
	}

	public String toString() {
		return "DummyType name:" + name + " value:" + value;
	}
}

class MyGen<T> {
	T obj;

	void add(T obj) {
		this.obj = obj;
	}

	T get() {
		return obj;
	}
}
