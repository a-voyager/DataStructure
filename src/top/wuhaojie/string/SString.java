package top.wuhaojie.string;

public interface SString {
	/**
	 * 
	 * @return ���ش��ĳ���
	 */
	int length();

	/**
	 * @param index
	 * @return ���ش������Ϊindex���ַ�
	 */
	char charAt(int index);

	/**
	 * @param str
	 * @return ���ص�ǰ����str���������ɵ��´�
	 */
	SString concat(SString str);

	/**
	 * @param begin
	 * @param end
	 * @return ���ش����ַ���Ŵ�begin��end-1���ִ�
	 */
	SString substring(int begin, int end);

	/**
	 * @param pattern
	 * @return ����pattern���������еĵ�һ��ƥ��λ��
	 */
	int indexOf(SString pattern);

}
