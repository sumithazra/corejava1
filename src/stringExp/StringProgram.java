package stringExp;

import java.util.*;
import java.util.Map.Entry;

public class StringProgram {

	static {

		System.out.println("Inside static block");

	}
	{
		System.out.println("Inside anonomiuys  block");
	}

	public static int slowLength(String myString) {
		int i = 0;
		try {
			while (true) {
				myString.charAt(i);
				i++;
			}

		} catch (ArithmeticException e) {
			System.out.println("Inside catch block");
			return i;
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Inside catch block");
			return i;
		} catch (Throwable e) {
			System.out.println("Inside catch block");
			return i;
		} finally {
			System.out.println("Inside finally bolck");
		}

	}

	static void removeDuplicates(String str)
	{

	String arr[]=str.split(" ");
	int size=arr.length;
	for(int i=0;i<size;i++)
	{
	for(int j=i+1;j<size;j++)
	{

	if(arr[i].equals(arr[j]))
	{
	arr[j]=arr[size-1];
	size--;
	}
	}
	}

	for(int a=0;a<size;a++)
	{
	System.out.print(arr[a]+" ");
	}

	}


	
	public static void getFirstNonRepeatedChar(String str) {
		Map<Character, Integer> counts = new LinkedHashMap<>(str.length());
		for (char c : str.toCharArray()) {
			counts.put(c, counts.containsKey(c) ? counts.get(c) + 1 : 1);
		}

		boolean flag = false;

		for (Entry<Character, Integer> entry : counts.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey());
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("didn't find any non repeated Character");

		}
		// throw new RuntimeException("didn't find any non repeated Character");

	}

	public static void stringReverse(String str) {
		char[] charArray = str.toCharArray();
		int length = charArray.length;
		int start = 0;
		int end = length - 1;
		while (start < end) {
			char temp = charArray[start];
			charArray[start] = charArray[end];
			charArray[end] = temp;

			start++;
			end--;
		}

		System.out.println("reverse String is :");
		for (int j = 0; j < length; j++) {
			System.out.print(charArray[j]);
		}

	}

	public static int convert_String_To_Number(String numStr) {

		char ch[] = numStr.toCharArray();
		int sum = 0;
		// get ascii value for zero
		int zeroAscii = (int) '0';
		System.out.println(zeroAscii);
		for (char c : ch) {
			int tmpAscii = (int) c;
			System.out.print(tmpAscii + " -");
			System.out.print(" [" + (tmpAscii - zeroAscii) + "]" + " -");
			sum = (sum * 10) + (tmpAscii - zeroAscii);
		}
		return sum;
	}

	public void DuplicatesInString() {

		String str1 = "British intelligence services have foiled seven terror attacks in the past six months in the United Kingdom while earlier response to such warning . had originated from the al-Qaeda and the area between Pakistan and Afghanistan, British Prime Minister";
		String[] stringArray = str1.split(" ");

		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		/*Set duplicatesset = new HashSet();

		for (int i = 0; i < stringArray.length; i++) {
			if (!duplicatesset.add(stringArray[i])) {
				if (hm.get(stringArray[i]) == null) {
					hm.put(stringArray[i], 2);
				} else {
					int frequency_counter = hm.get(stringArray[i]);
					hm.put(stringArray[i], (Integer) (frequency_counter + 1));

				}
			}
		

		} */
		
		for (int i = 0; i < stringArray.length; i++) {
			{
				int f = hm.get(stringArray[i]) == null ? 0 : hm
						.get(stringArray[i]);
				hm.put(stringArray[i], (hm.get(stringArray[i]) == null ? 1
						: (f + 1)));
			}
		}

		for (Map.Entry m : hm.entrySet()) {
			if ((Integer) m.getValue() > 1) {
				System.out.println(m.getKey() + " " + m.getValue());
			}
		}
	}

	static void frequenceyConatins(String tarStr, String mainStr) {

		char[] tarC = tarStr.toCharArray();
		char[] marC = mainStr.toCharArray();

		int counter = 0;
		int k = 0;
		if (tarC.length < marC.length) {
			for (int i = 0; i < marC.length; i++) {

				if (tarC[0] == marC[i]) {
					boolean flag = true;
					int j = 1;
					k = i + 1;
					while (flag && j < (tarC.length - 1)) {
						if (tarC[j] == marC[k]) {
							j++;
							k++;
						} else {
							flag = false;
						}
					}
					if (flag == true) {
						counter = counter + 1;
					}
					i = k;
				}

			}
	      System.out.println("The frequency of that tarGet charactersequnce is "+ counter);
		} 
		else {
	      System.out.println("target Character sequence is bigger that main String");
		}

	}

	void contains() {

		String st1 = "This world is beautiful. Its depends on individuals how u see that";
		String st2 = "ful.";

		char[] charArray_s = st1.toCharArray();

		char[] charArray_t = st2.toCharArray();

		int len = charArray_s.length - 1;

		if (len >= charArray_t.length) {
			for (int i = 0; i <= len; i++) {
				// System.out.println(charArray_s[i]);
				if ((charArray_s[i] == charArray_t[0])
						&& (charArray_t.length - 1 <= (len - i))) {
					boolean flag = true;
					int j = 1;
					int k = i + 1;

					while (flag && j <= charArray_t.length - 2) {
						if (charArray_s[k] != charArray_t[j]) {
							flag = false;

						} else {
							j++;
							k++;
						}

					}
					if (flag == true) {
						System.out
								.println("yes, The traget character Sequence is present in String");
						System.out
								.println("Index of matched character_sequence start at :"
										+ i);
						break;

					} else {
						System.out
								.println("That character sequnce is not present");
					}

				}

			}
		} else {
			System.out
					.println("That character sequnce is not present: Because the target character sequnce is getter than the source Character sequnce");
		}

	}

	static void findAllPalindrome(String input) {
		List<String> list = new ArrayList<String>();

		for (int i = 0; i < input.length(); i++) {

			for (int j = i + 1; j <= input.length(); j++) {

				String subStr = input.substring(i, j);
				//System.out.println(subStr);
				if (isPalindrome(subStr)) {
					if (subStr.length() > 1)
						list.add(subStr);

				}
			}
		}

		System.out.println(list);
		
		/* difference btw even and odd number palindrome string */

		Iterator it = list.iterator();
		int even = 0, odd = 0;
		while (it.hasNext()) {
			if ((((String) it.next()).length()) % 2 == 0) {
				even = even + 1;
			} else
				odd = odd + 1;
		}

		int number = (even - odd);
		int diff = number < 0 ? -number : number;

		System.out.printf("the difference between the even and odd number palindrome sub-string is : %d %n",diff);
		
		

		/* find the longest and smallest palindrome substring */
		Collections.sort(list, new Comparator() {
			public int compare(Object o1, Object o2) {
				return ((String) o1).compareTo((String) o2);
			}
		});
		System.out.printf("the smallest palindrome substring is : %s  %n",list.get(0));
		System.out.printf("the longest palindrome substring is : %s  %n",list.get(list.size() - 1));

	}

	static boolean isPalindrome(String str) {
		StringBuilder revStr = new StringBuilder(str);
		if (str.equals(revStr.reverse().toString())) {
			return true;
		} else
			return false;
	}

	
	static void spilit(String mainStr, String charStr) {

		String tempStr = mainStr;
		List<String> list = new ArrayList<String>();
		int inc = charStr.length();
		while (tempStr.indexOf(charStr) != -1) {
			int i = tempStr.indexOf(charStr);
			String subStr = tempStr.substring(0, i);
			list.add(subStr);
			tempStr = tempStr.substring(i + inc);

		}

		System.out.println(list);

	}
	
	
	public static void main(String[] args) {

		String str = "You can use a loop to check every character position"
				+ " and"
				+ " catch the IndexOutOfBoundsException when you pass the last character";

		System.out.println("The length of the string is ::"
				+ StringProgram.slowLength(str));

		System.out
				.println("*******************************************************");

		StringProgram.stringReverse(str);

		System.out.println("\n \n"+"-------------Remove Duplicates without using Collection API---------------");
		
		String duplicates="Oracle Google Informatica Facebook LinkedIn Microsoft Informatica";
		removeDuplicates(duplicates);
		
		System.out.println("\n");
		
		String str1 = "Oracle India : , Informatica, Morgan Stanley.";

		String[] str2 = str1.split("");
		System.out.println("");
		/*
		 * for(String str3:str2) {
		 * 
		 * System.out.print(str3); }
		 */
		String str44 = String.valueOf(str1.charAt(0));
		System.out.println(str2[12].equals(" "));
		System.out.println(str2[15]);
		str1.contains("jgjd");
		StringProgram stp = new StringProgram();
		stp.contains();
		stp.DuplicatesInString();

		String mainStr = "abcbbbabc";
		String tarGetStr = "abc";

		frequenceyConatins(tarGetStr, mainStr);

		System.out.println("------------FirstNonRepeatedCharacter------------------");
		StringProgram.getFirstNonRepeatedChar("abbbcakd");

		System.out.println("-------------------FindALL Palindrome-----------------");
		findAllPalindrome("aabbcb");

	}
}
