package Hw8_21000709_HoangTuanTu.excercise01;

public class Edge<E> {
	private Vertex<E>[] endpoints;
	private E element;

	public Edge(Vertex<E> u, Vertex<E> v, E element) {
		this.endpoints = (Vertex<E>[]) new Vertex[]{u, v};
		this.element = element;
	}

	public E getElement() {
		return element;
	}

	public Vertex<E>[] getEndVertices() {
		return endpoints;
	}
}
