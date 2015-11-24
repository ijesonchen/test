package basic.basic;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

import java.util.PriorityQueue;

/**
 * Created by Jeson on 15-11-3.
 */
public class ex_1_1_11 {
    public static boolean[][] GenArray(int l, int r)
    {
        boolean[][] a = new boolean[l][r];
        for (int i = 0; i < l; ++i)
        {
            for (int j = 0; j < r; ++j)
            {
                a[i][j] = StdRandom.bernoulli(.5);
            }
        }
        return a;
    }
    public static void main()
    {
        int l = 5;
        int r = 10;
        boolean[][] a = GenArray(l, r);
        DrawBoolArray(a);
    }

    public static void DrawBoolArray(boolean[][] a) {
        int l = a.length;
        int r = 0;
        if (l > 0)
            r = a[0].length;
        StdOut.print(" ");
        for (int i = 0; i < r; ++i)
        {
            StdOut.print(i);
        }
        StdOut.println();
        for (int i = 0; i < l; ++i)
        {
            StdOut.print(i);
            for (int j = 0; j < r; ++j)
            {
                if (a[i][j])
                    StdOut.print("*");
                else
                    StdOut.print("#");
            }
            StdOut.println();
        }
    }
}
