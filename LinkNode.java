public class LinkNode {
	private int value;	
	private LinkNode next;
	private LinkNode previous;

	public LinkNode(int value){
		this.value = value;
		next = null;
		previous = null;	
	}
	public int getValue(){
		return this.value;
	}
	public LinkNode getPrevious(){
		return previous;
	}
	public LinkNode getNext(){
		return next;
	}
	public void setValue(int value){
		this.value = value;
	}
	public void setPrevious(LinkNode newNode){
		previous = newNode;
	}
	public void setNext(LinkNode newNode){
		next = newNode;
	}

}