public class TreeIntSortedList implements IntSortedList {
	TreeIntNode head;

	public TreeIntSortedList(){
		head = null;
	}
	//adds a new int to the list so that the list remains sorted; a list can ontain duplicates unlike a set.
	public void add(int x){
		TreeIntNode newNode = new TreeIntNode(x);
		TreeIntNode focusNode = head;
		if(head == null){
			head = newNode;
		} else {
			boolean foundLocation = false;
			while(!foundLocation){
				if(focusNode.getValue() == x){
					newNode.setRight(focusNode.getRight());
					focusNode.setRight(newNode);
					foundLocation = true;
				} else if(focusNode.getValue() < x){
					if(focusNode.getRight() == null){
						focusNode.setRight(newNode);
						foundLocation = true;
					} else {
						focusNode = focusNode.getRight();
					}
				} else {
					if(focusNode.getLeft() == null){
						focusNode.setLeft(newNode);
						foundLocation = true;
					} else {
						focusNode = focusNode.getLeft();
					}
				}
			}
		}
	}

	//returns true if the number is in the list, false otherwise.
	public boolean contains(int x){
		TreeIntNode focusNode = head;
		if(focusNode == null){
			return false;
		} else {
			boolean foundLocation = false;
			while(!foundLocation){
				if(focusNode.getValue() == x){
					return true;
				} else if(focusNode.getValue() < x){
					if(focusNode.getRight() == null){
						return false;
					} else {
						focusNode = focusNode.getRight();
					}
				} else {
					if(focusNode.getLeft() == null){
						return false;
					} else {
						focusNode = focusNode.getLeft();
					}
				}
			}
		}
		return false;
	}

	//returns a string with the values of the elements in the list separated by commas.
	public String toString(){
		String result = "";
		if(head == null){
			return result;
		} else {
			return traverseTree(head);
		}
	}
		
	public String traverseTree(TreeIntNode focus){
		String result = ""; 									//maybe protect against null pointer?
		result += String.valueOf(focus.getValue()) + ",";
		if(focus.getLeft() != null){
			result += traverseTree(focus.getLeft());
		}
		if(focus.getRight() != null){
			result += traverseTree(focus.getRight());
		}
		return result;	
	}
}