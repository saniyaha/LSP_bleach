package org.howard.edu.lsp.hw4;

import org.howard.edu.lsp.hw4.IntegerSet.IntegerSetException;

public class Driver {

	public static void main(String[] args) throws IntegerSetException {
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        //prints the value of of the set and the smallest and largest
        System.out.println("Value of Set1 is: " + set1.toString());
        System.out.println("Smallest value in Set1 is: " + set1.tinyest());
        System.out.println("Largest value in Set1 is: " + set1.biggest());
        //creates another instance of IntergetSet and add some values
        IntegerSet set2 = new IntegerSet();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        //prints the value of set2
        System.out.println("Value of Set2 is: " + set2.toString());
        //check if the set1 equals set2 and prints the results
        System.out.println("Set1 equals Set2: " + set1.equals(set2));
        //check if set1 contains 2 and 4, prints the results
        System.out.println("Set1 contains 2: " + set1.contains(2));
        System.out.println("Set1 contains 4: " + set1.contains(4));
        //removes the value 2 from set1 and print the result
        System.out.println("Set1 before removing 2: " + set1.toString());
        set1.remove(2);
        System.out.println("Set1 after removing 2: " + set1.toString());
        //intersect set1 with set2 and print the results
        System.out.println("Set1 before intersecting with Set2: " + set1.toString());
        System.out.println("Set2 before intersecting with Set1: " + set2.toString());
        set1.intersect(set2);
        System.out.println("Result of intersection of Set1 and Set2: " + set1.toString());
        //take the difference of set1 with set2 and print the results
        System.out.println("Set1 before taking difference with Set2: " + set1.toString());
        System.out.println("Set2 before taking difference with Set1: " + set2.toString());
        set1.diff(set2);
        System.out.println("Result of difference of Set1 and Set2: " + set1.toString());
        //take the union of set1 with set2 and print the results
        System.out.println("Set1 before taking union with Set2: " + set1.toString());
        System.out.println("Set2 before taking union with Set1: " + set2.toString());
        set1.union(set2);
        System.out.println("Result of union of Set1 and Set2: " + set1.toString());
        // Check if set1 is empty and print the result
        System.out.println("Set1 is empty: " + set1.isEmpty());
        // Clear set1 and print the result of checking if it is empty
        set1.clear();
        System.out.println("Set1 after clearing: " + set1.toString());
        System.out.println("Set1 is empty: " + set1.isEmpty());
    }
}

