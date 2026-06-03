import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
//import java.util.LinkedList;


public class MainListsTest {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("kiwi");
        list.add("apple");
        list.add("grape");
        list.add("banana");
        list.add("lemon");
        list.add("melon");

        System.out.println(list);
        list.add(2,"cherry");
        System.out.println(list);
        //list.clear();
        String s = list.get(2);
        System.out.println(s);
        list.remove(2);
        System.out.println(list);
        list.remove("apple");
        System.out.println(list);
        list.remove("cherry");
        System.out.println(list);
       // list.remove(9);
       // System.out.println(list);
      int index = list.indexOf("kiwi");
        System.out.println("in index " + index);
        System.out.println("size : " + list.size());
        boolean res = list.contains("lemon");
        System.out.println(res);
        //list.isEmpty();
        list.set(3,"pineapple");
        System.out.println(list);
       List<String> sub =  list.subList(1,3);
        System.out.println(sub);
        list.sort(null);
        System.out.println(list);
        list.get(0);
        System.out.println(list.get(0));
        ComparatorStringsReverse comp =
                new ComparatorStringsReverse();
        list.sort(comp);
        System.out.println(list);
        ComparatorStringsByLengthReverse comp2 =
                new ComparatorStringsByLengthReverse();
        list.sort(comp2);
        System.out.println(list);

        ComparatorStringsByABC comp3 =
                new ComparatorStringsByABC();
        list.sort(comp3);
        System.out.println(list);

    }
 /*
 > Task :MainListsTest.main()
  0     1       2      3      4      5
[kiwi, apple, grape, banana, lemon, melon]
   0    1      2       3       4       5      6
[kiwi, apple, cherry, grape, banana, lemon, melon]

  */

    /*

                              Collection
                      |                         |
                    List                       Set
             |       |           |
       ArrayList   LinkedList   Vector




     */
}
