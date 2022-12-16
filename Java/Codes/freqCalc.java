import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//find freq of chars in string w/o using loop or smthg

public class freqCalc {
    public static void main(String[] args) {
        String str = "AABECDDEE";
        str += "a";

        Set<Character> uniqChars = new HashSet<>();

        for (int i = 0; i < str.length(); i++)
            uniqChars.add((str.charAt(i)));

        Iterator<Character> itr = uniqChars.iterator();

        int len;

        while (itr.hasNext()) {
            len = 0;
            char chr = itr.next();
            String splitStr[] = str.split(chr + "");

            len = splitStr.length;

            if (len == 1)
                len += 1;
            if (chr == 'a')
                len -= 1;
            if (len != 1)
                System.out.println(chr + " : " + (len - 1));

        }

    }
}
