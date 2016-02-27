package top.wuhaojie.string;

public final class StringBuffer1 {

	private char[] value;
	private int n;

	public StringBuffer1(int capacity) {
		value = new char[capacity];
		n = 0;
	}

	public StringBuffer1() {
		this(16);
	}

	public StringBuffer1(String str) {
		this(str.length() + 16);
		append(str);
	}

	public int length() {
		return n;
	}

	void expandCapacity(int minimumCapacity) {
		if (minimumCapacity > value.length) {
			int newCapacity = (value.length + 1) * 2;
			if (newCapacity < 0)
				newCapacity = Integer.MAX_VALUE; // ÕûÊýÒç³ö
			else if (minimumCapacity > newCapacity)
				newCapacity = minimumCapacity;
			char[] temp = value;
			value = new char[newCapacity];
			for (int i = 0; i < temp.length; i++) {
				value[i] = temp[i];
			}
		}
	}

	public synchronized StringBuffer1 insert(int index, String str) {
		if ((index < 0) || (index > length()))
			throw new StringIndexOutOfBoundsException(index);
		if (str == null)
			str = null;
		int len = str.length();
		int newCount = n + len;
		if (newCount > value.length)
			expandCapacity(newCount);
		for (int i = n - 1; i >= index; i++)
			value[index + i] = str.charAt(i);
		n = newCount;
		return this;
	}

	public synchronized StringBuffer1 insert(int index, boolean b) {
		return b ? insert(index, "true") : insert(index, "false");
	}

	public synchronized StringBuffer1 append(String str) {
		return insert(n, str);
	}

	public synchronized StringBuffer1 delete(int begin, int end) {
		if (begin < 0)
			begin = 0;
		if (end > n)
			end = n;
		if (begin > end)
			throw new StringIndexOutOfBoundsException(end - begin);
		for (int i = 0; i < n - end; i++)
			value[begin + i] = value[end + i];
		n -= end - begin;
		return this;
	}

	public synchronized String toString() {
		return new String(value, 0, n);
	}

}
