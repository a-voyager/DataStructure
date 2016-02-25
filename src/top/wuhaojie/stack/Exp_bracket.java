package top.wuhaojie.stack;

public class Exp_bracket {
	/**
	 * �жϱ��ʽ�е�Բ�����Ƿ�ƥ��
	 * 
	 * @param expstr
	 * @return
	 */
	public static String isValid(String expstr) {
		LinkedStack<String> linkedStack = new LinkedStack<>();
		int i = 0;
		while (i < expstr.length()) {
			char ch = expstr.charAt(i);
			i++;
			switch (ch) {
			case '(':
				linkedStack.push(ch + "");
				break;
			case ')':
				if (linkedStack.isEmpty() || !"(".equals(linkedStack.pop()))
					return "need ')'";
				break;
			}
		}
		if (linkedStack.isEmpty())
			return "match";
		else
			return "need ')'";
	}

	public static void main(String[] args) {
		String s = "((2*5)+556)(";
		System.out.println(isValid(s));
	}

}
