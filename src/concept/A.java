package concept;

public class A {
	
	
	
	{
	System.out.println("Inside annonomouys block");	
	
	}
	
	static {
		
		System.out.println("Static block ");
	}
	A()
	{
		System.out.println("Inside Constructor of Class A");
		
	}
	public void methodA()
	{
	Integer a=10;
	Employee e=new Employee(10);
	StringBuilder sb=new StringBuilder("25");
	
	methodB(sb);
	System.out.print(sb);
	methodC(e);
	System.out.println(e);
	}
	public void methodB(StringBuilder sb)
	{
		sb.append("50");
		
	}
	
	public void methodC(Employee e)
	{
		e.setAge(4);
		
	}
	
	public void methodC(Integer i)
	{
		i=50;
		
	}
	public static void main(String[] args) {
		A a=new A();
		A b=new A();	
	
		a.methodA();
	}
}
class Employee
{
	int age;
	
	Employee(int age)
	{
		this.age=age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString()
	{
		
		return "Employee age :"+ String.valueOf(this.age);
	}
	
}