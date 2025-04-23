package Controllers;

import Models.Book;

public class BookController {
    
    public void sortByBubble(Book[] libros) {
        boolean cambios; 
        for(int i = 0; i < libros.length - 1; i++) {
            cambios = false;
            for(int j = i; j < libros.length - i -1; j++) {
                if(libros[i].getName().equalsIgnoreCase(String) > libros[i + 1].getName()) {
                    Book aux = libros[i];
                    libros[i] = libros[i + 1];
                    libros[i + 1] = aux;
                }
                cambios = true;
            }
        }

    }

    public void searchByBinari(Book[] libros, String name) {
        int izquierda = 0;
        int derecha = libros.length - 1;

        while (izquierda <= derecha) {
            int medio = izquierda + (izquierda + derecha) / 2;
            if(libros[medio].getName() == name) {
                medio; 
            }
            if(libros[medio].getName() <= name) {
                medio + 1;
            }
            else {
                medio - 1;
            }
        }
        return null
    }
}
