import org.junit.Test;

import static org.junit.Assert.*;

public class FindTest {
    
    /*
     * TODO: write testing strategy with partitions for find(int x, int[] a)
     */

    // covers ...    
    @Test public void testEmpty() {
        assertEquals(-1, Find.find(1, new int[] {}));
    }
    
    
    /* TODO: write more tests for find(int x, int[] a) */
    
    
    /** Always ensure that assertions are enabled. */
    @Test(expected=AssertionError.class)
    public void testAssertionsEnabled() {
        assert false;
    }
}
