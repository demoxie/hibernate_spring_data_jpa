package betpawa.demo.services;

import betpawa.demo.domain.Book;

public interface bookServices {
    Book createBook(String name,String isbn, String publisher);
}
