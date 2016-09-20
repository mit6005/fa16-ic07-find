
public class Find {
    
    /**
     * Find the first occurrence of x in sorted array a.
     * 
     * @param x value to find
     * @param a array sorted in increasing order,
     *              a[0] &lt;= a[1] &lt;= ... &lt;= a[n-1]
     * @return lowest i such that a[i]==x, or -1 if no such i
     */
    public static int find(int x, int[] a) {
        return findLinear(x, a);
    }
    
    /**
     * TODO: specification
     */
    private static int findLinear(int x, int[] a) {
        throw new RuntimeException("findLinear unimplemented");
    }
}
