package top.wuhaojie.stack;

public class Expression {
	/**
	 * 
	 * @param expstr
	 * @return 后缀表达式
	 */
	public static String toPostfix(String expstr) {
		LinkedStack<String> stack = new LinkedStack<>();
		String postfix = "";
		int i = 0;
		while (i < expstr.length()) {
			char ch = expstr.charAt(i);
			switch (ch) {
			case '+':
			case '-':
				while (!stack.isEmpty() && !stack.get().equals("("))
					postfix += stack.pop();
				stack.push(ch + "");
				i++;
				break;
			case '*':
			case '/':
				while (!stack.isEmpty()
						&& (stack.get().equals("*") || stack.get().equals("/")))
					postfix += stack.pop();
				stack.push(ch + "");
				i++;
				break;
			case '(':
				stack.push(ch + "");
				i++;
				break;
			case ')':
				String out = stack.pop();
				while (out != null && !out.equals("(")) {
					postfix += out;
					out = stack.pop();
				}
				i++;
				break;
			default:
				while (ch >= '0' && ch <= '9') {
					postfix += ch;
					i++;
					if (i < expstr.length())
						ch = expstr.charAt(i);
					else
						ch = '=';
				}
				postfix += " ";
				break;
			}
		}
		while (!stack.isEmpty())
			postfix += stack.pop();
		return postfix;
	}

	public static int value(String postfix) {
		LinkedStack<Integer> stack = new LinkedStack<>();
		int i = 0, result = 0;
		while (i < postfix.length()) {
			char ch = postfix.charAt(i);
			if (ch >= '0' && ch <= '9') {
				result = 0;
				while (ch != ' ') {
					result = result * 10 + Integer.parseInt(ch + "");
					i++;
					ch = postfix.charAt(i);
				}
				i++;
				stack.push(new Integer(result));
			} else {
				int y = stack.pop().intValue();
				int x = stack.pop().intValue();
				switch (ch) {
				case '+':
					result = x + y;
					break;
				case '-':
					result = x - y;
					break;
				case '*':
					result = x * y;
					break;
				case '/':
					result = x / y;
					break;
				}
				stack.push(new Integer(result));
				i++;
			}
		}
		return stack.pop().intValue();
	}

	public static void main(String[] args) {
		String expstr = "5*5+12/6+2*(6+4)+3";
		String postfix = toPostfix(expstr);
		int value = value(postfix);
		System.out.println("原式: " + expstr);
		System.out.println("后缀表达式: " + postfix);
		System.out.println("答案: " + value);
	}

}
