package Thread;
class Node {
	int id;
			Node leftNode;
			Node rightNode;
			public Node(int itm ) {
			     id=itm;
				leftNode=rightNode=null;
				
			}

}

public class DSA{
	Node nodes;
	public Node insert(Node nodes, int id) {

		if (nodes == null) {

			nodes = new Node(id);
			return nodes;
		}
		if (id < nodes.id) {
			nodes.leftNode = insert(nodes.leftNode, id);
		} else if (id > nodes.id) {
			nodes.rightNode = insert(nodes.rightNode, id);
		}
		return nodes; 
	}
	private int height(Node node) {
		if (node == null)
			return 0;
		return 1 + height(node.leftNode) + (height(node.rightNode));
}
	private boolean isbalance(Node node) {
		if (node == null)
			return true;// empty also balanced
		int lhs = height(node.leftNode);
		int rhs = height(node.rightNode);

		if (Math.abs(lhs + rhs) > 1)  // gretaer than 1 , is unbalanced
			return false;
				return isbalance(node.leftNode) && isbalance(node.rightNode);
	}
	
	
	public static void main(String[] args) {
		DSA dsa=new DSA();
	/*	dsa.nodes=dsa.insert(dsa.nodes, 10);
		dsa.nodes=dsa.insert(dsa.nodes, 10);
		//dsa.nodes=dsa.insert(dsa.nodes, 5);
		dsa.nodes=dsa.insert(dsa.nodes, 10);
		//dsa.nodes=dsa.insert(dsa.nodes, 10);
	
		if(dsa.isbalance(dsa.nodes)) {
			System.out.println("balanced");
		}else {
			System.out.println("unbalanced");
		}
		*/
		
		dsa.nodes=new Node(10);
		dsa.nodes.leftNode=new Node(5);
		dsa.nodes.rightNode=new Node(6);
		dsa.nodes.leftNode.leftNode=new Node(5);
		dsa.nodes.leftNode.rightNode=new Node(8);
		dsa.nodes.rightNode.rightNode=new Node(2	);
		dsa.nodes.rightNode.leftNode=new Node(2	);
		if(dsa.isbalance(dsa.nodes)) {
			System.out.println("balanced");
		}else {
			System.out.println("inbalanced");
		}
		
		
	}
	
	
	

}
