package basic.basic;

import edu.princeton.cs.algs4.*;

/**
 * Created by Jeson on 15-11-3.
 */
public class DotInRect {
    public static void DotInRect(double xlo, double xhi,
                                 double ylo, double yhi,
                                 int n)
    {
        Interval1D xint = new Interval1D(xlo, xhi);
        Interval1D yint = new Interval1D(ylo, yhi);
        Interval2D box = new Interval2D(xint, yint);
        box.draw();

        Counter c = new Counter("hits");
        for (int i = 0; i < n; ++i)
        {
            double x = Math.random();
            double y = Math.random();
            Point2D p = new Point2D(x, y);
            StdDraw.setPenRadius(.003);
            if (box.contains(p))
            {
                c.increment();
                StdDraw.setPenColor(255, 0, 0);
                StdDraw.point(x, y);
            }
            else {
                StdDraw.setPenColor(0, 0, 255);
                p.draw();
            }
        }

        StdOut.println(c);
        StdOut.println(box.area());

    }
}
