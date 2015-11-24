package basic.basic;

import edu.princeton.cs.algs4.StdDraw;

/**
 * Created by Jeson on 15-11-3.
 */
public class drawfunc {
    public static void main()
    {
        int N = 100;
        StdDraw.setXscale(0, N);
        StdDraw.setYscale(0, N*N);
        StdDraw.setPenRadius(.01);
        for (int ii = 1; ii <= N; ++ii)
        {
            StdDraw.point(ii, ii);
            StdDraw.point(ii, ii * ii);
            StdDraw.point(ii, ii * Math.log(ii));
        }
    }
}
