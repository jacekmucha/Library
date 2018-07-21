package pl.sda;

public enum BookCategory {

    DRAMA("drama"),
    HORROR("horror"),
    NOVEL("novel"),;

    private String text;

    BookCategory(String text) {
        this.text = text;
    }
}
