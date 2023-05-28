package com.stupin.spring.library.service;

import java.util.List;

import com.stupin.spring.library.dto.BookDTO;
import com.stupin.spring.library.entity.Book;

public interface BookService {

	boolean isBookInLibrary(String googleId);
	
	List<BookDTO> searchBookList(String searchText, int pageNo, int resultsPerPage);
	
	int searchBooksResultsCount(String searchText);
	
	int searchBookPagesCount(String searchText, int resultsPerPage);
	
	BookDTO getBookDTOById(int id);
	
	Book saveBook(BookDTO bookDTO, String changedByUsername);
	
}
