package algo;

import lib.StdIn;
import lib.StdOut;

public class ST<Key extends Comparable<Key>, Value>{
    public boolean contains(Key s) {
        return false;
    }

    public Value size() {
        return null;
    }

    public String[] keys() {
        return new String[0];
    }

    public Value get(Key name) {
        return null;
    }

    public void put(Key s, Value size) {

    }


//    public static void main(String[] args)
//    {
//        ST<String, Integer> st;
//        st = new ST<String, Integer>();
//        for (int i = 0; !StdIn.isEmpty(); i++)
//        {
//            String key = StdIn.readString();
//            st.put(key, i);
//        }
//        for (String s : st.keys())
//            StdOut.println(s + " " + st.get(s));
//    }
}
