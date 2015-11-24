package basic.basic;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.PriorityQueue;

/**
 * Created by Jeson on 15-11-11.
 * 2 3 4 + 5 6 * * +
 * 212
 */
public class ex_1_3_11 {
    public static void testcase()
    {
        Stack<Double> vals = new Stack<>();
        double res = 0;
        while (!StdIn.isEmpty())
        {
            String s = StdIn.readString();
            double b = 0;
            double a = 0;
            switch (s)
            {
                case "+":
                    b = vals.pop();
                    a = vals.pop();
                    vals.push(a + b);
                    break;
                case "*":
                    b = vals.pop();
                    a = vals.pop();
                    vals.push(a * b);
                    break;
                default:
                    vals.push(Double.parseDouble(s));
                    break;
            }
        }
        StdOut.println(vals.pop());
    }
}
