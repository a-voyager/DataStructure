package top.wuhaojie.string;

public class ReplaceString {
	public static String replace(String source, String sub, String replacement) {
		int i = BF.indexOf(source, sub, 0);
		if (i != -1)
			return source.substring(0, i) + replacement
					+ source.substring(i + sub.length());
		return source;
	}

	public static String replaceAll(String source, String sub,
			String replacement) {
		int i = BF.indexOf(source, sub, 0);
		while (i != -1) {
			source = source.substring(0, i) + replacement
					+ source.substring(i + sub.length());
			i = BF.indexOf(source, sub, i + 1);
		}
		return source;
	}

	public static void main(String[] args) {
		String source = "abbabaaba", pattern = "aba", replacement = "xy";
		System.out.println(replace(source, pattern, replacement));
		System.out.println(replaceAll(source, pattern, replacement));
	}

}
