import java.util.*;

public class MainJavaCollections {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add(5);
        list.add(34.23);
        list.add("hello");
        list.add(true);
        System.out.println(list);

        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("money");
        list1.add("happy");
        list1.add("Hi");
        list1.add("bye");
        System.out.println(list1);

    }
    /*
         0.    1.    2.    3
   list [5, 34.23, hello, true]
           0       1     2   3
   list1 [money, happy, Hi, bye]


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
