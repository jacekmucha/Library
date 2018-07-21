package pl.sda.controller.Launcher;

import pl.sda.controller.controller.AuthorController;
import java.io.IOException;

public class Launcher {

    public static void main(String[] args) throws IOException {

        AuthorController authorController = new AuthorController();
        authorController.createNewAuthor("Jan", "Kowal", "Nowa Wieś", "Nowy autor");
        authorController.createNewAuthor("Marian", "Kowal", "Nowa Wieś", "Nowy autor");
        authorController.createNewAuthor("Stanisław", "Kowal", "Nowa Wieś", "Nowy autor");
        authorController.createNewAuthor("Marek", "Kowal", "Nowa Wieś", "Nowy autor");



    }

}
