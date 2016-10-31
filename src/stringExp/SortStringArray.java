package stringExp;

/**
 * This class contain program to sort string # Alphabetically
 * @author Sumit Hazra
 */
public class SortStringArray {
	public static void main(String args[]) {
		String temp = new String("tree");
		String str[] = new String[] { "krishna", "zsai", "az", "laddu", "c",
				"ab", "zaaa", "a", "java", "JSP" };

		for (int i = 0; i < str.length; i++) {

			for (int j = i + 1; j < (str.length); j++) {
				if (myStrCmp(str[i], str[j]) == 1){
				//if ((str[i].compareToIgnoreCase(str[j])) > 0) {
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}

	public static int myStrCmp(String a, String b) {

		int len = 0;

		if (b.length() <= a.length())
			len = b.length();
		else
			len = a.length();

		int r = 0;
		for (int i = 0; i < len; i++) {

			if (a.charAt(i) > b.charAt(i)) {
				r = 1;
				break;
			}
			if (a.charAt(i) < b.charAt(i)) {
				r = -1;
				break;
			} else {
				continue;
			}
		}
		return r;
	}
}
