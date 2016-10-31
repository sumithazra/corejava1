package accessModifier;

class A {
	private int data = 40;

	private void msg() {
		System.out.println("Hello java");
	}

	public void display() {
		A a = new A();
		System.out.println(a.data);
		a.msg();
	}
}

public class AccesModifierTest {
	public static void main(String args[]) {
		A obj = new A();
		// System.out.println(obj.data);//Compile Time Error
		// obj.msg();//Compile Time Error
		obj.display();
		
	}
}
