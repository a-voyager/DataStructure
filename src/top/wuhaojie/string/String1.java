package top.wuhaojie.string;

public class String1 {
	private final char[] value;

	public String1() {
		this.value = new char[0];
	}

	public String1(char[] value) {
		this.value = new char[value.length];
		for (int i = 0; i < value.length; i++)
			this.value[i] = value[i];
	}

	public String1(String1 str) {
		this(str.value);
	}

	public int length() {
		return this.value.length;
	}

	public char charAt(int index) {
		if ((index < 0) || (index >= this.value.length))
			throw new StringIndexOutOfBoundsException(index);
		return this.value[index];
	}

	public String toString() {
		return new String(this.value);
	}

	public String1 concat(String1 str) {
		if (str == null || str.length() == 0)
			return this;
		char[] buffer = new char[this.value.length + str.length()];
		int i;
		for (i = 0; i < this.value.length; i++)
			buffer[i] = this.value[i];
		for (int j = 0; j < str.value.length; j++)
			buffer[i + j] = str.value[j];
		return new String1(buffer);
	}

}
