public class ListIntSortedList implements IntSortedList {
	private LinkNode head;
	
	public ListIntSortedList(){
		head = null;
	}
	//adds a new int to the list so that the list remains sorted; a list can 	
	//contain duplicates unlike a set.
	public void add(int x){
		LinkNode newNode = new LinkNode(x);
		if(head == null){
			head = newNode;
		} else if(head.getValue() == x){
			newNode.setNext(head.getNext());
			head.setNext(newNode);
		} else if(head.getValue() > x){
			newNode.setNext(head);
			head = newNode;
		} else {
			LinkNode addAfterThis = findLocation(x,head);
			newNode.setNext(addAfterThis.getNext());
			addAfterThis.setNext(newNode);
		}
		
	}

	//returns true if the number is in the list, false otherwise.
	public boolean contains(int x){
		LinkNode focusNode = head;
		if(focusNode == null){
			return false;
		} else {
			boolean foundLocation = false;
			while(!foundLocation){
				if(focusNode.getValue() == x){
					return true;
				} else if(focusNode.getValue() < x){
					if(focusNode.getNext() == null){
						return false;
					} else {
						focusNode = focusNode.getNext();
					}
				} else {
					return false;
				}
			}
			return false;
		}
	}

	//returns a string with the values of the elements in the list separated by commas.
	public String toString(){
		String result = "";
		LinkNode focusNode = head;
		if(focusNode == null){
			return result;
		} else {
			result = String.valueOf(focusNode.getValue()); 
			while(focusNode.getNext() != null){
				result +=  "," + String.valueOf(focusNode.getNext().getValue());
				focusNode = focusNode.getNext();
			}
		}
		return result;
	}
	public LinkNode findLocation(int x,LinkNode focusNode){
		if(focusNode.getNext() == null){
			return focusNode;
		} else if(x == focusNode.getNext().getValue()){
			return focusNode.getNext();
		} else if(x > focusNode.getNext().getValue()){
			return findLocation(x,focusNode.getNext());
		} else {
			return focusNode;
		}
	}
}