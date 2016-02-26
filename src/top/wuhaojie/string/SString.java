package top.wuhaojie.string;

public interface SString {
	/**
	 * 
	 * @return 返回串的长度
	 */
	int length();

	/**
	 * @param index
	 * @return 返回串中序号为index的字符
	 */
	char charAt(int index);

	/**
	 * @param str
	 * @return 返回当前串与str串连接生成的新串
	 */
	SString concat(SString str);

	/**
	 * @param begin
	 * @param end
	 * @return 返回串中字符序号从begin至end-1的字串
	 */
	SString substring(int begin, int end);

	/**
	 * @param pattern
	 * @return 返回pattern串在主串中的第一次匹配位置
	 */
	int indexOf(SString pattern);

}
