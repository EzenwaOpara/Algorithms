package hackerrank;


import lib.StdIn;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;


public class BiggerIsGreater {

    public static String biggerIsGreater(String w) {
        // Write your code here

        if (w.length() <= 1) return "no answer";

        if (w.length() == 2) {
            char[] chars = w.toCharArray();
            if (chars[0] >= chars[1]) return "no answer";
            return chars[1] + "" + chars[0];
        }

        String nw = w;
        while (nw.compareTo(w) < 1) {
            for (int i = w.length(); i >= 2; i--) {
                nw = swap(nw, i - 1, i - 2);
                if (nw.compareTo(w) > 0) return nw;
            }
            if (nw.equals(w)) return "no answer";
        }

        return "no answer";
    }

    private static String swap(String w, int i, int j) {
        char[] chars = w.toCharArray();
        char temp = chars[j];
        chars[j] = chars[i];
        chars[i] = temp;
        return String.valueOf(chars);
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner test = new Scanner(new File("src/test.txt"));
        Scanner output = new Scanner(new File("src/output.txt"));
        int incorrect = 0;
        int correct = 0;
        while (test.hasNext()) {
            String in = test.nextLine();
            String s = biggerIsGreater(in);
            String nextOut = output.nextLine();
            System.out.println("String:   " + in);
            System.out.println("Expected: " + nextOut);
            System.out.println("Returned: " + s);
            System.out.println("Correct: " + s.equals(nextOut));
            if (!s.equals(nextOut)) incorrect++;
            else correct++;
        }
        System.out.println("Incorrect: " + incorrect);
        System.out.println("Correct: " + correct);

        //ehxxdsuhoowxpbxiwx jrhe -> jreh ->
        //ehxxdsuhoowxpbxiwx rehj

        //nxczkgxcazmwlutxjwmflhqhfg nqf
        //nxczkgxcazmwlutxjwmflhqhfg qfn

        //tccjaoahruyblpejzgkfnpmqoajnvqnvqmcdwpioxkrllofvixidannpvzxtpnzdtyxfkcloanztgkvgsngqxahnz mtrh
        //tccjaoahruyblpejzgkfnpmqoajnvqnvqmcdwpioxkrllofvixidannpvzxtpnzdtyxfkcloanztgkvgsngqxahnz rhmt

        //nrwpbahygorusjjisosdzyoczztfmjokrvopacabejefnqgeeychpghcbwtewrzhmttfgh syr
        //nrwpbahygorusjjisosdzyoczztfmjokrvopacabejefnqgeeychpghcbwtewrzhmttfgh yrs

        //rxspypxlnjifgejzcyyhrcaxlwbtitjetwewduofbigvqtikyanugjwxvyaxjkibjoiwgka joi
        //rxspypxlnjifgejzcyyhrcaxlwbtitjetwewduofbigvqtikyanugjwxvyaxjkibjoiwgka oij

        //psdkhbugfmywupyystooffjqnqm wyta
        //psdkhbugfmywupyystooffjqnqm yatw

//        String s = biggerIsGreater("lmno");
//        System.out.println(s);
//        String s1 = biggerIsGreater("dcba");
//        System.out.println(s1);
//        String s2 = biggerIsGreater("dcbb");
//        System.out.println(s2);
//        String s3 = biggerIsGreater("abdc");
//        System.out.println(s3);
//        String s4 = biggerIsGreater("abcd");
//        System.out.println(s4);
//        String s5 = biggerIsGreater("fedcbabcd");
//        System.out.println(s5);
    }
}
