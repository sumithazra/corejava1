package threadLab;

import java.util.*;

public class ProducerConsumer {

	public static void main(String[] args) {
		int Max_Size=10;
		Queue<Integer> buffer=new LinkedList( );
		
		Producer p=new Producer("Producer", Max_Size, buffer);
		Consumer c=new Consumer("Consumer", Max_Size, buffer);
		p.start();
		c.start();
	}
	
	
	
}


class Producer extends Thread
{
	private int MaxSize;
    private Queue<Integer> queue;	
	Producer(String name, int MaxSize, Queue buffer)
	{
    super(name);
	this.MaxSize=MaxSize;
	this.queue=buffer;
	}
	
	@Override
	public void run() {	
		while (true) {
        synchronized(queue){
			while (queue.size() == MaxSize) {
             try {
				queue.wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
				
			}

			Random r = new Random();
			int i = r.nextInt();
			System.out.println("producing value " + i);
			queue.add(i);
			queue.notifyAll();

		}
		}
	}
	


}

class Consumer extends Thread
{
	
		int MaxSize;
	    Queue<Integer> queue;	
	    Consumer(String name, int MaxSize, Queue buffer)
		{
			super(name);
		this.MaxSize=MaxSize;
		this.queue=buffer;
		}

	@Override
	public void run() {
		while(true)
		{
			synchronized(queue)
			{
				while(queue.isEmpty())
				{
					
					try {
						queue.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				Integer i=queue.peek();
				System.out.println("consuming value" +i);
				queue.remove();
				queue.notifyAll();
				
			}
		
			
		}
		
	}
	    
	    
}