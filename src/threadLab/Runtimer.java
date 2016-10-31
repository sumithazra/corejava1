package threadLab;

import java.io.IOException;

public class Runtimer {

	public static void main(String[] args) {
		 /* try {
			//Runtime.getRuntime().exec("notepad");//will open a new notepad  
			  Runtime r=Runtime.getRuntime();
			int i=r.availableProcessors();//singleton class 
			System.out.println(i);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		  
		final String[] array={"One", "Two"};
            array[0]="three";
            System.out.println(array[0]);*/
            
            Thread t = Thread.currentThread();
            System.out.println("Current thread: " + t);
         // change the name of the thread 
            t.setName("My Thread"); 
            System.out.println("After name change: " + t); 
            try { 
            for(int n = 5; n > 0; n--) { 
            System.out.println(n); 
            Thread.sleep(1000); 
            } 
            } catch (InterruptedException e) { 
            System.out.println("Main thread interrupted"); 
            }
            
            
           try {
			Thread.currentThread().join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
            
        System.out.println("Join method called in Main thread");   
           
            
	}

}
