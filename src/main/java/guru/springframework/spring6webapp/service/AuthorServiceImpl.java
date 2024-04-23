package guru.springframework.spring6webapp.service;

import guru.springframework.spring6webapp.domain.Author;
import guru.springframework.spring6webapp.repository.AuthotRepository;
import guru.springframework.spring6webapp.service.interfaces.AuthorService;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthotRepository authotRepository;

    public AuthorServiceImpl(AuthotRepository authotRepository) {
        this.authotRepository = authotRepository;
    }

    @Override
    public Iterable<Author> findAll() {
        return authotRepository.findAll();
    }
}
