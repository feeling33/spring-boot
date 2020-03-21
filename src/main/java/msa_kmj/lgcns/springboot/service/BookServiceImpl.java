package msa_kmj.lgcns.springboot.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import msa_kmj.lgcns.springboot.domain.Book;
import msa_kmj.lgcns.springboot.domain.BookRepository;

@Service
@Transactional
public class BookServiceImpl implements BookService {
	private final BookRepository BookRepository;
	
	public BookServiceImpl(BookRepository bookRepository) {
		this.BookRepository = bookRepository;
	}

	@Override
	public Optional<Book> findById(Long id) {
		// TODO Auto-generated method stub
		return BookRepository.findById(id);
	}

}
