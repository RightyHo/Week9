public class IntegerTreeNode {
	private int value;
	private IntegerTreeNode left;
	private IntegerTreeNode right;

	public IntegerTreeNode(int value){
		this.value = value;
		left = null;
		right = null;
	}
	public void add(int newNumber){
		if(newNumber > this.value){
			if(right == null){
				right = new IntegerTreeNode(newNumber);
			} else {
				right.add(newNumber);
			}
		} else {
			if(left == null){
				left = new IntegerTreeNode(newNumber);
			} else {
				left.add(newNumber);
			}
		}
	}
	public boolean contains(int n){
		if(n == this.value){
			return true;
		} else if(n > this.value){
			if(right == null){
				return false;
			} else {
				return right.contains(n);
			}
		} else {
			if(left == null){
				return false;
			} else {
				return left.contains(n);
			}
		}
	}
	//returns the maximum value stored in the tree
	public int getMax(){
		int result = this.value;
		if(right == null){
			return this.value;
		} else {
			return right.getMax();
		}
	}
	//returns the minimum value stored in the tree
	public int getMin(){
			int result = this.value;
			if(left == null){
				return this.value;
			} else {
				return left.getMin();
			}
	}
	// return a representation of your tree in String form
	public String toString(){
		String result = "[" + String.valueOf(this.value);
		if(left == null){
			result = result + " L[]";
		} else {
			result = result + " L" + left.toString();
		}
		if(right == null){
			result = result + " R[]";
		} else {
			result = result + " R" + right.toString() + "]";
		}
		return result;
	}
		// return a simplified representation of your tree in String form
	public String simpleToString(){
		String result = "[" + String.valueOf(this.value);
		if(left != null){
			result = result + left.simpleToString();
		}
		if(right != null){
			result = result + right.simpleToString() + "]";
		}
		return result;
	}
	public int depth(){
		int temp1 = 0,temp2 = 0;
		if(left != null){
			temp1 =  left.depth() + 1;
		}
		if(right != null){
			temp2 = right.depth() + 1;
		}
		return (temp1 > temp2) ? temp1 : temp2;
	}
}