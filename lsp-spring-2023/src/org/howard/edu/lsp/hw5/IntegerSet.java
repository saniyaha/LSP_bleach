package org.howard.edu.lsp.hw5;

import java.util.*; //for ArrayList<>()

/*
 * 
 * @author Saniya
 *
 */
public class IntegerSet { 

	List<Integer> int_set; // A List to hold the integers in the set
	
	
	public IntegerSet() {
		int_set = new ArrayList<Integer>();
	}
	
	// Constructor that initializes the List
	public class IntegerSetException extends Exception { 
	
		public IntegerSetException(String error) {
			super(error);
		}
	}
	
	
	//this method returns the current set as a list of integers
	public List<Integer> get_set() {
		return int_set;
	}
	
	
	public void set_set(List<Integer> new_set) {
		int_set = new_set;
	}
	
	//clears the current set
	public void clear() {
		int_set.clear();
	}
	
//returns the number of elements in the current set
	public int length() {
		return int_set.size();
	}
	
	
	public boolean equals(IntegerSet a) {
		//if they have different lengths they cannot be equal
		if (int_set.size() != a.length()) {
			return false;
		}
		//if they have equal lengths check if all elements are the same
		else {
			return int_set.containsAll(a.int_set);
		}
	}
	
	
	public boolean contains(int value) {
		return int_set.contains(value);
	}
	
	
	public int largest() throws IntegerSetException {
		//if the set is empty, throws an exception saying so
		if (int_set.isEmpty()) {
			throw new IntegerSetException("The Set is Empty.");
		}
		//search through the set and find the largest integer
		else {
			//set our comparison to something in the set already
			int large = int_set.get(0);
			//iterate through the set and compare the values to large
			for (int i = 0; i < int_set.size(); i++) {
				//set large to the large integer if found
				if (int_set.get(i) > large) {
					large = int_set.get(i);
				}
			}
			return large;
		}
	}
	
	public int smallest() throws IntegerSetException {
		//if the set is empty, throws an exception saying so
		if (int_set.isEmpty()) {
			throw new IntegerSetException("The Set is Empty.");
		}
		//search through the set and find the smallest integer
		else {
			//set our comparison to something in the set already
			int small = int_set.get(0);
			//iterate through the set and compare the values to small
			for (int i = 0; i < int_set.size(); i++) {
				//set small to the smallest integer if found
				if (int_set.get(i) < small) {
					small = int_set.get(i);
				}
			}
			return small;
		}
	}
	
//adds an integer to 
	public void add(int item) {
		if (int_set.contains(item) == false) {
			int_set.add(item);
		}
	}
	

	public void remove(int item) {
		if (int_set.contains(item) == true) {
			int_set.remove(int_set.indexOf(item));
		}
	}
	
	
	public void union(IntegerSet b) {
		for (int i = 0; i < b.length(); i++) {
			if (int_set.contains(b.int_set.get(i)) == false) {
				int_set.add(b.int_set.get(i));
			}
		}
	}
	
//find the intersection of the current set and another IntegerSet
	public void intersect(IntegerSet b) {
		int_set.retainAll(b.int_set);
	}
	
//set the difference between the current set and another intergerSet
	public void diff(IntegerSet b) {
		for (int i = 0; i < b.length(); i++) {
			if (int_set.contains(b.int_set.get(i)) == true) {
				int_set.remove(b.int_set.get(i));
			}
		}
	}
	
//checking if the current set is empty
	public boolean isEmpty() {
		return int_set.isEmpty();
	}
	
//returns a string representation to the current set
	public String toString() {
		String list = "";
		for (int i = 0; i < int_set.size(); i++) {
			list += int_set.get(i).toString() + ", ";
		}
		return list;
	}
}