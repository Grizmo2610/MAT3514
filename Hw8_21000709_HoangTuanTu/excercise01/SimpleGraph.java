package Hw8_21000709_HoangTuanTu.excercise01;

import java.util.*;

import java.util.ArrayList;
import java.util.List;

public class SimpleGraph<E> implements Graph<E> {

	private List<Vertex<E>> vertices;
	private List<Edge<E>> edges;

	public SimpleGraph() {
		vertices = new ArrayList<>();
		edges = new ArrayList<>();
	}

	@Override
	public int numVertices() {
		return vertices.size();
	}

	@Override
	public Iterable<Vertex<E>> vertices() {
		return vertices;
	}

	@Override
	public int numEdges() {
		return edges.size();
	}

	@Override
	public Iterable<Edge<E>> edges() {
		return edges;
	}

	@Override
	public Edge<E> getEdge(Vertex<E> u, Vertex<E> v) {
		for (Edge<E> edge : edges) {
			if ((edge.getEndVertices()[0] == u && edge.getEndVertices()[1] == v)
					|| (edge.getEndVertices()[0] == v && edge.getEndVertices()[1] == u)) {
				return edge;
			}
		}
		return null;
	}

	@Override
	public Vertex<E>[] endVertices(Edge<E> e) {
		return e.getEndVertices();
	}

	@Override
	public Vertex<E> opposite(Vertex<E> v, Edge<E> e) {
		Vertex<E>[] endpoints = e.getEndVertices();
		if (v == endpoints[0]) {
			return endpoints[1];
		} else if (v == endpoints[1]) {
			return endpoints[0];
		} else {
			throw new IllegalArgumentException("Vertex is not incident to this edge.");
		}
	}

	@Override
	public int outDegree(Vertex<E> v) {
		int count = 0;
		for (Edge<E> edge : edges) {
			if (edge.getEndVertices()[0] == v || edge.getEndVertices()[1] == v) {
				count++;
			}
		}
		return count;
	}

	@Override
	public int inDegree(Vertex<E> v) {
		return outDegree(v); // For an undirected graph, inDegree is the same as outDegree.
	}

	@Override
	public Iterable<Edge<E>> outgoingEdges(Vertex<E> v) {
		List<Edge<E>> outgoing = new ArrayList<>();
		for (Edge<E> edge : edges) {
			if (edge.getEndVertices()[0] == v || edge.getEndVertices()[1] == v) {
				outgoing.add(edge);
			}
		}
		return outgoing;
	}

	@Override
	public Iterable<Edge<E>> incomingEdges(Vertex<E> v) {
		return outgoingEdges(v); // For an undirected graph, incomingEdges is the same as outgoingEdges.
	}

	@Override
	public Vertex<E> insertVertex(E element) {
		Vertex<E> vertex = new Vertex<>(element);
		vertices.add(vertex);
		return vertex;
	}

	@Override
	public Edge<E> insertEdge(Vertex<E> u, Vertex<E> v, E element) {
		Edge<E> edge = new Edge<>(u, v, element);
		edges.add(edge);
		return edge;
	}

	@Override
	public void removeVertex(Vertex<E> v) {
		vertices.remove(v);
		// Remove incident edges
		edges.removeIf(edge -> edge.getEndVertices()[0] == v || edge.getEndVertices()[1] == v);
	}

	@Override
	public void removeEdge(Edge<E> e) {
		edges.remove(e);
	}
}
