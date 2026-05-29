import java.util.*;

public class MainJavaCollections {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add(5);
        list.add(34.23);
        list.add("hello");
        list.add(true);
        System.out.println(list);
    }
    /*
     0.    1.    2.    3
    [5, 34.23, hello, true]


     */

}
/*
    JCF => Java Collections Framework

1.Lists
     ArrayList
     0  1   2  3   4
ar->[8][5][-1][66][4]

    LinkedList
 0     1      2      3      4   5
[9]-->[5]-->[-1]-->[66]-->[4]--[7]
head                           tale

2.Sets
    HashSet       LinkedHashSet        TreeSet

3. Map
    HashMap      LinkedHashMap          TreeMap
 */
