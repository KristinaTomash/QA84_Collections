import java.util.ArrayList;
import java.util.LinkedList;

public class HWMainArrays {

    public static void main(String[] args) {
        ArrayList<Double> listD = new ArrayList<>();
        listD.add(3.4);
        listD.add(-23.7);
        listD.add(9.1);
        listD.add(12.8);
        listD.add(0.00);
        listD.add(-0.00);
        System.out.println(listD);
        listD.add(1,67.2);
        System.out.println(listD);
        listD.remove(2);
        System.out.println(listD);
        listD.sort(null);
        System.out.println(listD);


        LinkedList<Integer> listInt =
                new LinkedList<>();
        listInt.add(4);
        listInt.add(34);
        listInt.add(17);
        listInt.add(-46);
        listInt.add(-9);
        listInt.add(0);
        System.out.println(listInt);
        listInt.sort(null);
        System.out.println(listInt);

        HWComparatorDoubleReverse comp1 = new HWComparatorDoubleReverse();
        listD.sort(comp1);
        System.out.println(listD);

        HWComparatorIntegersReverse comp2 =
                new HWComparatorIntegersReverse();
        listInt.sort(comp2);
        System.out.println(listInt);
    }
    /*
               0   1   2    3   4  5
    listInt-> [4, 34, 17, -46, -9, 0]
    sort-> [-46, -9, 0, 4, 17, 34]
    comparator -> [34, 17, 4, 0, -9, -46]

              0     1     2    3     4     5
    listD->[3.4, -23.7, 9.1, 12.8, 0.0, -0.0]





     */
}
