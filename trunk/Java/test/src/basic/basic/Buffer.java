package basic.basic;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by Jeson on 15-11-16.
 */
public class Buffer {
    private Stack<Character> prev = new Stack<>();
    private Stack<Character> next = new Stack<>();

    void insert(char c)
    {
        prev.push(c);
    }

    char delete()
    {
        if (prev.size() != 0)
            return prev.pop();
        return 0;
    }

    void left(int k)
    {
        int n = k > prev.size() ? prev.size() : k;
        for (int ii = 0; ii < n; ++ii)
            next.push(prev.pop());
    }

    void right(int k)
    {
        int n = k > next.size() ? next.size() : k;
        for (int ii = 0; ii < n; ++ii)
            prev.push(next.pop());
    }

    int size()
    {
        return prev.size() + next.size();
    }

    void print()
    {
        Stack<Character> t = new Stack<>();
        for (int ii = 0, ni = prev.size(); ii < ni; ++ii)
            t.push(prev.pop());
        for (int ii = 0, ni = t.size(); ii < ni; ++ii)
            StdOut.print(t.pop());
        StdOut.println();
        for (int ii = 0, ni = next.size(); ii < ni; ++ii)
            StdOut.print(next.pop());
        StdOut.println();
    }

    public static void testcase()
    {
        Buffer b = new Buffer();
        b.insert('a');
        b.insert('b');
        b.insert('c');
        b.insert('d');
        b.left(2);
        b.insert('e');
        b.insert('f');
        b.left(1);
        b.delete();
        b.right(8);
        b.print();
    }
}
