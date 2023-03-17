
package org.howard.edu.lsp.midterm.problem51;
import static org.junit.Assert.*;

import org.junit.Test;

	public interface Range {
		
		    IntegerRange range1 = new IntegerRange(1, 5);
		    IntegerRange range2 = new IntegerRange(3, 7);
		    IntegerRange range3 = new IntegerRange(6, 8);
		    IntegerRange range4 = new IntegerRange(8, 10);

		    @Test
		    public default void testContains() {
		        assertTrue(range1.contains(3));
		        assertFalse(range1.contains(6));
		        assertTrue(range2.contains(5));
		        assertFalse(range2.contains(8));
		        assertTrue(range3.contains(6));
		    }

		    @Test(expected = EmptyRangeException.class)
		    public default void testOverlapsNull() throws EmptyRangeException {
		        range1.overlaps(null);
		    }

		    @Test
		    public default void testOverlaps() throws EmptyRangeException {
		        assertTrue(range1.overlaps(range2));
		        assertTrue(range2.overlaps(range3));
		        assertFalse(range1.overlaps(range4));
		    }

		    @Test
		    public default void testSize() {
		        assertEquals(5, range1.size());
		        assertEquals(5, range2.size());
		        assertEquals(3, range3.size());
		        assertEquals(3, range4.size());
		    }

			public default int getLower() {
				// TODO Auto-generated method stub
				return 0;
			}

			public default int getUpper() {
				// TODO Auto-generated method stub
				return 0;
			}
		}




