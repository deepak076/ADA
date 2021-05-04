package Greedy;

import java.util.ArrayList;
import java.util.List;

public class Graph {
	private Integer vertices;
	private Integer edges;
	private List<Edge> list;
	public Graph(Integer vertices, Integer edges) {
		super();
		this.vertices = vertices;
		this.edges = edges;
		this.list = new ArrayList<>();
	}
	public Integer[][] getAdjancencyMatrix(){
		Integer[][] arr = new Integer[vertices][vertices];
		for(Integer i = 0;i < vertices;i++) {
			for(Integer j = 0;j < vertices;j++) {
				arr[i][j] = 0;
			}
		}
		for(Integer i = 0;i < list.size();i++) {
			Edge temp = list.get(i);
			arr[temp.getSource()][temp.getDestination()] = temp.getWeight();
		}
		return arr;
	}
	public Integer getVertices() {
		return vertices;
	}
	public void setVertices(Integer vertices) {
		this.vertices = vertices;
	}
	public Integer getEdges() {
		return edges;
	}
	public void setEdges(Integer edges) {
		this.edges = edges;
	}
	public List<Edge> getList() {
		return list;
	}
	public void setList(List<Edge> list) {
		this.list = list;
	}
	public void addEdge(Edge edge) {
		list.add(edge);
	}
}