import java.util.Comparator;

public class HWComparatorDoubleReverse
                        implements Comparator<Double> {
    @Override
    public int compare(Double d1, Double d2) {
        return Double.compare(d2,d1);
//        return d1.compareTo(d2);
    }
}
