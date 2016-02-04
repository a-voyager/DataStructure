package top.wuhaojie.graph;

/**
 * ����ͼ�����������ͽӿ�
 * 
 * @author wuhaojie
 *
 */
public interface Graph<E> {
	/**
	 * @return ������
	 */
	int vertexCount();

	/**
	 * @param i
	 *            ����Vi
	 * @return ����Vi������Ԫ��
	 */
	E get(int i);

	/**
	 * ����һ������
	 * 
	 * @param vertex
	 *            ����Ԫ��
	 * @return ���붥���Ƿ�ɹ�
	 */
	boolean insertVertex(E vertex);

	/**
	 * ����һ����
	 * 
	 * @param i
	 *            ����i
	 * @param j
	 *            ����j
	 * @param weight
	 *            Ȩֵ
	 * @return ������Ƿ�ɹ�
	 */
	boolean insertEdge(int i, int j, int weight);

	/**
	 * �Ƴ����㼰������ı�
	 * 
	 * @param v
	 *            ��������
	 * @return �Ƴ������Ƿ�ɹ�
	 */
	boolean removeVertex(int v);

	/**
	 * �Ƴ���
	 * 
	 * @param i
	 *            ����Vi
	 * @param j
	 *            ����Vj
	 * @return �Ƴ����Ƿ�ɹ�
	 */
	boolean removeEdge(int i, int j);

	/**
	 * ��ȡ����ĵ�һ���ڽӶ�������
	 * 
	 * @param v
	 *            �������v
	 * @return ��һ���ڽӶ�������
	 */
	int getFirstNeighbor(int v);

	/**
	 * ��һ���ڽӶ���
	 * 
	 * @param v
	 *            ��ʼ����v
	 * @param w
	 *            ��������
	 * @return v��w�����һ���ڽӶ�������
	 */
	int getNextNeighbor(int v, int w);

}
