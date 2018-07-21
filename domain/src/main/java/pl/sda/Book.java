package pl.sda;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter

public class Book {


    private long id;
    private String title;
    private LocalDate releaseDate;
    private String ISBN;
    private BookCategory bookCategory;
    private int pages;
    private String description;
    private boolean isRemoved;


}
