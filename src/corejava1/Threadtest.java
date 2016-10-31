package corejava1;

public class Threadtest{
   public static void main(String[] args) {
	   NameRunnable r=new NameRunnable();
		Thread t1= new Thread(r);
		Thread t2=new Thread(r);
		
		t1.start();
		t2.start();
		
		
}                     
	
    
	
	
	
}

 class NameRunnable implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<=3;i++)
		{
			System.out.println("rUN BY"+ Thread.currentThread().getName()+", i is"+ i);  
			//doStuff();
			
		}
		
	}
	
	public void doStuff() {
		System.out.println("not synchronized");
		synchronized(this) {
		System.out.println("synchronized");
		}
		}
	
	
	
}