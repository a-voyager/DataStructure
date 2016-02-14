package top.wuhaojie.graph;

/**
 * ≤‚ ‘Õº3
 * 
 * @author wuhaojie
 *
 */
public class WeightedUndiGraph3 {

	public static void main(String[] args) {
		String[] vertices = { "A", "B", "C", "D", "E" };
		Edge edges[] = { new Edge(0, 1, 5), new Edge(0, 3, 2),
				new Edge(1, 0, 5), new Edge(1, 2, 7), new Edge(1, 3, 6),
				new Edge(2, 1, 7), new Edge(2, 3, 8), new Edge(2, 4, 3),
				new Edge(3, 0, 2), new Edge(3, 1, 6), new Edge(3, 2, 8),
				new Edge(3, 4, 9), new Edge(4, 2, 3), new Edge(4, 3, 9) };
		AdjMatrixGraph<String> graph = new AdjMatrixGraph<>(vertices, edges);

		// ≤‚ ‘Ω®¡¢Õº
		System.out.println(graph.toString());

		// ≤‚ ‘…æ≥˝∂•µ„°¢±ﬂ
		// System.out.println(graph.toString());
		// graph.removeVertex(2);
		// System.out.println(graph.toString());
		// graph.removeEdge(2, 3);
		// graph.removeEdge(3, 2);
		// System.out.println(graph.toString());

		// ≤‚ ‘…Ó∂»”≈œ»±È¿˙
		for (int i = 0; i < graph.vertexCount(); i++) {
			graph.DFSTraverse(i);
		}
	}

}
