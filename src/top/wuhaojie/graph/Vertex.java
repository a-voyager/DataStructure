package top.wuhaojie.graph;

import java.util.LinkedList;
import java.util.List;

/**
 * 顶点表元素类
 * 
 * @author wuhaojie
 *
 */
public class Vertex<E> {
	public E data;
	public List<Edge> adjlink;

	public Vertex(E data, List<Edge> adjlink) {
		this.data = data;
		this.adjlink = adjlink;
	}

	public Vertex(E data) {
		this(data, new LinkedList<Edge>());
	}

	@Override
	public String toString() {
		return this.data.toString();
	}

}
