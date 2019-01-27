package lk.lib.ijse.service.impl;

import lk.lib.ijse.dto.AuthorDTO;
import lk.lib.ijse.model.Author;
import lk.lib.ijse.repository.AuthorRepo;
import lk.lib.ijse.service.AuthorService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService{

    @Autowired
    private AuthorRepo authorRepo;

    @Override
    public void addAuthor(AuthorDTO authorDTO) {
        Author author=new Author(authorDTO.getAuthorId(),authorDTO.getAuthorName());
        authorRepo.save(author);
    }

	@Override
	public List<AuthorDTO> getAllAuthors() {
		// TODO Auto-generated method stub
		return null;
	}
}
