package Views;

import Models.Book;

public class ViewConsole {

    public void showBookArray(Book[] libros) {
        for(Book b : libros) {
            System.out.println(b);
        }
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
    
}
