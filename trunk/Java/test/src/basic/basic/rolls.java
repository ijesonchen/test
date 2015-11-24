package basic.basic;

import edu.princeton.cs.algs4.*;

/**
 * Created by Jeson on 15-11-10.
 *
 */
public class rolls {
    public static void main()
    {
        StdOut.println("input count:");
        int nRoll = StdIn.readInt();
        final int nSides = 6;
        Counter[] arolls = new Counter[nSides];
        for (int i = 0; i < nSides; ++i)
        {
            arolls[i] = new Counter((i + 1) + "'s ");
        }
        for (int ii = 0; ii < nRoll; ++ii)
        {
            int result = StdRandom.uniform(1, nSides + 1);
            arolls[result - 1].increment();
        }
        for (Counter c : arolls)
        {
            StdOut.println(c);
        }
    }
}
