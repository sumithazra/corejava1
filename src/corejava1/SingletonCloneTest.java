package corejava1;

public class SingletonCloneTest implements Cloneable {

	
	private static SingletonCloneTest instance=null;
	
	private SingletonCloneTest()
	{
		System.out.println("Inside SingletonCloneTest default constructor");
	}
	
	public static SingletonCloneTest getInstance()
	{
		if(instance==null)
		{
			instance = new SingletonCloneTest();
			return instance;
			
		}
		else {
			return instance;			
		}
		
		
	}
	
	@Override
	protected Object clone()  {
		return instance;
	       // TODO Auto-generated method stub
        /*
         * Here forcibly throws the exception for preventing to be cloned
         */
        //throw new CloneNotSupportedException();
        // return super.clone();
	}
	
	
	/* @Override
	    protected Object clone() throws CloneNotSupportedException {

	        // TODO Auto-generated method stub
	        
	         * Here forcibly throws the exception for preventing to be cloned
	         
	        throw new CloneNotSupportedException();
	        // return super.clone();
	    }*/
	public static void main(String[] args) {
		
		
		SingletonCloneTest   test1 = SingletonCloneTest.getInstance();
			test1.toString();

	        try {
	        	SingletonCloneTest test2 = (SingletonCloneTest) test1.clone();
	        	test2.toString();
	        } catch (Exception e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
		
	}

}
