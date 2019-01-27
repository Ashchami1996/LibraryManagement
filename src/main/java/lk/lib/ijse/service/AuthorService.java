package lk.lib.ijse.service;

import java.util.List;

import lk.lib.ijse.dto.AuthorDTO;

public interface AuthorService {
    void addAuthor(AuthorDTO authorDTO);

	List<AuthorDTO> getAllAuthors();
}
