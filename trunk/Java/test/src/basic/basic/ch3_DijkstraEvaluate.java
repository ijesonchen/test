package basic.basic;

import com.sun.xml.internal.bind.v2.TODO;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Stack;

/**
 * Created by Jeson on 15-11-8.
 * ( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) ) = 101.0
 * ( ( 1 + sqrt ( 5.0 ) ) / 2.0 ) = 1.618033988749895
 *
 * ctrl+d to cause StdIn.isEmpty()
 */
public class ch3_DijkstraEvaluate {
    // TODO Ë«Õ»¼ÆËã
    public static void main()
    {
        Stack<String> ops = new Stack<>();
        Stack<Double> vals = new Stack<>();
        while (!StdIn.isEmpty())
        {
            String s = StdIn.readString();
            if (s.equals("("))  ;
            else if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/") || s.equals("sqrt"))
                ops.push(s);
            else if (s.equals(")"))
            {
                String op = ops.pop();
                double v = vals.pop();
                if (op.equals("+")) v = vals.pop() + v;
                else if (op.equals("-")) v = vals.pop() - v;
                else if (op.equals("*")) v = vals.pop() * v;
                else if (op.equals("/")) v = vals.pop() / v;
                else if (op.equals("sqrt")) v = Math.sqrt(v);
                vals.push(v);
            }
            else if (s.equals("=")) break;
            else
            {
                vals.push(Double.parseDouble(s));
            }
        }
        StdOut.println(vals.pop());
    }
}
