import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        book book1 = new book("1234", "Dasar Pemrograman");
        book book2 = new book("7145", "Hafalah  Shalat Delisa");
        book book3 = new book("3562", "Muhammad Al-Fatih");

        Stack<book> books = new Stack<>();
        books.push(book1);
        books.push(book2);
        books.push(book3);

        book temp = books.peek();

        if (temp !=  null ) {
            System.out.println();
        }

        book temp2 = books.pop();

        if (temp2 != null) {
            System.out.println(temp2.toString());
        }
    }
}
