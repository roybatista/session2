package guru.springframework.spring6webapp.service.interfaces;

import guru.springframework.spring6webapp.domain.Book;

public interface BookService {
    Iterable <Book> findAll();
}
