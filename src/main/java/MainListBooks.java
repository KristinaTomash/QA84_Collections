import java.util.LinkedList;

public class MainListBooks {
    public static void main(String[] args) {
        LinkedList<Book> list = new LinkedList<Book>();

        Book b1 = new Book("George Orwell", "1984", 328, 14.99);
        Book b2  = new Book("Harper Lee", "To Kill a Mockingbird", 281, 12.50);
        Book b3  = new Book("J.R.R. Tolkien", "The Hobbit", 310, 18.75);
        Book b4  = new Book("F. Scott Fitzgerald", "The Great Gatsby", 180, 10.99);
        Book b5  = new Book("Jane Austen", "Pride and Prejudice", 432, 15.25);
        Book b6  = new Book("Mark Twain", "Adventures of Huckleberry Finn", 366, 13.49);
        Book b7  = new Book("Mary Shelley", "Frankenstein", 280, 11.99);
        Book b8  = new Book("Bram Stoker", "Dracula", 418, 16.50);
        Book b9  = new Book("Herman Melville", "Moby-Dick", 635, 19.99);
        Book b10 = new Book("Leo Tolstoy", "War and Peace", 1225, 24.99);
        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b4);
        list.add(b5);
        list.add(b6);
        list.add(b7);
        list.add(b8);
        list.add(b9);
        list.add(b10);

        printBooksList(list);

        list.sort(null);
        printBooksList(list);

        ComparatorBooksByAuthorReverse comp1 = new ComparatorBooksByAuthorReverse();
        list.sort(comp1);
        printBooksList(list);

        ComparatorBooksByAuthorAZ comp2 = new ComparatorBooksByAuthorAZ();
        list.sort(comp2);
        printBooksList(list);

        ComparatorBooksByPages comp3 =
                new ComparatorBooksByPages();
        list.sort(comp3);
        printBooksList(list);


        ComparatorBooksByPriceReverse comp4 =
                new ComparatorBooksByPriceReverse();
        list.sort(comp4);
        printBooksList(list);

    }



    private static void printBooksList(LinkedList<Book> list) {
        for (Book b: list){
            System.out.println(b);
        }
        System.out.println("************************************");
    }
}
/*
HOMEWORK #13

1.ComparatorBooksByPagesReverse (100->0)
  ComparatorBooksByPrice   (0.0 -> 100.0)
  ComparatorBooksByTitle (A-Z)
  ComparatorBooksByTitleReverse (Z-A)


  2.Advanced *****
  in comperTo() class Book
 sort by author (A-Z)

 in books with same author should be by title









 */
