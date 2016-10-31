package threadLab;

class SampleDemo implements Runnable
{
	private String threadname;
	private Thread t;

	SampleDemo(String threadname)
	{
		this.threadname=threadname;
	}
	
	@Override
	public void run() {
		while(true)
			System.out.println(threadname);
	}
	
	public void start()
	{
		if(t==null)
		{
			
			t=new Thread(this, threadname);
			t.start();
			
		}
		
	}
	
	
	static int candy(int[] score)
	{
		int candy_counter=0;
	
		if(score[0]>score[1])
		{
			candy_counter=2;
		}
		else
		{
			candy_counter=1;
		}
		for(int i=1; i<score.length; i++)
		{
			int j=i;
			if((score[j-1]==score[j]) )
			{
				
				candy_counter=candy_counter+1;
			}
			if((score[j-1]<score[j]) )
			{
				candy_counter=candy_counter+2;
				
			}
			if(score[j-1]>score[j])
			{
				candy_counter=candy_counter+1;
				
			}
		}
		return candy_counter;
		
		
	}

}


public class TestThread {

	public static void main(String[] args) {
		
		SampleDemo a=new SampleDemo("A");
		SampleDemo b=new SampleDemo("B");
		/*a.start();
		b.start();*/
		int[] score={1,2,2};
		int r=a.candy(score);
		System.out.println(r);
	}
}
