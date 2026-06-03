
import java.util.Comparator;

public class ComparatorBooksByPriceReverse implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        double price1 = b1.getPrice();
        double price2 = b2.getPrice();
        return Double.compare(price2,price1);
    }
}
