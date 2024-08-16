package part1.bootcamp.difficult;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

//Write a program to find the shortest path in a weighted graph using Dijkstra's algorithm in Java.
/*
 * Dijkstra's algorithm to find the shortest path in a weighted graph involves 
 * maintaining a priority queue (min-heap) to efficiently retrieve the next vertex with the 
 * smallest distance, and updating distances to adjacent vertices as shorter paths are found.
 */
/* We have 2 methods for the implementation of Dijkstra's algorithm in Java:
 * 1. Using Adjacency Matrix
 * 2. Using Priority Queue
 */

//Class to represent a graph node with edges and weights
class GraphNode {
	int vertex;
	int weight;

	public GraphNode(int vertex, int weight) {
		this.vertex = vertex;
		this.weight = weight;
	}
}

//Class to represent the graph and perform Dijkstra's algorithm
public class Program_10_Dijkstra_Algorithm {

	public static void main(String[] args) {
		
		int V = 5; // Number of vertices (0, 1, 2, 3, 4)
		int source = 0; // Source vertex

		Program_10_Dijkstra_Algorithm graph = new Program_10_Dijkstra_Algorithm(V);

		// Add edges with weights to the graph
		graph.addEdge(0, 1, 2);
		graph.addEdge(0, 2, 4);
		graph.addEdge(1, 2, 1);
		graph.addEdge(1, 3, 7);
		graph.addEdge(2, 4, 3);
		graph.addEdge(3, 4, 1);
		
/*		
		0--- (2)---1
		|        / |
		|       /  |
		(4)   /    (7)
		|   /(1)   |
		| /        |
		2          3
		 \       /
  	   (3)\     /(1) 
		   \   /
		     4 
 */
		// Perform Dijkstra's algorithm from source vertex
		graph.dijkstra(source);

	}

	private int V; // Number of vertices
	private List<List<GraphNode>> graph; // Adjacency list representation of the graph

	public Program_10_Dijkstra_Algorithm(int V) {
		this.V = V;
		this.graph = new ArrayList<>(V);

		// Initialize adjacency list for each vertex
		for (int i = 0; i < V; i++) {
			graph.add(new ArrayList<>());
		}
	}

	// Method to add an edge to the graph
	public void addEdge(int source, int destination, int weight) {
		graph.get(source).add(new GraphNode(destination, weight));
	}

	// Method to perform Dijkstra's algorithm to find shortest paths from source vertex
	public void dijkstra(int source) {
		// Priority queue (min-heap) to store vertices and their distances
		PriorityQueue<GraphNode> pq = new PriorityQueue<>(Comparator.comparingInt(node -> node.weight));

		// Distance array to store shortest distances from source to each vertex
		int[] dist = new int[V];
		Arrays.fill(dist, Integer.MAX_VALUE);
		dist[source] = 0; // Distance from source to itself is 0

		// Add source vertex to the priority queue
		pq.offer(new GraphNode(source, 0));

		while (!pq.isEmpty()) {
			// Extract the vertex with the smallest distance
			int u = pq.poll().vertex;

			// Iterate through all adjacent vertices of u
			for (GraphNode neighbor : graph.get(u)) {
				int v = neighbor.vertex;
				int weight = neighbor.weight;

				// Relaxation step
				if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) {
					dist[v] = dist[u] + weight;
					pq.offer(new GraphNode(v, dist[v])); // Update priority queue with new distance
				}
			}
		}

		// Print shortest distances from source vertex
		System.out.println("Shortest distances from source vertex " + source + ":");
		for (int i = 0; i < V; i++) {
			System.out.println("Vertex " + i + ": " + dist[i]);
		}
	}

}
