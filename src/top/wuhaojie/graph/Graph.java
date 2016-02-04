package top.wuhaojie.graph;

/**
 * 描述图抽象数据类型接口
 * 
 * @author wuhaojie
 *
 */
public interface Graph<E> {
	/**
	 * @return 顶点数
	 */
	int vertexCount();

	/**
	 * @param i
	 *            顶点Vi
	 * @return 顶点Vi的数据元素
	 */
	E get(int i);

	/**
	 * 插入一个顶点
	 * 
	 * @param vertex
	 *            顶点元素
	 * @return 插入顶点是否成功
	 */
	boolean insertVertex(E vertex);

	/**
	 * 插入一条边
	 * 
	 * @param i
	 *            顶点i
	 * @param j
	 *            顶点j
	 * @param weight
	 *            权值
	 * @return 插入边是否成功
	 */
	boolean insertEdge(int i, int j, int weight);

	/**
	 * 移除顶点及其关联的边
	 * 
	 * @param v
	 *            顶点的序号
	 * @return 移除顶点是否成功
	 */
	boolean removeVertex(int v);

	/**
	 * 移除边
	 * 
	 * @param i
	 *            顶点Vi
	 * @param j
	 *            顶点Vj
	 * @return 移除边是否成功
	 */
	boolean removeEdge(int i, int j);

	/**
	 * 获取顶点的第一个邻接顶点的序号
	 * 
	 * @param v
	 *            顶点序号v
	 * @return 第一个邻接顶点的序号
	 */
	int getFirstNeighbor(int v);

	/**
	 * 下一个邻接顶点
	 * 
	 * @param v
	 *            初始顶点v
	 * @param w
	 *            顶点索引
	 * @return v在w后的下一个邻接顶点的序号
	 */
	int getNextNeighbor(int v, int w);

}
