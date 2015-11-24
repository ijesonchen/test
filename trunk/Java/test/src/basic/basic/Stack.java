package basic.basic;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by Jeson on 15-11-16.
 *
 */

public class Stack<Item>
{
    private class Node
    {
        Item data;
        Node next = null;
    }
    private Node first = null;
    private int n = 0;

    public Stack()
    {
    }

    public boolean isEmpty() {return n == 0;}
    public int size() { return n;}
    public void push(Item item) {
        Node p = new Node();
        p.data = item;
        p.next = first;
        first = p;
        ++n;
    }
    public Item pop() {
        --n;
        Item item = first.data;
        first = first.next;
        return item;
    }

    public Stack(Stack<Item> s)
    {
        Node p = first;
        Node q = s.first;
        while (q != null)
        {
            p = new Node();
            p.data = q.data;
            p.next = q.next;
            q = q.next;
        }
    }

    public static void testcase()
    {
        Stack<String> s = new Stack<String>();
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