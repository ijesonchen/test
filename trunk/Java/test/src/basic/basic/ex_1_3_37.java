package basic.basic;


import com.sun.org.apache.bcel.internal.generic.SWAP;
import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by Jeson on 15-11-16.
 */
public class ex_1_3_37 {
    public static void testcase()
    {
        int m = 7;
        int n = 13;
        Queue<Integer> q = new Queue<>();
        for (int ii = 0; ii < n; ++ii)
            q.enqueue(ii);

        while (!q.isEmpty()) {
            for (int ii = 0; ii < m - 1; ++ii)
                q.enqueue(q.dequeue());
            StdOut.print(q.dequeue() + " ");
        }
        StdOut.println();
    }
}
