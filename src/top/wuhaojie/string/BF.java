package top.wuhaojie.string;

/**
 * Brute-Force模式匹配算法实现
 * 
 * @author wuhaojie
 *
 */
public class BF {
	private static int count = 0;

	public static int indexOf(String target, String pattern, int start) {
		if (target != null && pattern != null && pattern.length() > 0
				&& target.length() >= pattern.length()) {
			int i = start, j = 0;
			count = 0;
			while (i <= target.length() - pattern.length()) {
				if (target.charAt(i + j) == pattern.charAt(j))
					j++;
				else {
					i++;
					j = 0;
				}
				count++;
				if (j == pattern.length())
					return i;
			}
		}
		return -1;
	}

	public static int indexOf(String target, String pattern) {
		return indexOf(target, pattern, 0);
	}

	public static void main(String[] args) {
		String target = "abbabaaba", pattern = "aba";
		System.out.println(indexOf(target, pattern));
		System.out.println(count);

	}

}
