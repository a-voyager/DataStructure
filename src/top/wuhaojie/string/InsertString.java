package top.wuhaojie.string;

public class InsertString {
	public static String insert(String source, int index, String str) {
		return source.substring(0, index) + source.substring(index);
	}

	public static String delete(String source, int begin, int end) {
		return source.substring(0, begin) + source.substring(end);
	}

	public static void main(String[] args) {
		String str = "abcd";
		System.out.println(insert(str, 1, "xyz"));
		System.out.println(delete(str, 1, 2));
	}
}
