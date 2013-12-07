public class UseIntSortedList {
	public static void main(String[] args){
		UseIntSortedList uISL = new UseIntSortedList();
		uISL.launch();
	}
	public void launch(){
		IntSortedList tISL = new TreeIntSortedList();
//		IntSet lIS = new ListIntSet();
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
//		lIS.add(15);
//		lIS.add(19);
//		lIS.add(33);		
//		lIS.add(42);
//		lIS.add(4);
//		lIS.add(28);	
//		lIS.add(9);	
//		lIS.add(16);		
//		lIS.add(88);
//		if(lIS.contains(17)){
//			System.out.println("LIST VERSION:  This tree contains the number 17 - FALSE");
//		} else {
//			System.out.println("LIST VERSION:  This tree DOES NOT contain the number 17 - TRUE");
//		}
//		if(lIS.contains(28)){
//			System.out.println("LIST VERSION:  This tree contains the number 28 - TRUE");
//		} else {
//			System.out.println("LIST VERSION:  This tree DOES NOT contain the number 28 FALSE");
//		}
//		if(lIS.contains(88)){
//			System.out.println("LIST VERSION:  This tree contains the number 88 - TRUE");
//		} else {
//			System.out.println("LIST VERSION:  This tree DOES NOT contain the number 88 FALSE");
//		}
//		System.out.println(lIS.toString());
	}
}