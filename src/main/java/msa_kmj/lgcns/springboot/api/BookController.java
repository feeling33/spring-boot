package msa_kmj.lgcns.springboot.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import msa_kmj.lgcns.springboot.domain.Book;
import msa_kmj.lgcns.springboot.service.BookService;
import org.springframework.web.bind.annotation.PathVariable;  

@RestController
//@RequestMapping(value = "/books")
@RequestMapping(value = "/{bookId}") //==> "/{bookId}"
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@GetMapping("/{bookId}")
	//public ResponseEntity findById(@PathVariable Long bookId){
	public ResponseEntity findById(@PathVariable Long bookId){
		Book book = bookService.findById(bookId)
				.orElseThrow(() -> new RuntimeException("Not found: " + bookId));
		return ResponseEntity.ok(book);
	}
	
}
