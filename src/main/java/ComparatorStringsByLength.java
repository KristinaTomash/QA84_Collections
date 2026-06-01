import java.util.Comparator;

public class ComparatorStringsByLength
        implements Comparator <String>{
    @Override
    public int compare(String s1, String s2) {
        int len1 = s1.length();//2
        int len2 = s2.length();//5

        return len1 - len2;
        //return Integer.compare(len1,len2);

    }
}
