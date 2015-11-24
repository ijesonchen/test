package basic.basic;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by Jeson on 15-11-8.
 *
 */
public class ex_1_2_19 {
    static public void main()
    {
        // transaction Turning 5/22/1939 11.99
        while (true)
        {
            String s = StdIn.readLine();
            if (s.equals("q"))
                break;
            String[] parts = s.split(" ");
            if (parts.length != 3)
            {
                StdOut.println("input error");
                continue;
            }
            String client = parts[0];
            String date = parts[1];
            String[] fields = date.split("/");
            if (fields.length != 3)
            {
                StdOut.println("date error");
                continue;
            }
            int month = Integer.parseInt(fields[0]);
            int day = Integer.parseInt(fields[1]);
            int year = Integer.parseInt(fields[2]);
            double money = Double.parseDouble(parts[2]);

            StdOut.println("ok");
            StdOut.printf("client: %s, month: %d, day: %d, year: %d, money: %.2f\n",
                    client, month, day, year, money);

        }
    }
}
