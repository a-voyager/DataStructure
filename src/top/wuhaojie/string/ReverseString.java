package top.wuhaojie.string;

/**
 * ´®µÄÄæ×ª
 * 
 * @author wuhaojie
 *
 */
public class ReverseString {

	public static StringBuffer reverse(String str) {
		StringBuffer temp = new StringBuffer(str.length());
		for (int i = str.length() - 1; i >= 0; i--)
			temp.append(str.substring(i, i + 1));
		return temp;
	}

	public static void main(String[] args) {
		String str = "abcd";
		System.out.println(reverse(str));
	}

}
