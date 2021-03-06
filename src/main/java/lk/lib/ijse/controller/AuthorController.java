package lk.lib.ijse.controller;

import lk.lib.ijse.dto.AuthorDTO;
import lk.lib.ijse.dto.BookDTO;
import lk.lib.ijse.service.AuthorService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Author")
@CrossOrigin(origins = "*")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @PostMapping("/add")
    public void addAuthor(@RequestBody AuthorDTO authorDTO){
        authorService.addAuthor(authorDTO);

    }

    @GetMapping("/all")
    public List<AuthorDTO> getAll(){
        return authorService.getAllAuthors();
    }


}
