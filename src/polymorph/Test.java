package polymorph;

/* Java program to show that if static methods are redefined by
a derived class, then it is not overriding but hidding. */

//Superclass
class Base {
  
 // Static method in base class which will be hidden in subclass 
 public static void display() {
     System.out.println("Static or class method from Base");
 }
  
  // Non-static method which will be overridden in derived class 
  protected  void print()  {
      System.out.println("Non-static or Instance method from Base");
 }
 /* public void taker(int i, int k)
  {
	  System.out.println(i+10*k);
  } */
  
  public void taker(long i, int k)
  {
	  System.out.println(i+k);
  }
}

//Subclass
class Derived extends Base {
  
 // Static is removed here (Causes Compiler Error) 
/* public void display() {
     System.out.println("Non-static method from Derived");
 }*/
  
 // Static is added here (Causes Compiler Error) 
/* public static void print() {
     System.out.println("Static method from Derived");
}*/
	 protected void print()  {
	      System.out.println("Non-static or Instance method from Derived");
	 }
	
}
public class Test{
public static void main(String args[ ])  {
	Derived obj1 = (Derived) new Base();
     
    // As per overriding rules this should call to class Derive's static 
    // overridden method. Since static method can not be overridden, it 
    // calls Base's display() 
    obj1.display();  
     
    // Here overriding works and Derive's print() is called 
    obj1.print();     
    obj1.taker(10, 10);
 }
}