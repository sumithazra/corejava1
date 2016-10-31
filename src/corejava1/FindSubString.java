package corejava1;

public class FindSubString {

	public static void main(String[] args) {
		
		String s1="Hello . world";
		String s2="world";
		boolean flag=false;
		String[] str =s1.split(" ");
		for(int i=0; i<=str.length-1; i++)
		{
			if(str[i].equals(s2))
			{
				flag=true;
				break;
			}	
		}
		if(flag)
		{
			System.out.println("Found the word in the given string");
		}
		else
		{
			System.out.println("Not Found the word in the given String ");
		}
	}	
	
}
