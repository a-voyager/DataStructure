package top.wuhaojie.string;

/**
 * 判断标识符 标识符是由字母开头的字母数字串，字母包含下划线_和符号$，此定义包含关键字。
 * 本例用于判断指定字符串是否符合标识符的语法，在判断过程中不会改变指定字符串。
 * 
 * @author wuhaojie
 *
 */
public class Identifier {
	public static boolean isIdentifier(String str) {
		if (str != null && str.length() > 0) {
			char ch = str.charAt(0);
			if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' || ch == '_'
					|| ch == '$') {
				for (int i = 0; i < str.length(); i++) {
					ch = str.charAt(i);
					if (!(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z'
							|| ch == '_' || ch == '$' || ch >= '0' && ch <= '9'))
						return false;
				}
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		String str = "_name1";
		System.out.println(isIdentifier(str));
	}

}
