package com.nestdigital.librarybackend.Controller;

import com.nestdigital.librarybackend.Dao.LibraryDao;
import com.nestdigital.librarybackend.Model.LibraryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LibraryController {
    @Autowired
    private LibraryDao dao;
    @CrossOrigin(origins = "*")
    @PostMapping(path="/addbook",consumes = "application/json",produces = "application/json")
    public  String addBook(@RequestBody LibraryModel library){
        dao.save(library);
        return "{status:'success'}";
    }
    @GetMapping("/viewbook")
    public List<LibraryModel> viewBook(){
        return(List<LibraryModel>) dao.findAll();
    }

}
