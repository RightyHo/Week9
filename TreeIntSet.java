public class TreeIntSet implements IntSet {
	private int value;
	private TreeIntSet left;
	private TreeIntSet right;

	public TreeIntSet(int value){
		this.value = value;
		left = null;
		right = null;

	//adds a new int to the set; if it is there already, nothing happens
	public void add(int x){
		if(x > this.value){
			if(right == null){
				right = new IntegerTreeNode(x);
			} else {
				right.add(x);
			}
		} else if( x < this.value){
			if(left == null){
				left = new IntegerTreeNode(x);
			} else {
				left.add(x);
			}
		}
	}
	//returns true if the number is in the set, false otherwise
	boolean contains(int x);
	//returns the same values as the former method, but for every element
	// that is checked prints its value on screen
	boolean containsVerbose(int x);
	//returns a string with the values of the elements in the set separated by commas
	String toString();
}