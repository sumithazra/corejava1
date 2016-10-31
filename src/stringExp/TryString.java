package stringExp;

import java.util.ArrayList;
import java.util.List;

public class TryString {
public static void main(String[] args) {
	String str="0123456789";
	int length=str.length();
	System.out.println(length);
	
	System.out.println(str.substring(0));
	System.out.println(str.substring(5,9));
	System.out.println(str.substring(6));
	
	String str1="0273gsy073hd s0";
	
	System.out.println(str1.charAt(6));
	char[] sarr=str1.toCharArray();
	StringBuilder nuStr=new StringBuilder();
	StringBuilder chStr=new StringBuilder();
	
	for (int i = 0; i < sarr.length; i++) {
		if(sarr[i]>='0' && sarr[i]<='9')
		{
			nuStr.append(sarr[i]);
		}
		else
		{
			chStr.append(sarr[i]);
		}
		
	}
	
	String restr=nuStr.toString()+chStr.toString();
	
	System.out.println(restr);
	
	System.out.println("---------Trying to Spilit--------------");
	TryString.spilit("1110222033304440", "0");
	
	System.out.println("\n"+"Checking ....@1 ");
	System.out.println('b'-'a');
	getMaxOccuringChar("test");
	
}
static void spilit(String mainStr, String charStr) {

	String tempStr = mainStr;
	List<String> list = new ArrayList<String>();
	int inc = charStr.length();
	while (tempStr.indexOf(charStr) != -1) {
		int i = tempStr.indexOf(charStr);
		String subStr = tempStr.substring(0, i);
		list.add(subStr);
		tempStr = tempStr.substring(i+inc);
		//System.out.println(tempStr);
	}

	System.out.println(list);

}


public static char getMaxOccuringChar(String str)
{
	 // Create array to keep the count of individual
    // characters and initialize the array as 0
    int count[]=new int[10];
 
    // Construct character count array from the input
    // string.
    int len = str.length();
    for (int i=0; i<len; i++)
        count[str.charAt(i)]++;
 
    int max = -1;  // Initialize max count
    char result = 0;   // Initialize result
 
    for (int i = 0; i < count.length; i++) {
		
    	System.out.println(count[i]);
	}
    
    // Traversing through the string and maintaining
    // the count of each character
    for (int i = 0; i < len; i++) {
        if (max < count[str.charAt(i)]) {
            max = count[str.charAt(i)];
            result = str.charAt(i);
        }
    }
 
    return result;
	
	
}





}




