package org.howard.edu.lsp.midterm.problem51;

public class IntegerRange implements Range {
    private int lower;
    private int upper;

   

    public IntegerRange(int i, int j) {
		// TODO Auto-generated constructor stub
	}

	public int getLower() {
        return lower;
    }

    public int getUpper() {
        return upper;
    }

    public boolean contains(int value) {
        return value >= lower && value <= upper;
    }

    public boolean overlaps(IntegerRange range2) throws EmptyRangeException {
        if (range2 == null) {
            throw new EmptyRangeException("Null range passed to overlaps method");
        }
        return (range2.getLower() >= lower && range2.getLower() <= upper) || 
               (range2.getUpper() >= lower && range2.getUpper() <= upper);
    }

    public int size() {
        return upper - lower + 1;
    }
}
