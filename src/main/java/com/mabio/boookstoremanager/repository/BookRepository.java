package com.mabio.boookstoremanager.repository;

import com.mabio.boookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long>{

}
