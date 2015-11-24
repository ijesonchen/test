package basic.basic;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by Jeson on 15-11-8.
 *
 */
public class ex_1_2_6 {
    public static void main()
    {
        while (true) {
            String s = StdIn.readString();
            if (s.equals("q"))
            {
                break;
            }
            String t = StdIn.readString();
            if ((s.length() == t.length()) &&
                 (s.concat(s).contains(t))) {
                StdOut.println("yes");
            } else {
                StdOut.println("no");
            }
        }
    }
}
