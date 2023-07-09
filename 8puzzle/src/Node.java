/* This is Node as one instance of the puzzle*/

public class Node implements Comparable<Node>{
	Node Parent; //this is parent object which use tracking the value
	
	String ValueContians;//this string contain which postion of the number at the present instance
	int Function; // this is total value cost by operation till at that instance
	int Actualcost;//this is actual cost for efficient move
	
	//this is constructor
	public Node(Node Parent, String ValueContains, int Actualcost, int Function) {
		this.Parent = Parent;
		this.ValueContians = ValueContains;
		this.Actualcost = Actualcost;
		this.Function = Function;
	}
	//this method use for compare the function
	public int compareTo(Node node) {
		if(this.Function < node.Function)
			return -1;
		else
			return 1;
	}
	
}
