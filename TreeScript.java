public class TreeScript {
	public static void main(String[] args){
		TreeScript ts = new TreeScript();
		ts.launch();
	}
	public void launch(){
		IntegerTreeNode rootNode = new IntegerTreeNode(31);
		rootNode.add(44);
		rootNode.add(13);
		rootNode.add(7);
		rootNode.add(55);
		rootNode.add(63);
		rootNode.add(18);
		if(rootNode.contains(55)){
			System.out.println("This tree contains the number 55!  CORRECT!");
		} else {
			System.out.println("This tree DOES NOT contain the number 55!  INCORRECT");
		}
		if(rootNode.contains(9)){
			System.out.println("This tree contains the number 9!  INCORRECT");
		} else {
			System.out.println("This tree DOES NOT contain the number 9!  CORRECT");
		}
		System.out.println("The largest value in the tree is " + rootNode.getMax());
		System.out.println("The smallest value in the tree is " + rootNode.getMin());
		System.out.println(rootNode.toString());
		System.out.println(rootNode.simpleToString());
	}
}