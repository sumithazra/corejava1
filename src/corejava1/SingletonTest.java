package corejava1;

class Singletonstub {
	private static Singletonstub instance = null;
	
	private Singletonstub(){}
	
	public static Singletonstub getInstance() {
		if (instance == null) {
			instance = new Singletonstub();

			return instance;

		} else {
			return instance;

		}

	}

	public void display() {

		System.out.println("How's that---Inside display");
	}

}

public class SingletonTest {
	public static void main(String[] args) {

		Singletonstub stub = Singletonstub.getInstance();
		
		stub.display();
		
		}
}
