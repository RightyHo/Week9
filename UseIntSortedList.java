public class UseIntSortedList {
	public static void main(String[] args){
		UseIntSortedList uISL = new UseIntSortedList();
		uISL.launch();
	}
	public void launch(){
		IntSortedList tISL = new TreeIntSortedList();
		IntSortedList lISL = new ListIntSortedList();
		tISL.add(15);
		tISL.add(19);
		tISL.add(33);		
		tISL.add(42);
		tISL.add(4);
		tISL.add(28);
		tISL.add(19);	
		tISL.add(9);	
		tISL.add(16);
		tISL.add(42);		
		tISL.add(88);				
		if(tISL.contains(17)){
			System.out.println("This tree contains the number 17 - FALSE");
		} else {
			System.out.println("This tree DOES NOT contain the number 17 - TRUE");
		}
		if(tISL.contains(28)){
			System.out.println("This tree contains the number 28 - TRUE");
		} else {
			System.out.println("This tree DOES NOT contain the number 28 FALSE");
		}
		if(tISL.contains(88)){
			System.out.println("This tree contains the number 88 - TRUE");
		} else {
			System.out.println("This tree DOES NOT contain the number 88 FALSE");
		}
		System.out.println(tISL.toString());	
		
		lISL.add(15);
		lISL.add(19);
		lISL.add(33);		
		lISL.add(42);
		lISL.add(4);
		lISL.add(28);
		lISL.add(19);	
		lISL.add(9);	
		lISL.add(16);
		lISL.add(42);		
		lISL.add(88);				
		if(lISL.contains(17)){
			System.out.println("Linked List Version: This tree contains the number 17 - FALSE");
		} else {
			System.out.println("Linked List Version: This tree DOES NOT contain the number 17 - TRUE");
		}
		if(lISL.contains(28)){
			System.out.println("Linked List Version: This tree contains the number 28 - TRUE");
		} else {
			System.out.println("Linked List Version: This tree DOES NOT contain the number 28 FALSE");
		}
		if(lISL.contains(88)){
			System.out.println("Linked List Version: This tree contains the number 88 - TRUE");
		} else {
			System.out.println("Linked List Version: This tree DOES NOT contain the number 88 FALSE");
		}
		System.out.println(lISL.toString());	
	}
}