package guru.springframework.spring6webapp.service;

import guru.springframework.spring6webapp.domain.Book;
import guru.springframework.spring6webapp.repository.BookRepository;
import guru.springframework.spring6webapp.service.interfaces.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }
}
