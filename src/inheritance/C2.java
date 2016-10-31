package inheritance;

class A
{
	public int a=10;
	public static void display()
	{System.out.println("Inside A's method");}

	// change the visibility and check the child class accessibility
	protected void parentMethod()
	{
		System.out.println("Inside parent method");
	}
}
class C1 extends A
{ 
	C1(){
		
	}
	public static void display()
	{System.out.println("Inside C1's method");}


}

public class C2 extends C1 {
	
	C2(){
		 
		/*C1 cc1=new C1();
		cc1.display();*/
		
	}
	public static void display()
	{System.out.println("Inside C2's method");}

	public static void main(String[] args) {
	
		//C2 cc2=(C2) new C1();
		// a1=cc2;
		//a1.display();
	//	cc2.display();
		
		
		
		/*C1 cc1=new C2();
		cc1.display();*/
		
		//A a=(C1)new C2();
		A a=new C2();
		a.display();
		
	//	C2 cc1=(C2)new A();
		A aa2=new C2();
	System.out.println("Object reference varibale is of type A , But instance is of type C2");
	aa2.display();
		//C2 cc2=(C2) aa1;
		C2 cc2=new  C2();
		cc2.display();
		/*if (obj instanceof MountainBike) {
		    MountainBike myBike = (MountainBike)obj;
		}*/
	  	System.out.println(cc2.a);
		 
	  	cc2.parentMethod();

	}
	

	
	
}
