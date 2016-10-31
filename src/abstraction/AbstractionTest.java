package abstraction;

abstract class Bike{  
   Bike(){System.out.println("bike is created");}  
   abstract void run();  
   void changeGear(){System.out.println("gear changed");}  
 }  
  
 class Honda extends Bike{  
 void run(){System.out.println("running safely..");}  
 }  
 class AbstractionTest{  
 public static void main(String args[]){  
 // Bike bike=new Bike();  not possible to instantiation of Abstract  class
  Bike obj = new Honda();  
  obj.run();  
  obj.changeGear();  
 }  
}  
