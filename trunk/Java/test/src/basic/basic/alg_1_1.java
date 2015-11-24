package basic.basic;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by Jeson on 15-11-8.
 * todo LIFO 栈 动态调整数组大小
 * ResizingArrayStack<Item>
 * isEmpty
 * size
 * push(Item)
 * Item pop()
 * private Resize(int max)
 *
 * in:
 * to be or not to - be - - that - - - is
 * out:
 * to be not that or be (2 left on stakc)
 */
public class alg_1_1 {
    public static class ResizingArrayStack<Item>
    {
        private Item[] a = (Item[]) new Object[1];
        private int n = 0;
        private void resize(int cap)
        {
            Item[] anew = (Item[]) new Object[cap];
            for (int ii = 0; ii < n; ++ii)
                anew[ii] = a[ii];
            a = anew;
        }
        public boolean isEmpty() {return n == 0;}
        public int size() { return n;}
        public void push(Item item) {
            if (n == a.length) resize(2 * a.length);
            a[n++] = item;
        }
        public Item pop() {
            Item item = a[--n];
            a[n] = null;
            if (n > 0 && n == a.length / 4) resize(a.length / 2);
            return item;
        }

    }

    public static void testcase()
    {
        ResizingArrayStack<String> s;
        s = new ResizingArrayStack<String>();
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
