package com.BSAO.repository;

import org.springframework.data.repository.CrudRepository;

import com.BSAO.model.Books;  
 
//repository that extends CrudRepository  
public interface BooksRepository extends CrudRepository<Books, Integer>  
{  
}  