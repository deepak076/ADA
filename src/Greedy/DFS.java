package Greedy;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Stack;

public class DFS {

	public static void main(String[] args) {
		Graph graph = new Graph(7,24);
		graph.addEdge(new Edge(0,1,1));
		graph.addEdge(new Edge(0,3,1));
		graph.addEdge(new Edge(1,0,1));
		graph.addEdge(new Edge(1,2,1));
		graph.addEdge(new Edge(1,3,1));
		graph.addEdge(new Edge(1,5,1));
		graph.addEdge(new Edge(1,6,1));
		graph.addEdge(new Edge(2,1,1));
		graph.addEdge(new Edge(2,3,1));
		graph.addEdge(new Edge(2,4,1));
		graph.addEdge(new Edge(2,5,1));
		graph.addEdge(new Edge(3,4,1));
		graph.addEdge(new Edge(3,2,1));
		graph.addEdge(new Edge(3,0,1));
		graph.addEdge(new Edge(3,1,1));
		graph.addEdge(new Edge(4,2,1));
		graph.addEdge(new Edge(4,3,1));
		graph.addEdge(new Edge(4,6,1));
		graph.addEdge(new Edge(5,1,1));
		graph.addEdge(new Edge(5,2,1));
		graph.addEdge(new Edge(5,6,1));
		graph.addEdge(new Edge(6,1,1));
		graph.addEdge(new Edge(6,4,1));
		graph.addEdge(new Edge(6,5,1));
		LinkedHashSet<Integer> list = dfsTraversal(graph.getAdjancencyMatrix(),0);
		System.out.println(list);
	}
	public static LinkedHashSet<Integer> dfsTraversal(Integer[][] adjancencyMatrix, Integer start){
		LinkedHashSet<Integer> DFS = new LinkedHashSet<>();
		Boolean[] visited = new Boolean[adjancencyMatrix.length];
        Arrays.fill(visited, false);
		Stack<Integer> stack = new Stack<>();
		stack.push(start);// In my Case 0
		visited[start] = true;
		DFS.add(start);
		while(!stack.isEmpty()) {
			System.out.println("-->"+stack);
			Integer value = stack.peek();
			visited[value] = true;
			Boolean flag  = true;
			
			for(Integer i = 0;i < adjancencyMatrix.length;i++) {
				if(adjancencyMatrix[value][i] == 1 && (!visited[i])) {
					DFS.add(i);
					stack.push(i);
					flag = false;
					break;
				}
			}
			if(flag == true) {
				stack.pop();
			}
		}
		return DFS;
	}

}