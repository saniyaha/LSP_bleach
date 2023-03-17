package org.howard.edu.lsp.midterm.problem51;

import static org.junit.Assert.*;

import org.junit.Test;

	public class IntegerRangeTest {
	    // Create some example ranges for testing
	    private IntegerRange range1 = new IntegerRange(1, 5);
	    private IntegerRange range2 = new IntegerRange(3, 7);
	    private IntegerRange range3 = new IntegerRange(6, 8);
	    private IntegerRange range4 = new IntegerRange(8, 10);

	    @Test
	    public void testContains() {
	        // Test that the contains method returns true when the value is within the range
	        assertTrue(range1.contains(3));
	        // Test that the contains method returns false when the value is outside the range
	        assertFalse(range1.contains(6));
	        // Test that the contains method works for ranges that include negative values
	        IntegerRange negativeRange = new IntegerRange(-5, 5);
	        assertTrue(negativeRange.contains(0));
	    }

	    @Test(expected = EmptyRangeException.class)
	    public void testOverlapsNull() throws EmptyRangeException {
	        // Test that the overlaps method throws an exception when a null range is passed to it
	        range1.overlaps(null);
	    }

	    @Test
	    public void testOverlaps() throws EmptyRangeException {
	        // Test that the overlaps method returns true when the two ranges share at least one value
	        assertTrue(range1.overlaps(range2));
	        // Test that the overlaps method works for ranges that share an endpoint
	        assertTrue(range2.overlaps(range3));
	        // Test that the overlaps method returns false when the two ranges don't share any values
	        assertFalse(range1.overlaps(range4));
	    }

	    @Test
	    public void testSize() {
	        // Test that the size method returns the correct number of values in the range
	        assertEquals(5, range1.size());
	        assertEquals(5, range2.size());
	        assertEquals(3, range3.size());
	        assertEquals(3, range4.size());
	        // Test that the size method works for ranges that include negative values
	        IntegerRange negativeRange = new IntegerRange(-5, 5);
	        assertEquals(11, negativeRange.size());
	    }
	}


