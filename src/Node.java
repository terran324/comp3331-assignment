import java.util.ArrayList;


public class Node implements Comparable<Node>{
	private String name;
	private int minDistace = 2000000; 
	//This is the minimum distance it takes to move from the origin node to the current node.
	//Use 2,147,483,647 to represent infinity. (We cannot reach this node directly.)
	//Biggest int in java is that anyway.
	private Node prev;
	
	//private ArrayList<Edge> edges;
	
	public Node(String name) {
		this.name = name;
		//edges = new ArrayList<Edge>();
	}
	
	public String getName() {
		return name;
	}
	
	/*public void addEdge(Edge e){
		edges.add(e);
	}*/
	
	/*public ArrayList<Edge> getEdges() {
		return edges;
	}*/
	
	public Node getPrev(){
		return prev;
	}
	
	public void setMinDist(int dist){
		minDistace = dist;
	}
	
	public int getMinDist(){
		return minDistace;
	}
	
	public void setPrev(Node prev){
		this.prev = prev;
	}

	@Override
	public int compareTo(Node other) {
		return Integer.compare(minDistace, other.minDistace);
	}
}