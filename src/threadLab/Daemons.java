package threadLab;

public class Daemons extends Thread {

	private int countDown=5;
	private static int ThreadCount=0;
	public Daemons()
	{
		super(" "+ ++ThreadCount);
		//setDaemon(true);
		System.out.println(this.currentThread().getName());
		try {
		    sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		start();
		
		System.out.println("Inside constactor "+ThreadCount);
	}

	public void run()
	{
		System.out.println(currentThread().getName());
		while(true)
		{
			System.out.println(this);
			if(--countDown==0)return;
			yield();
			
		}
	}

 public String toString()
	{
		return "#"+getName() +":"+ countDown;
		
		
	}
	
	
	public static void main(String[] args) {
		
		for(int i=0; i<5; i++)
		{
			new Daemons();
			
		}
		
		
	}
}
//class DemaonSpwan extends 