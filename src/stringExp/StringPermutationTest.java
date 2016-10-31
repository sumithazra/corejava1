package stringExp;

import java.util.*;

public class StringPermutationTest {

	public static void main(String[] args) {
		String s = "ABC";
		List<String> list=permutation(s);
		System.out.println(list);
		
		
		String str="Hello world";
		System.out.println(reverseString(str));
	}

	public static List<String> permutation(String str) {
		return permutation("", str);
	}

	private static List<String> permutation(String prefix, String str) {
		//String result="";
		List<String> results = new LinkedList();
		int n = str.length();
		if (n == 0)
		{
			//System.out.println(prefix);
			 results.add(prefix);
		     return results;
		}
		else{
			for (int i = 0; i < n; i++)
				{
				results.addAll(permutation(prefix + str.charAt(i),str.substring(0, i) + str.substring(i + 1, n)));
				}
			return results;
		      }
	}

	
	public static boolean isAnagram(String word, String anagram) {
		if (word.length() != anagram.length()) {
			return false;
		}
		char[] chars = word.toCharArray();
		for (char c : chars) {
			int index = anagram.indexOf(c);
			if (index != -1) {
				anagram = anagram.substring(0, index)
						+ anagram.substring(index + 1, anagram.length());
			} else {
				return false;
			}
		}
		return anagram.isEmpty();
	}
	
	
	public static boolean iAnagram(String word, String anagram) {
		char[] charFromWord = word.toCharArray();
		char[] charFromAnagram = anagram.toCharArray();
		Arrays.sort(charFromWord);
		Arrays.sort(charFromAnagram);
		return Arrays.equals(charFromWord, charFromAnagram);
	}
	
	public static String removeRecursive(String word, char ch) {
		int index = word.indexOf(ch);
		if (index == -1) {
			return word;
		}
		return removeRecursive(
				word.substring(0, index)
						+ word.substring(index + 1, word.length()), ch);
	}
	
	
	 public static String reverseString(String str){
         
	        if(str.length() == 1){
	            return str;
	        } else {
	        	String reverse="";
	            reverse += str.charAt(str.length()-1)
	                    +reverseString(str.substring(0,str.length()-1));
	            return reverse;
	        }
	    }
	
	
}
