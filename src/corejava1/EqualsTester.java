package corejava1;

public class EqualsTester {

	public static void main(String[] args) {
		Integer i1=10;
        Integer i2=10;
        
        
        if(i1==i2)
        {
        	System.out.println("same ");
        	
        }
        else
        {
        	System.out.println("not same");
        }
        
        String st1=new String("hello");
       // String st2=new String("hello");
        String st2="hello";
        String st3="hello";
        String st4= new String("hello");
        if(st3==st4)
        {
        	System.out.println("same");
        }
        else
        {
        	System.out.println("not same");
        }
        
        
	}

}
