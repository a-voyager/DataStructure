package top.wuhaojie.string;

/**
 * �жϱ�ʶ�� ��ʶ��������ĸ��ͷ����ĸ���ִ�����ĸ�����»���_�ͷ���$���˶�������ؼ��֡�
 * ���������ж�ָ���ַ����Ƿ���ϱ�ʶ�����﷨�����жϹ����в���ı�ָ���ַ�����
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
