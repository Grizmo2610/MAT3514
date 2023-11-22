package Hw8_21000709_HoangTuanTu.excercise01;

import java.util.Iterator;

public interface Graph<E> {
	int numVertices();
	Iterable<Vertex<E>> vertices();

	int numEdges();
	Iterable<Edge<E>> edges();

	Edge<E> getEdge(Vertex<E> u, Vertex<E> v);

	Vertex<E>[] endVertices(Edge<E> e);

	Vertex<E> opposite(Vertex<E> v, Edge<E> e);

	int outDegree(Vertex<E> v);
	int inDegree(Vertex<E> v);

	Iterable<Edge<E>> outgoingEdges(Vertex<E> v);
	Iterable<Edge<E>> incomingEdges(Vertex<E> v);

	Vertex<E> insertVertex(E element);

	Edge<E> insertEdge(Vertex<E> u, Vertex<E> v, E element);

	void removeVertex(Vertex<E> v);

	void removeEdge(Edge<E> e);
}
