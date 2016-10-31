package threadLab;

public class ThreadClass {
public static void main(String[] args) {
	
	Runnable r =new Runnable(){
		
		public void run()
		{
			
			System.out.println("hello");
		}
		
		
	};
	
	
/*	new Thread(new Runnable(){
		
		public void run()
		{
			
			System.out.println(" Hello world");
		}
		
	}).start();*/
}
	
	
}
