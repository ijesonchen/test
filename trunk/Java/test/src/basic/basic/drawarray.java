package basic.basic;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

/**
 * Created by Jeson on 15-11-3.
 */
public class drawarray {
    public static void main()
    {
        int n = 50;
        double[] a = new double[n];
        for (int ii = 0; ii < n; ++ii)
        {
            a[ii] = StdRandom.random();
        }
        StdDraw.setPenRadius(.01);
        for (int ii = 0; ii < n; ++ii)
        {
            double x = 1.0 * ii / n;
            double y = a[ii] / 2.0;
            double rw = 0.5 / n;
            double rh = a[ii] / 2.0;
            StdDraw.setPenColor(0,255,0);
            StdDraw.filledRectangle(x, y, rw, rh);
            StdDraw.setPenColor(0,0,0);
            StdDraw.point(x, a[ii]);
            StdDraw.setPenColor(255,0,0);
            StdDraw.point(x, y);
        }
    }
}
