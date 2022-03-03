package betpawa.demo.services;

import betpawa.demo.domain.Book;
import org.springframework.stereotype.Service;

@Service
public class bookServiceImpl implements bookServices{
    @Override
    public Book createBook(String name, String isbn, String publisher) {
        return null;
    }
}
