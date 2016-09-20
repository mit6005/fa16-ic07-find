import java.util.Arrays;

public class FindBinary {
    
    /**
     * TODO: specification
     */
    private static int findBinary(int x, int[] a) {
        int middle = a.length / 2;
        if (x < a[middle]) {
            return findBinary(x, Arrays.copyOfRange(a, 0, middle));
        } else if (x > a[middle]) {
            return (middle+1) + findBinary(x, Arrays.copyOfRange(a, middle+1, a.length));
        } else {
            return middle;
        }
    }
}
