package top.wuhaojie.graph;

/**
 * ���������ĳ�����
 * 
 * @author wuhaojie
 *
 * @param <E>
 */
public abstract class AbstractGraph<E> implements Graph<E> {
	public abstract int vertexCount();

	public abstract E get(int i);

	public abstract int getFirstNeighbor(int i);

	public abstract int getNextNeighbor(int i, int j);

	/**
	 * ���������������
	 * 
	 * @param v
	 *            ������ʼ����
	 */
	public void DFSTraverse(int v) {
		boolean[] visited = new boolean[vertexCount()];
		int i = v;
		do {
			if (!visited[i]) {
				System.out.print("{");
				depthfs(i, visited);
				System.out.print("}");
			}
			i = (i + 1) % vertexCount();
		} while (i != v);
		System.out.println();
	}

	private void depthfs(int v, boolean[] visited) {
		System.out.print(this.get(v) + " ");
		visited[v] = true;
		int w = getFirstNeighbor(v);
		while (w != -1) {
			if (!visited[w])
				depthfs(w, visited);
			w = getNextNeighbor(v, w);
		}
	}
}
