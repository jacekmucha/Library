package pl.sda.controller.controller;

import pl.sda.Author;
import pl.sda.AuthorService;
import pl.sda.IAuthorService;

import java.io.IOException;

public class AuthorController {

    private IAuthorService authorService = new AuthorService();

    public void createNewAuthor(String firstName, String lastName, String placeOfBirth, String history) throws IOException {
        Author author = new Author();
        author.setFirstName(firstName);
        author.setLastName(lastName);
        author.setPlaceOfBirth(placeOfBirth);
        author.setHistory(history);
        authorService.create(author);
    }

}
