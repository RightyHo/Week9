public interface IntSet {
	//adds a new int to the set; if it is there already, nothing happens
	void add(int x);
	//returns true if the number is in the set, false otherwise
	boolean contains(int x);
	//returns the same values as the former method, but for every element
	// that is checked prints its value on screen
	boolean containsVerbose(int x);
	//returns a string with the values of the elements in the set separated by commas
	String toString();
}