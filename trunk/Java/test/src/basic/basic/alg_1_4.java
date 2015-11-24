package basic.basic;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by Jeson on 15-11-8.
 * todo Bag<Item>
 *     add(Item)
 *
 * </Item>
 */
public class alg_1_4 {
    public static class Bag<Item> {
        private class Node {
            Item data;
            Node next;
        }

        private Node first = null;
        private int n = 0;

        public boolean isEmpty() {
            return n == 0;
        }

        public int size() {
            return n;
        }

        public void push(Item item) {
            Node p = new Node();
            p.data = item;
            p.next = first;
            first = p;
            ++n;
        }

        public void print()
        {
            Node p = first;
            while (p != null) {
                StdOut.print(p.data + " ");
                p = p.next;
            }
            StdOut.println();
        }
    }

    public static void testcase()
    {
        Bag<String> s;
        s = new Bag<String>();
        while (!StdIn.isEmpty())
        {
            String item = StdIn.readString();
            s.push(item);
        }
        s.print();

    }
}
