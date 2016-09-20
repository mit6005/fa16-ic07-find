import org.junit.Test;

import static org.junit.Assert.*;

public class FindTestExample {

    // Testing strategy for i = find(x, a):
    // Partition the space of (x, a, i) as follows...
    //
    // x:        neg, 0, pos
    // a.length: 0, 1, 2+
    // a.vals:   neg, 0, pos; all same, increasing
    // i:        0, middle, n-1, -1

    // covers x pos, a.length=0, i=-1
    @Test public void testEmpty() {
        assertEquals(-1, Find.find(1, new int[] {}));
    }

    // covers x=0, a.length=1, a.vals 0, i=0
    @Test public void testSingleton() {
        assertEquals(0, Find.find(0, new int[] { 0 }));
    }

    // covers x>0, a.length 2+, a.vals neg & pos/increasing, i in middle
    @Test public void testMiddle() {
        assertEquals(1, Find.find(1, new int[] { -1, 1, 3 }));
    }

    // covers x<0, a.length 2+, a.vals neg & pos/increasing, i at start
    @Test public void testStart() {
        assertEquals(0, Find.find(-1, new int[] { -1, 1, 3 }));
    }

    // covers x>0, a.length 2+, a.vals neg & pos/increasing, i at end
    @Test public void testEnd() {
        assertEquals(2, Find.find(3, new int[] { -1, 1, 3 }));
    }

    // covers a.length 2+, a.vals neg & pos/increasing, i=-1
    @Test public void testNotFound() {
        assertEquals(-1, Find.find(2, new int[] { -1, 1, 3 }));
    }

    // covers a.vals all same
    @Test public void testAllSame() {
        assertEquals(0, Find.find(1, new int[] { 1, 1, 1 }));
    }
}
