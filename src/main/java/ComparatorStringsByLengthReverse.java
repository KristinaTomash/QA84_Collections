import java.util.Comparator;

public class ComparatorStringsByLengthReverse implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();

        //return Integer.compare(s2.length(),s1.length());
        //return Integer.compare(len2,len1);
        return len2 - len1;
    }
}
