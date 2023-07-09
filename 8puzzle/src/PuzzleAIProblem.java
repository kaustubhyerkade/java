import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

public class PuzzleAIProblem {
	int TotalCost; //this is value after the pattern get
	String Goalstate;//this is goalstate which we want to achive
	String InputString;//this is input string from which we need to achive the goal state
	PriorityQueue<Node> Queue; //this is priroty queue which use comparable method of node class
	Set<String> CheckForDuplication;//this set use for making various type of possible pattern
	int left, right, up, down;//this is direction, in which we need to move
	int NumberOfIteration;
	//this is constructor
	
	public PuzzleAIProblem(String Goalstate, String InputString) {
		this.InputString = InputString;
		this.Goalstate = Goalstate;
		this.Queue = new PriorityQueue<>();
		this.CheckForDuplication = new HashSet<>();
		this.TotalCost = TotalCost;
		this.left = 0;
		this.up = 0;
		this.down = 0;
		this.NumberOfIteration = 0;
	}
	
	//this is for printing the final result in recursive form
	public void printresult(Node node){
		if(node == null)
			return;
		printresult(node.Parent);
		System.out.print("->"+node.ValueContians);
	}
	
	public int GiveIndex(char[] arr) {
		int index = 0;
		for(int i = 0; i < 9; i++) {
			if(arr[i] == '0') {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public int CalucateHeriustc(String cal) {
		int h = 0;
		for(int i = 0; i < 9; i++) {
			if(cal.charAt(i) == Goalstate.charAt(i))
				h = h + 0;
			else
				h = h + 1;
		}
		return h;
	}
	
	public int GiveNumberOfMoves(int index) {
		int num = 0;
		switch(index) {
			case 0:
				num = 2;
				left = 1;
				right = 0;
				up = 1;
				down = 0;
				break;
			case 1:
				num = 3;
				left = 1;
				right = 1;
				up = 1;
				down = 0;
				break;
			case 2:
				num = 2;
				left = 0;
				right = 1;
				up = 1;
				down = 0;
				break;
			case 3:
				num = 3;
				left = 1;
				right = 0;
				up = 1;
				down = 1;
				break;
			case 4:
				num = 4;
				left = 1;
				right = 1;
				up = 1;
				down = 1;
				break;
			case 5:
				num = 3;
				left = 0;
				right = 1;
				up = 1;
				down = 1;
				break;
			case 6:
				num = 2;
				left = 1;
				right = 0;
				up = 0;
				down = 1;
				break;
			case 7:
				num = 3;
				left = 1;
				right = 1;
				up = 0;
				down = 1;
				break;
			case 8:
				num = 2;
				left = 0;
				right = 1;
				up = 0;
				down = 1;
				break;
		}
		return num;
	}
	
	public void MakeChild(char[] arr, Node getnode) {
		String s =new String(arr);
		if(CheckForDuplication.contains(s)) {
			return;
		}
		CheckForDuplication.add(s);
		int g = getnode.Actualcost + 1;
		int h = CalucateHeriustc(s);
		//System.out.println(h);
		//System.out.println(s);
		int f = g + h;
		Node node = new Node(getnode, s, g, f);
		Queue.add(node);
	}
	
	public void PossibleCombination(Node getnode, int index) {
		int moves = GiveNumberOfMoves(index);
		for(int i = 0; i < moves; i++) {
			char[] temp = getnode.ValueContians.toCharArray();
			if(left == 1) {
				char c = temp[index];
				temp[index] = temp[index + 1];
				temp[index + 1] = c;
				left = 0;
				MakeChild(temp, getnode);
				continue;
			}
			if(right == 1) {
				char c = temp[index];
				temp[index] = temp[index - 1];
				temp[index - 1] = c;
				right = 0;
				MakeChild(temp, getnode);
				continue;
			}
			if(up == 1) {
				char c = temp[index];
				temp[index] = temp[index + 3];
				temp[index + 3] = c;
				up = 0;
				MakeChild(temp, getnode);
				continue;
			}
			if(down == 1) {
				char c = temp[index];
				temp[index] = temp[index - 3];
				temp[index - 3] = c;
				down = 0;
				MakeChild(temp, getnode);
				continue;
			}

		}
	}
	
	public void MakeChanges() {
		//this.NumberOfIteration++;
		if(Queue.isEmpty()) {
			System.out.println("Move Cannot Possible");
			return;
		}
		Node getnode = Queue.remove();
		if(getnode.ValueContians.equals(Goalstate)) {
			TotalCost = getnode.Actualcost;
			printresult(getnode);
			return;
		}
		int index = GiveIndex(getnode.ValueContians.toCharArray());
		PossibleCombination(getnode, index);
		MakeChanges();
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		PuzzleAIProblem Obj = new PuzzleAIProblem(sc.next(), sc.next());
		Node node = new Node(null, Obj.InputString, 0, 0);
		Obj.Queue.add(node);
		Obj.CheckForDuplication.add(Obj.InputString);
		Obj.MakeChanges();
		System.out.println( );
		System.out.println("->" + Obj.TotalCost);
	}
}
