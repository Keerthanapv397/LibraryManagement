package com.example.libraryManagement1.Controller;


import com.example.libraryManagement1.Model.Books;
import com.example.libraryManagement1.Services.LibraryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LibraryController {

    @Autowired
    private LibraryServices libraryservices;

    @GetMapping("/books")
    public List<Books> getAllBooks(){

        return libraryservices.getAllBooks();
    }

    @PostMapping("/books")
    public String addBook(@RequestBody Books book){

        Books bookValue=libraryservices.addBook(book);
        if(bookValue.equals(book)){

            return "Book added to the library";
        }
        else{
            return "Book cannot add to the library";
        }
    }

    @GetMapping("/books")
    public String helloWorld(){
        return "Welcome world..";
    }


}
