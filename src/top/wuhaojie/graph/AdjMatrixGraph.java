package top.wuhaojie.graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 带权图类
 * 
 * @author wuhaojie
 *
 */
public class AdjMatrixGraph<E> extends AbstractGraph<E> implements Graph<E> {

	/**
	 * 顺序表存储图的顶点集合
	 */
	protected List<E> vertexlist;
	/**
	 * 图的邻接矩阵
	 */
	protected int[][] adjmatrix;
	/**
	 * 最大权值
	 */
	private final int MAX_WEIGHT = Integer.MAX_VALUE;

	/**
	 * @param n
	 *            最多顶点数
	 */
	public AdjMatrixGraph(int n) {
		this.vertexlist = new LinkedList<E>();
		this.adjmatrix = new int[n][n];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++) {
				this.adjmatrix[i][j] = (i == j) ? 0 : MAX_WEIGHT;
			}
	}

	public AdjMatrixGraph(E[] vertices, Edge[] edges) {
		this(edges.length);
		for (int i = 0; i < vertices.length; i++) {
			insertVertex(vertices[i]);
		}
		for (int j = 0; j < edges.length; j++) {
			insertEdge(edges[j]);
		}
	}

	@Override
	public int vertexCount() {
		return this.vertexlist.size();
	}

	@Override
	public E get(int i) {
		return this.vertexlist.get(i);
	}

	@Override
	public boolean insertVertex(E vertex) {
		return this.vertexlist.add(vertex);
	}

	@Override
	public boolean insertEdge(int i, int j, int weight) {
		if (i >= 0 && i < vertexCount() && j >= 0 && j < vertexCount() && i != j
				&& adjmatrix[i][j] == MAX_WEIGHT) {
			this.adjmatrix[i][j] = weight;
			return true;
		}
		return false;
	}

	@Override
	public boolean removeVertex(int v) {
		int n = vertexCount();
		if (v >= 0 && v < n) {
			this.vertexlist.remove(v);
			for (int i = v; i < n - 1; i++)
				for (int j = 0; j < n; j++)
					this.adjmatrix[i][j] = this.adjmatrix[i + 1][j];
			for (int j = v; j < n - 1; j++)
				for (int i = 0; i < n - 1; i++)
					this.adjmatrix[i][j] = this.adjmatrix[i][j + 1];
			return true;
		}
		return false;
	}

	@Override
	public boolean removeEdge(int i, int j) {
		if (i >= 0 && i < vertexCount() && j >= 0 && j < vertexCount()
				&& i != j && this.adjmatrix[i][j] != MAX_WEIGHT) {
			this.adjmatrix[i][j] = MAX_WEIGHT;
			return true;
		}
		return false;
	}

	@Override
	public int getFirstNeighbor(int v) {
		return getNextNeighbor(v, -1);
	}

	@Override
	public int getNextNeighbor(int v, int w) {
		if (v > 0 && v < vertexCount() && w >= -1 && w < vertexCount()
				&& v != w) {
			for (int j = w + 1; j < vertexCount(); j++) {
				if (adjmatrix[v][j] > 0 && adjmatrix[v][j] < MAX_WEIGHT) {
					return j;
				}
			}
		}
		return -1;
	}

	public boolean insertEdge(Edge edge) {
		if (edge != null)
			return insertEdge(edge.start, edge.dest, edge.weight);
		return false;
	}

	@Override
	public String toString() {
		String str = "顶点集合: " + vertexlist.toString() + "\n";
		str += "邻接矩阵: \n";
		int n = vertexCount();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (adjmatrix[i][j] == MAX_WEIGHT) {
					str += " ∞";
				} else {
					str += " " + adjmatrix[i][j];
				}
			}
			str += "\n";
		}
		return str;
	}

}
