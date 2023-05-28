package com.stupin.spring.library.service;

import java.util.List;

import com.stupin.spring.library.dto.BookDTO;
import com.stupin.spring.library.retrofit.model.ItemAPIModel;

public interface GoogleBookService {

	List<BookDTO> searchBookList(String searchText);
	
	BookDTO getSingleBook(String googleId);
}
