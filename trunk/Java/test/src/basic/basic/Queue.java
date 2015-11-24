package basic.basic;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by Jeson on 15-11-16.
 *
 */

public class Queue<Item>
{
    private class Node
    {
        Item data;
        Node next;
    }
    private Node first = null;
    private Node last = null;
    private int n = 0;

    public boolean isEmpty() {return n == 0;}
    public int size() { return n;}
    public void push(Item item) {
        Node oldlast = last;
        last = new Node();
        last.data = item;
        last.next = null;
        if (isEmpty()) {
            first = last;
        }
        else
        {
            oldlast.next = last;
        }
        ++n;
    }
    public Item pop() {
        --n;
        Item item = first.data;
        first = first.next;
        if (n == 0)
            last = null;
        return item;
    }


    public static void testcase()
    {
        Queue<String> s;
        s = new Queue<String>();
        while (!StdIn.isEmpty())
        {
            String item = StdIn.readString();
            if (!item.equals("-"))
                s.push(item);
            else if (!s.isEmpty())
                StdOut.print(s.pop() + " ");
        }
        StdOut.printf("(%d left on stack)", s.size());
    }
}

