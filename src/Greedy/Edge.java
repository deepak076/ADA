package Greedy;

public class Edge {
	private Integer source;
	private Integer destination;
	private Integer weight;
	public Edge(Integer source, Integer destination, Integer weight) {
		this.source = source;
		this.destination = destination;
		this.weight = weight;
	}
	public Integer getSource() {
		return source;
	}
	public void setSource(Integer source) {
		this.source = source;
	}
	public Integer getDestination() {
		return destination;
	}
	public void setDestination(Integer destination) {
		this.destination = destination;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Edge [source=" + source + ", destination=" + destination + ", weight=" + weight + "]";
	}
}