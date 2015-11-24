package basic.basic;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by Jeson on 15-11-3.
 */
public class ex_1_1_13 {
    public static void main()
    {
        int l = 5;
        int r = 10;
        boolean[][] a = ex_1_1_11.GenArray(l, r);
        ex_1_1_11.DrawBoolArray(a);

        StdOut.println();
        int n = a.length;
        int m = 0;
        if (n > 0)
            m = a[0].length;
        boolean[][] b = new boolean[m][n];
        for (int i = 0; i < m; ++i)
        {
            for (int j = 0; j < n; ++j)
            {
                b[i][j] = a[j][i];
            }
        }
        ex_1_1_11.DrawBoolArray(b);
    }
}
