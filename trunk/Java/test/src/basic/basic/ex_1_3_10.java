package basic.basic;

import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by Jeson on 15-11-11.
 // ( 2 + ( ( 3 + 4 ) * ( 5 * 6 ) ) )
 // 2 3 4 + 5 6 * * +
 *
 */
public class ex_1_3_10 {
    public static void testcase()
    {
        Stack<String> ops = new Stack<>();
        Queue<Double> vals = new Queue<>();
        while (!StdIn.isEmpty())
        {
            String s = StdIn.readString();
            switch (s)
            {
                case "+":
                case "*":
                    ops.push(s);
                    break;
                case "(":
                    continue;
                case ")":
                    StdOut.print(ops.pop() + " ");
                    break;
                default:
                    StdOut.print(s + " ");
                    break;
            }
        }
    }
}
