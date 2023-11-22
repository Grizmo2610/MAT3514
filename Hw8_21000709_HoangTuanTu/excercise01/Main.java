package Hw8_21000709_HoangTuanTu.excercise01;

public class Main {
	public static void main(String[] args) {
		Graph<String> graph = new SimpleGraph<>();

		// Thêm đỉnh
		Vertex<String> v1 = graph.insertVertex("A");
		Vertex<String> v2 = graph.insertVertex("B");
		Vertex<String> v3 = graph.insertVertex("C");

		// Thêm cạnh
		Edge<String> e1 = graph.insertEdge(v1, v2, "Edge1");
		Edge<String> e2 = graph.insertEdge(v2, v3, "Edge2");

		// Truy vấn
		System.out.println("Number of vertices: " + graph.numVertices()); // Output: 3
		System.out.println("Number of edges: " + graph.numEdges());       // Output: 2

		System.out.println("Outgoing edges from A: " + graph.outgoingEdges(v1)); // Output: [Edge1]
		System.out.println("Incoming edges to B: " + graph.incomingEdges(v2));   // Output: [Edge1, Edge2]

		// Xóa đỉnh
		graph.removeVertex(v2);

		System.out.println("Number of vertices after removal: " + graph.numVertices()); // Output: 2
		System.out.println("Number of edges after removal: " + graph.numEdges());       // Output: 1
	}
}
