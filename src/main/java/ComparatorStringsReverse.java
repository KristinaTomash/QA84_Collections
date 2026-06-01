import java.util.Comparator;

public class ComparatorStringsReverse
                            implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {

        return s2.compareTo(s1);
       // Double.compare(d2,d1);
    }
}

/*
                      HOMEWORK #11
     1. in main:
     ArrayList<Double> listD
     LinkedList<Integer> listInt

     2.Advanced:
     ComparatorDoubleReverse
     // Double.compare(d2,d1);
     ComparatorIntegerReverse









 */
