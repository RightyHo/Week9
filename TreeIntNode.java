public class TreeIntNode {
	private int value;	
	private TreeIntNode left;
	private TreeIntNode right;

	public TreeIntNode(int value){
		this.value = value;
		left = null;
		right = null;	
	}
	public int getValue(){
		return this.value;
	}
	public TreeIntNode getLeft(){
		return left;
	}
	public TreeIntNode getRight(){
		return right;
	}
	public void setValue(int value){
		this.value = value;
	}
	public void setLeft(TreeIntNode newNode){
		left = newNode;
	}
	public void setRight(TreeIntNode newNode){
		right = newNode;
	}

}