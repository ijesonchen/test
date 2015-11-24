package basic.basic;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;

/**
 * Created by Jeson on 15-11-3.
 */
public class drawsortarray {

    public static void main()
    {
        int n = 50;
        double[] a = new double[n];
        for (int i = 0; i < n; ++i)
        {
            a[i] = StdRandom.random();
        }
        Arrays.sort(a);
        for (int i = 0; i < n; ++i)
        {
            double x = 1.0 * i / n;
            double y = a[i] / 2.0;
            double rw = 0.5 / n;
            double rh = a[i] / 2.0;
            StdDraw.filledRectangle(x, y, rw, rh);
        }
    }
}
