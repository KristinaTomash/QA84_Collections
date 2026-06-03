import java.util.ArrayList;

public class MainPersonsList {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();

        Person p1 = new Person("Alice", 101, 25);
        Person p2 = new Person("Bob", 102, 30);
        Person p3 = new Person("Charlie", 103, 22);
        Person p4 = new Person("David", 104, 28);
        Person p5 = new Person("Emma", 105, 35);
        Person p6 = new Person("Frank", 106, 27);
        Person p7 = new Person("Grace", 107, 24);

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        list.add(p6);
        list.add(p7);

   printPersonsList(list);
    }
    private static void printPersonsList(ArrayList<Person> list) {
        for (Person p: list){
            System.out.println(p);
        }
    }
}
/*
        HomeWork#12

        1.ComparatorSrtingsByLangthReverse
        "performance ->>>>>>>>> "I"
        sort strings use corparator

        2.ComparatorStringsByABC
        for sortings strings from "A" to "Z"
        like list.sort(null);

        3.Advanced *****
                          String  int  double
        write class Book(author, pages,price)
        create in Main LinkedList<Book>
        generate 10 objects use chat GPT
        add objects to list
        and print use method :
        printBooksList()






 */





