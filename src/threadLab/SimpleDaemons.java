package threadLab;

public class SimpleDaemons extends Thread {

	public SimpleDaemons()
	{
		setDaemon(true);
		start();
	}
	
	public void run()
	{
		
		
		
			/*try{
				sleep(100);
				
			}
			catch(InterruptedException e)
			{
				throw new RuntimeException(e);
			}*/
			for(int i=0;i<5;i++)
			{
				System.out.println(i);
				
			}
	}
	
	public static void main(String[] args) {
		
		for(int i=0;i<5;i++)
		{
			new SimpleDaemons();
			
		}
	}
	
}
