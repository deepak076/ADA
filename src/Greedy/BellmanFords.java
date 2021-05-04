package Greedy;

import java.util.Arrays;
import java.util.List;



public class BellmanFords {
	public static void main(String[] args) {
		
		Graph graph = new Graph(4,5);
		graph.addEdge(new Edge(0,1,5));
		graph.addEdge(new Edge(0,2,4));
		graph.addEdge(new Edge(1,3,3));
		graph.addEdge(new Edge(2,1,-6));
		graph.addEdge(new Edge(3,2,2));
		bellmanFord(graph, 0);
	}
	public static void bellmanFord(Graph graph, Integer start) {
		Integer[] distance = new Integer[graph.getVertices()];
		Arrays.fill(distance,  Integer.MAX_VALUE);
		distance[start] = 0;
		List<Edge> edge = graph.getList();
		for(Integer i = 0;i < graph.getVertices() - 1;i++) {
//			dist[v] > dist[u] + weight of edge uv
//			dis[graph[j][0]] + graph[j][2] <
//            dis[graph[j][1]])
			for(Integer j = 0;j < graph.getEdges();j++) {
				if(distance[edge.get(j).getSource()] + edge.get(j).getWeight() <
                        distance[edge.get(j).getDestination()]) {
					distance[edge.get(j).getDestination()] = distance[edge.get(j).getSource()] + edge.get(j).getWeight();
				}
			}
		}
		for(Integer j = 0;j < graph.getEdges();j++) {
			if(distance[edge.get(j).getSource()] + edge.get(j).getWeight() <
                    distance[edge.get(j).getDestination()]) {
				System.out.println("Graph Contains Negative Edge Cycle.");
			}
		}
		printShortestPath(start, distance);
	}
	public static void printShortestPath(Integer start,Integer[] distance) {
		System.out.println("The Shortest Path From Given Source.");
		for(Integer i = 0;i < distance.length;i++) {
			System.out.println(start+" to "+i+" = "+distance[i]);
		}
	}
}