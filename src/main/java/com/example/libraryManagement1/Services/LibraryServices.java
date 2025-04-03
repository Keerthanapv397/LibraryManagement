package com.example.libraryManagement1.Services;

import com.example.libraryManagement1.Model.Books;
import com.example.libraryManagement1.Repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryServices {

    @Autowired
    private LibraryRepository libraryrepo;




    public List<Books> getAllBooks(){

        return libraryrepo.findAll();
    }

    public Books addBook(Books book){
        return libraryrepo.save(book);
    }


}
