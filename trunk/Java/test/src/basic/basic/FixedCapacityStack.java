package basic.basic;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by Jeson on 15-11-10.
 * FixedCapacityStack<Item>
 *
 * FixedCapacityStack(int cap)
 * void push(Item)
 * Item pop()
 * boolean isEmpty()
 * int size()
 */
public class FixedCapacityStack <Item>{
    private Item[] a;
    private int n;
    public FixedCapacityStack(int cap)
    {
        n = 0;
        a = (Item[]) new Object[cap];
    }
    public void push(Item item)
    {
        a[n++] = item;
    }
    public Item pop()
    {
        return a[--n];
    }
    public boolean isEmpty()
    {
        return n == 0;
    }
    int size()
    {
        return n;
    }

    public static void testcase()
    {
        FixedCapacityStack<String> s;
        s = new FixedCapacityStack<>(100);
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
