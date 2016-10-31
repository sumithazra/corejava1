package stringExp;

public class StringProgramlab {
	
	public void  SwapTwoStringWithoutUsingVaraible ( ){
	    String a="delhi";
	    String b="dehradun";
	    a= a+b;
	    b = a.substring(0,(a.length()-b.length())); 
	    a = a.substring(b.length(),(a.length()));
	    System.out.println("a = "+a);
	    System.out.println("b = "+b);
	    }
	
public static void main(String[] args) {
	
}
}
