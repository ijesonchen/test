package basic.basic;

import edu.princeton.cs.algs4.Accumulator;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * Created by Jeson on 15-11-3.
 */
public class VisualAccumulator {
    Accumulator m_acc;
    public VisualAccumulator(int trials, double max)
    {
        m_acc = new Accumulator();
        StdDraw.setXscale(0, trials);
        StdDraw.setYscale(0, max);
        StdDraw.setPenRadius(0.001);
    }
    public void addDataValue(double val)
    {
        m_acc.addDataValue(val);
        StdDraw.setPenColor(StdDraw.DARK_GRAY);
        StdDraw.point(count(), val);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.point(count(), mean());
    }
    public double mean()
    {
       return m_acc.mean();
    }
    public int count()
    {
        return m_acc.count();
    }
    public String toString()
    {
        return m_acc.toString();
    }

    public static void main(int n)
    {
        VisualAccumulator va = new VisualAccumulator(n, 1.0);
        for (int i = 0; i < n; ++i)
        {
            va.addDataValue(StdRandom.random());
        }
        StdOut.println(va);
    }
}
