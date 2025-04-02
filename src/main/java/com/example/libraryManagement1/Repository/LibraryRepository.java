package com.example.libraryManagement1.Repository;

import com.example.libraryManagement1.Model.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryRepository extends JpaRepository<Books,Integer> {

}
