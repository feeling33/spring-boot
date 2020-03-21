package msa_kmj.lgcns.springboot.service;

import java.util.Optional;

import msa_kmj.lgcns.springboot.domain.Book;

public interface BookService {

	Optional<Book> findById(Long id);
	
	
}
